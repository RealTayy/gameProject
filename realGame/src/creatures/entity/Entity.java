package creatures.entity;

import creatures.Creature;
import mainClass.MainClass;

/**
 * The {@code Entity} abstract class is the superclass of all
 * PlayerEntity and EnemyEntity objects.
 *
 * This is where a creature's MainClass and SubClass are determined
 */
public abstract class Entity extends Creature {

    MainClass mainClass;

    /**
     * updateFinalAttribute inside of {@Entity} is a method in which a creature's
     * final stats are calculated.
     *
     * This method sets atrFinal to the sum of the following:
     * +atrBase     {@Creature}
     * +atrRace     {@Creature}
     * +atrSubrace  {@Creature}
     * +atrMainClass{@Enity}
     * +atrSubClass {@Enity}
     */
    @Override
    public void updateFinalAttributes() {
        super.updateFinalAttributes();
        strFinal += mainClass.getStrMainClass() + mainClass.getStrSubClass();
        conFinal += mainClass.getConMainClass() + mainClass.getConSubClass();
        defFinal += mainClass.getDefMainClass() + mainClass.getDefSubClass();
        dexFinal += mainClass.getDexMainClass() + mainClass.getDexSubClass();
        agiFinal += mainClass.getAgiMainClass() + mainClass.getAgiSubClass();
        focFinal += mainClass.getFocMainClass() + mainClass.getFocSubClass();
        intFinal += mainClass.getIntMainClass() + mainClass.getIntSubClass();
        wisFinal += mainClass.getWisMainClass() + mainClass.getWisSubClass();
        chrFinal += mainClass.getChrMainClass() + mainClass.getChrSubClass();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println();
        System.out.println("-MainClass/SubClass-");
    }
    // Getters

    // Setters
}
