package MathematicsProgression;

/*
Non recursive fibonacci generator class
extended from base LinearProgression class.
 */
public class FibonacciProgression extends LinearProgression{
    private long previousValue;

    /*
    Parametric constructor sets first and previous
    values
    @param valueOne sets firstValue
    @param valueTwo sets previousValue as difference
    between valueTwo and valueOne
     */
    public FibonacciProgression(long valueOne, long valueTwo) {
        this.firstValue = valueOne;
        this.previousValue = valueTwo - valueOne;
    }

    /*
    Empty constructor calls parametric
    constructor by the constructor chain
     */
    public FibonacciProgression() {
        this(0, 1);
    }

    /*
    calculates next step using an overriden
    method
    @return next step of fibonacci sequence
     */
    protected long advance() {
        long localPrevious = this.previousValue;
        this.previousValue = this.currentValue;
        this.currentValue += localPrevious;

        return this.currentValue;
    }

    public long getPreviousValue() {
        return this.previousValue;
    }
}
