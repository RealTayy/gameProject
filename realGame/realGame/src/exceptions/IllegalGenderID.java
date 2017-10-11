package exceptions;


import java.io.IOException;

public class IllegalGenderID extends RuntimeException {

    public IllegalGenderID() {
        super();
    }

    public IllegalGenderID(String s) {
        super(s +  " is not a recognized GenderID");
    }

}
