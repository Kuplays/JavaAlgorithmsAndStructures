package MathematicsProgression;

/*
class extended from Base Linear progression.
Inherits base class member variables current and first
as well as methods
 */
public class ArithmeticProgression extends LinearProgression {
    private long apIncrementValue;

    /*
    Constructor with parameter setting up the increment
    @param incrementValue Sets the inner increment value
     */
    public ArithmeticProgression(long incrementValue) {
        this.apIncrementValue = incrementValue;
    }

    /*
    default empty constructor calling up
    parametric constructor
     */
    public ArithmeticProgression() {
        this(1);
    }

    /*
    Modified base class method will be called on
    instances of this class. Increments the value of
    current progression pointer and returns it
    @return Incremented next element of the
    arithmetic progression chain.
     */
    protected long advance() {
        this.currentValue += this.apIncrementValue;
        return this.currentValue;
    }

    public long getApIncrementValue() {
        return this.apIncrementValue;
    }
}
