package org.apache.http;

@Deprecated
public class UnsupportedHttpVersionException extends ProtocolException {
    private static final long serialVersionUID = -1348448090193107031L;

    public UnsupportedHttpVersionException(String message) {
        super(message);
    }
}
