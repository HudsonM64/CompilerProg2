package Absyn;
import Symbol.Symbol;

public class FunctionDecl extends Absyn {
    public Type returnType;
    public Symbol name;
    public ParamList params;
    public StmtList body;

    public FunctionDecl(int p, Type t, Symbol n, ParamList pl, StmtList b) {
        super(p);
        returnType = t;
        name = n;
        params = pl;
        body = b;
    }
}
