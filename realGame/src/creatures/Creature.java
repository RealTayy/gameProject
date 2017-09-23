package creatures;

import exceptions.IllegalGenderID;
import exceptions.IllegalSubRaceID;
import races.Race;
import races.elf.subclass.Chosen;
import races.elf.subclass.Wood;
import races.human.subclass.Dominion;
import races.human.subclass.Untargot;

/**
 * The {@code Creature} is a main Superclass of all types of creatures in the game.
 * This is where a Creature's Race and SubRace is determined
 */

public abstract class Creature {
    public char genderID = 'M';
    public String genderName = "Male";

    //A Creature race is determined by setting variable {race} to a subRace class. See method {setRace} for more details
    public Race race = new Dominion();

    public int level = 1;

    public int strBase = 1, strFinal = 0, strTemp = 0, strCombat = 0;
    public int conBase = 1, conFinal = 0, conTemp = 0, conCombat = 0;
    public int dexBase = 1, dexFinal = 0, dexTemp = 0, dexCombat = 0;
    public int focBase = 1, focFinal = 0, focTemp = 0, focCombat = 0;
    public int intBase = 1, intFinal = 0, intTemp = 0, intCombat = 0;
    public int witBase = 1, witFinal = 0, witTemp = 0, witCombat = 0;

    /**
     * updateFinalAttribute inside of {@Creature} is the base method in which a creature's
     * final stats are calculated.
     * <p>
     * This method sets atrFinal to the sum of the following:
     * +atrBase     {@Creature}
     * +atrRace     {@Creature}
     * +atrSubrace  {@Creature}
     */
    public void updateFinalAttributes() {
        strFinal = getStrBase() + race.getStrRace() + race.getStrSubrace();
        conFinal = getConBase() + race.getConRace() + race.getConSubrace();
        dexFinal = getDexBase() + race.getDexRace() + race.getDexSubrace();
        focFinal = getFocBase() + race.getFocRace() + race.getFocSubrace();
        intFinal = getIntBase() + race.getIntRace() + race.getIntSubrace();
        witFinal = getWitBase() + race.getWitRace() + race.getWitSubrace();
    }

    public abstract void updateCombatAttributes();

    public void printInfo() {
        System.out.println("Printing Information for " + creatureName);
        System.out.println("------Details-------");
        System.out.println("Name:     " + getCreatureName());
        System.out.printf("Level:    %02d\n", getLevel());
        System.out.println("Gender:   " + getGenderName() + " (ID:" + getGenderID() + ")");
        System.out.println("----Race/SubRace----");
        System.out.println("Race:     " + race.getRaceName() + " (ID:" + race.getRaceID() + ")");
        System.out.println("SubRace:  " + race.getSubraceName() + " (ID:" + race.getSubraceID() + ")");
        System.out.println("-----Attributes-----");
        System.out.printf("Str: %02d | ", getStrFinal());
        System.out.printf("Con: %02d \n", getConFinal());
        System.out.printf("Dex: %02d | ", getDexFinal());
        System.out.printf("Foc: %02d \n", getFocFinal());
        System.out.printf("Int: %02d | ", getIntFinal());
        System.out.printf("Wit: %02d \n", getWitFinal());
    }

    public String creatureName = "none";

    // Getters
    //Attribute Getters
    public int getStrBase() {
        return strBase;
    }

    public int getStrFinal() {
        return strFinal;
    }

    public int getStrTemp() {
        return strTemp;
    }

    public int getStrCombat() {
        return strCombat;
    }

    public int getConBase() {
        return conBase;
    }

    public int getConFinal() {
        return conFinal;
    }

    public int getConTemp() {
        return conTemp;
    }

    public int getConCombat() {
        return conCombat;
    }

    public int getDexBase() {
        return dexBase;
    }

    public int getDexFinal() {
        return dexFinal;
    }

    public int getDexTemp() {
        return dexTemp;
    }

    public int getDexCombat() {
        return dexCombat;
    }

    public int getFocBase() {
        return focBase;
    }

    public int getFocFinal() {
        return focFinal;
    }

    public int getFocTemp() {
        return focTemp;
    }

    public int getFocCombat() {
        return focCombat;
    }

    public int getIntBase() {
        return intBase;
    }

    public int getIntFinal() {
        return intFinal;
    }

    public int getIntTemp() {
        return intTemp;
    }

    public int getIntCombat() {
        return intCombat;
    }

    public int getWitBase() {
        return witBase;
    }

    public int getWitFinal() {
        return witFinal;
    }

    public int getWitTemp() {
        return witTemp;
    }

    public int getWitCombat() {
        return witCombat;
    }

    public String getCreatureName() {
        return creatureName;
    }

    public char getGenderID() {
        return genderID;
    }

    public String getGenderName() {
        return genderName;
    }

    public int getLevel() {
        return level;
    }

    public Race getRace() {
        return race;
    }

    // Setters
    //Attribute Setters
    public void setStrBase(int strBase) {
        this.strBase = strBase;
    }

    public void setStrFinal(int strFinal) {
        this.strFinal = strFinal;
    }

    public void setStrTemp(int strTemp) {
        this.strTemp = strTemp;
    }

    public void setStrCombat(int strCombat) {
        this.strCombat = strCombat;
    }

    public void setConBase(int conBase) {
        this.conBase = conBase;
    }

    public void setConFinal(int conFinal) {
        this.conFinal = conFinal;
    }

    public void setConTemp(int conTemp) {
        this.conTemp = conTemp;
    }

    public void setConCombat(int conCombat) {
        this.conCombat = conCombat;
    }

    public void setDexBase(int dexBase) {
        this.dexBase = dexBase;
    }

    public void setDexFinal(int dexFinal) {
        this.dexFinal = dexFinal;
    }

    public void setDexTemp(int dexTemp) {
        this.dexTemp = dexTemp;
    }

    public void setDexCombat(int dexCombat) {
        this.dexCombat = dexCombat;
    }

    public void setFocBase(int focBase) {
        this.focBase = focBase;
    }

    public void setFocFinal(int focFinal) {
        this.focFinal = focFinal;
    }

    public void setFocTemp(int focTemp) {
        this.focTemp = focTemp;
    }

    public void setFocCombat(int focCombat) {
        this.focCombat = focCombat;
    }

    public void setIntBase(int intBase) {
        this.intBase = intBase;
    }

    public void setIntFinal(int intFinal) {
        this.intFinal = intFinal;
    }

    public void setIntTemp(int intTemp) {
        this.intTemp = intTemp;
    }

    public void setIntCombat(int intCombat) {
        this.intCombat = intCombat;
    }

    public void setWitBase(int witBase) {
        this.witBase = witBase;
    }

    public void setWitFinal(int witFinal) {
        this.witFinal = witFinal;
    }

    public void setWitTemp(int witTemp) {
        this.witTemp = witTemp;
    }

    public void setWitCombat(int witCombat) {
        this.witCombat = witCombat;
    }

    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    /**
     * Takes given genderID and sets the genderID and genderName to the correct gender
     * throws IllegalGenderIF if entered genderID is not valid
     * Current Genders:
     * > (M) Male
     * > (F) Female
     *
     * @param genderID
     * @throws IllegalGenderID if not valid genderIF
     */
    public void setGenderID(char genderID) {
        if (genderID != 'M' & genderID != 'F') {
            throw new IllegalGenderID(Character.toString(genderID));
        } else {
            this.genderID = genderID;
            if (genderID == 'M') {
                this.genderName = ("Male");
            } else if (genderID == 'F') {
                this.genderName = ("Female");
            }
        }
    }

    /**
     * Takes given genderName and sets the genderName and genderID to the correct gender
     * throws IllegalGenderIF if entered genderName is not valid
     * Current Genders:
     * > Male (M)
     * > Female (F)
     *
     * @param genderName
     * @throws IllegalGenderID if not valid genderIF
     */
    public void setGenderName(String genderName) {
        if (genderName != "Male" & genderName != "Female") {
            throw new IllegalGenderID(genderName);
        } else {
            this.genderName = genderName;
            if (genderName == "Male") {
                this.genderID = ('M');
            } else if (genderName == "Female") {
                this.genderID = ('F');
            }
        }
    }

    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Sets a creature.race to a specified Race instance.
     * Changes creatures's raceName/SubraceName and raceID/SubraceID to the appropriate values.
     * Changes atrRace/atrSubrace to the appropriate values
     *
     * @param subRaceID changes the above according to the subRaceID given. subRaceID values can be
     *                  found inside each subRace Class. A master list can be found in {@Race}
     */
    public void setRace(int subRaceID) {
        switch (subRaceID) {
            case 101:
                race = new Dominion();
                break;
            case 102:
                race = new Untargot();
                break;
            case 201:
                race = new Chosen();
                break;
            case 202:
                race = new Wood();
                break;
            default: throw new IllegalSubRaceID(subRaceID);
        }
    }
}
