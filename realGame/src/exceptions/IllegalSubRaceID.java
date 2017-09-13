package exceptions;

public class IllegalSubRaceID extends RuntimeException {

    public IllegalSubRaceID() {
        super();
    }

    public IllegalSubRaceID(int s) {
        super(Integer.toString(s) +  " is not a recognized SubraceID");
    }

}
