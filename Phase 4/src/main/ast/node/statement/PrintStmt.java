package main.ast.node.statement;
import main.ast.node.expression.Expression;
import main.visitor.IVisitor;
public class PrintStmt extends Statement{
    private Expression arg;

    public PrintStmt(Expression arg) {
        this.arg = arg;
    }

    public Expression getArg() {
        return arg;
    }

    public void setArg(Expression arg) {
        this.arg = arg;
    }

    @Override
    public String toString() {
        return "PrintStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}