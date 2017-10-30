package creatures.monster;

import creatures.Creature;

public class Monster extends Creature {

    // Constructors

    public Monster(int subraceID) {
        super(subraceID);
    }

    // Methods

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("----Monster Info----");
        System.out.println("Name:     " + name);

    }


}
