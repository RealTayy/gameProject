package exceptions;

public class OutOfRange extends RuntimeException {

    public OutOfRange() {
        super("Input is out of range");
    }

    public OutOfRange(int input, int lowerBound, int upperBound) {
        super(input + " is out of the range [" + lowerBound + "-" + upperBound + "]");
    }

    public OutOfRange(double input, double lowerBound, double upperBound) {
        super(input + " is out of the range [" + lowerBound + "-" + upperBound + "]");

    }
}
