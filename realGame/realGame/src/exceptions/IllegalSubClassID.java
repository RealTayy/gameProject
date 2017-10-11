package exceptions;


public class IllegalSubClassID extends RuntimeException {

    public IllegalSubClassID() {
        super();
    }

    public IllegalSubClassID(String s) {
        super(s +  " is not a recognized SubClassID");
    }

}
