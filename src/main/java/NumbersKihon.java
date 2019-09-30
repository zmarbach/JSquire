import framework.NumbersKihonBase;

public class NumbersKihon extends NumbersKihonBase {
    @Override
    protected int returnTheMaximumValueOfInt() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected int returnTheMinimumValueOfInt() {
        ;
    }

    @Override
    protected int returnTheRemainderOfADividedByB(int a, int b) {
    return a % b;
    }

    @Override
    protected double returnTheMaximumValueOfDouble() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected double returnTheMinimumValueOfDouble() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected boolean returnTrueIfAIsNotANumber(double a) {
    return Double.isNaN(a);
    }

    @Override
    protected boolean returnTrueIfAIsAnInfinite(double a) {
    return Double.isInfinite(a);
    }
}
