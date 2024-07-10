package main.ast.node.expression.values;

import main.visitor.IVisitor;

public class NullValue extends Value {
    public NullValue() {}

    @Override
    public String toString(){
        return "NullValue";

    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
