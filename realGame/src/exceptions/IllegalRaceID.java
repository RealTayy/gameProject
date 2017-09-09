package exceptions;


public class IllegalRaceID extends RuntimeException {

    public IllegalRaceID() {
        super();
    }

    public IllegalRaceID(int s) {
        super(Integer.toString(s) +  " is not a recognized SubraceID");
    }

}
