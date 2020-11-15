package MathematicsProgression;

/*
Base class represent linear progression. Probably move on
to BigIntegers.
 */
public class LinearProgression {
    protected long firstValue;
    protected long currentValue;

    /*
    Base constructor sets both firstValue and
    SecondValue as 0.
     */
    public LinearProgression() {
        this.firstValue = 0L;
        this.currentValue = 0L;
    }

    /*
    Resets the progression to its first
    element. Sets current value as first (thus zero)
    @return value of the first element of progression
     */
    protected long reset() {
        this.currentValue = this.firstValue;
        return this.currentValue;
    }

    /*
    advances progression by increment of one
    @return incremented value representing
    next step of progression
     */
    protected long advance() {
        return ++this.currentValue;
    }

    /*
    prints to standart output n elements of the base progression
    @param n An integer amount of elements desired
     */
    public void printProgressionSteps(int n) {
        System.out.println("PROGRESSION ELEMENTS: ");
        System.out.print(reset() + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(advance() + " ");
        }
        System.out.println();
    }

    public long getCurrentValue() {
        return this.currentValue;
    }

    public long getFirstValue() {
        return this.currentValue;
    }
}
