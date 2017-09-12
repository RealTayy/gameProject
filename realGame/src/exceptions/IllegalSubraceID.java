package exceptions;

public class IllegalSubraceID extends RuntimeException {

    public IllegalSubraceID() {
        super();
    }

    public IllegalSubraceID(int s) {
        super(Integer.toString(s) +  " is not a recognized SubraceID");
    }

}
