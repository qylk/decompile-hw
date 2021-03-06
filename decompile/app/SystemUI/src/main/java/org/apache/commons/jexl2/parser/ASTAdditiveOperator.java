package org.apache.commons.jexl2.parser;

public class ASTAdditiveOperator extends JexlNode {
    public ASTAdditiveOperator(int id) {
        super(id);
    }

    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
