package Absyn;

public class IntExp extends Exp {
    public int value;

    public IntExp(int p, int v) {
        super(p);
        value = v;
    }
}
