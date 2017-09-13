package exceptions;


public class IllegalMainClassID extends RuntimeException {

    public IllegalMainClassID() {
        super();
    }

    public IllegalMainClassID(String s) {
        super(s +  " is not a recognized MainClassID");
    }

}
