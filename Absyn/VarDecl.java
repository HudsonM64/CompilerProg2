package Absyn;
import Symbol.Symbol;

public class VarDecl extends Absyn {
    public Type type;
    public Symbol name;

    public VarDecl(int p, Type t, Symbol n) {
        super(p);
        type = t;
        name = n;
    }
}
