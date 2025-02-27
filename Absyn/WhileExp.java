package Absyn;

public class WhileStmt extends Stmt {
    public Exp condition;
    public Stmt body;

    public WhileStmt(int p, Exp c, Stmt b) {
        super(p);
        condition = c;
        body = b;
    }
}
