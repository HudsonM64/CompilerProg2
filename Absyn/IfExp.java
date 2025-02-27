package Absyn;

public class IfStmt extends Stmt {
    public Exp condition;
    public Stmt thenStmt, elseStmt;

    public IfStmt(int p, Exp c, Stmt t, Stmt e) {
        super(p);
        condition = c;
        thenStmt = t;
        elseStmt = e;
    }
}
