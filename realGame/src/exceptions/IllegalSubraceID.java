package exceptions;

/**
 * Created by Tay on 9/8/2017.
 */
public class IllegalSubraceID extends RuntimeException {

    public IllegalSubraceID() {
        super();
    }

    public IllegalSubraceID(int s) {
        super(Integer.toString(s) +  " is not a recognized SubraceID");
    }

}
