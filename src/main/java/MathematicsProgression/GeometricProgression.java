package MathematicsProgression;

/*
Geometrical progression class extended from
Linear progression. Inherits its protected members
and methods (protected and public)
 */
public class GeometricProgression extends LinearProgression {
    private long gpBaseValue;
    private static final long GP_BASE_VALUE = 2L;

    /*
    Parametric constructor sets base as parameter
    passed, also sets first element as 1, otherwise
    it will be zero everywhere and sets current value
    as first value
    @param newBase new geometric progression base
     */
    public GeometricProgression(long newBase) {
        this.gpBaseValue = newBase;
        this.firstValue = 1;
        this.currentValue = this.firstValue;
    }


    /*
    Empty constructor which calls
    parametric by constructor chain
    with default value
     */
    public GeometricProgression() {
        this(GP_BASE_VALUE);
    }

    /*
    Morphed advance method to calculate
    next step of geometrical progression.
    @return calculated next step
     */
    protected long advance() {
        this.currentValue *= this.gpBaseValue;
        return this.currentValue;
    }

    public long getGpBaseValue() {
        return this.gpBaseValue;
    }
}
