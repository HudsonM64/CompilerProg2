package Absyn;
import Symbol.Symbol;

public class VarExp extends Exp {
    public Symbol name;

    public VarExp(int p, Symbol n) {
        super(p);
        name = n;
    }
}
