package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.FullContainerBox;
import java.nio.ByteBuffer;

public class DataReferenceBox extends FullContainerBox {
    public DataReferenceBox() {
        super("dref");
    }

    protected long getContentSize() {
        return super.getContentSize() + 4;
    }

    public void _parseDetails(ByteBuffer content) {
        parseVersionAndFlags(content);
        content.get(new byte[4]);
        parseChildBoxes(content);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) getBoxes().size());
        writeChildBoxes(byteBuffer);
    }
}
