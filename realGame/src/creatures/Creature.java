package creatures;

import exceptions.IllegalGenderID;
import races.Race;
import races.human.subclass.Dominion;

public abstract class Creature {
    public char genderID = 'M';
    public String genderName = "Male";

    public Race race = new Dominion();

    public int level = 1;

    public int strBase = 5, strFinal = 0, strTemp = 0, strCombat = 0;
    public int conBase = 5, conFinal = 0, conTemp = 0, conCombat = 0;
    public int resBase = 5, resFinal = 0, resTemp = 0, resCombat = 0;
    public int dexBase = 5, dexFinal = 0, dexTemp = 0, dexCombat = 0;
    public int agiBase = 5, agiFinal = 0, agiTemp = 0, agiCombat = 0;
    public int spdBase = 5, spdFinal = 0, spdTemp = 0, spdCombat = 0;
    public int intBase = 5, intFinal = 0, intTemp = 0, intCombat = 0;
    public int wisBase = 5, wisFinal = 0, wisTemp = 0, wisCombat = 0;
    public int chrBase = 5, chrFinal = 0, chrTemp = 0, chrCombat = 0;

    public void updateFinalAttributes() {
        strFinal = getStrBase() + race.getStrRace() + race.getStrSubrace();
        conFinal = getConBase() + race.getConRace() + race.getConSubrace();
        resFinal = getResBase() + race.getResRace() + race.getResSubrace();
        dexFinal = getDexBase() + race.getDexRace() + race.getDexSubrace();
        agiFinal = getAgiBase() + race.getAgiRace() + race.getAgiSubrace();
        spdFinal = getSpdBase() + race.getSpdRace() + race.getSpdSubrace();
        intFinal = getIntBase() + race.getIntRace() + race.getIntSubrace();
        wisFinal = getWisBase() + race.getWisRace() + race.getWisSubrace();
        chrFinal = getChrBase() + race.getChrRace() + race.getChrSubrace();
    }

    public abstract void updateCombatAttributes();

    public void printInfo() {
        System.out.println("Printing Information for " + creatureName);
        System.out.println("------Details-------");
        System.out.println("Name:     " + getCreatureName());
        System.out.printf("Level:    %02d\n", getLevel());
        System.out.println("Gender:   " + getGenderName() + " (ID:" + getGenderID() + ")");
        System.out.println("----Race/Subrace----");
        System.out.println("Race:     " + race.getRaceName() + " (ID:" + race.getRaceID() + ")");
        System.out.println("Subrace:  " + race.getSubraceName() + " (ID:" + race.getSubraceID() + ")");
        System.out.println("-----Attributes-----");
        System.out.printf("Str: %02d | ", getStrFinal());
        System.out.printf("Dex: %02d | ", getDexFinal());
        System.out.printf("Int: %02d \n", getIntFinal());
        System.out.printf("Con: %02d | ", getConFinal());
        System.out.printf("Agi: %02d | ", getAgiFinal());
        System.out.printf("Wis: %02d \n", getWisFinal());
        System.out.printf("Res: %02d | ", getResFinal());
        System.out.printf("Spd: %02d | ", getSpdFinal());
        System.out.printf("Chr: %02d \n", getChrFinal());
        System.out.println("-----Equipment------");
        System.out.println("-----Inventory------");
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

    public int getResBase() {
        return resBase;
    }

    public int getResFinal() {
        return resFinal;
    }

    public int getResTemp() {
        return resTemp;
    }

    public int getResCombat() {
        return resCombat;
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

    public int getAgiBase() {
        return agiBase;
    }

    public int getAgiFinal() {
        return agiFinal;
    }

    public int getAgiTemp() {
        return agiTemp;
    }

    public int getAgiCombat() {
        return agiCombat;
    }

    public int getSpdBase() {
        return spdBase;
    }

    public int getSpdFinal() {
        return spdFinal;
    }

    public int getSpdTemp() {
        return spdTemp;
    }

    public int getSpdCombat() {
        return spdCombat;
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

    public int getWisBase() {
        return wisBase;
    }

    public int getWisFinal() {
        return wisFinal;
    }

    public int getWisTemp() {
        return wisTemp;
    }

    public int getWisCombat() {
        return wisCombat;
    }

    public int getChrBase() {
        return chrBase;
    }

    public int getChrFinal() {
        return chrFinal;
    }

    public int getChrTemp() {
        return chrTemp;
    }

    public int getChrCombat() {
        return chrCombat;
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

    public void setResBase(int resBase) {
        this.resBase = resBase;
    }

    public void setResFinal(int resFinal) {
        this.resFinal = resFinal;
    }

    public void setResTemp(int resTemp) {
        this.resTemp = resTemp;
    }

    public void setResCombat(int resCombat) {
        this.resCombat = resCombat;
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

    public void setAgiBase(int agiBase) {
        this.agiBase = agiBase;
    }

    public void setAgiFinal(int agiFinal) {
        this.agiFinal = agiFinal;
    }

    public void setAgiTemp(int agiTemp) {
        this.agiTemp = agiTemp;
    }

    public void setAgiCombat(int agiCombat) {
        this.agiCombat = agiCombat;
    }

    public void setSpdBase(int spdBase) {
        this.spdBase = spdBase;
    }

    public void setSpdFinal(int spdFinal) {
        this.spdFinal = spdFinal;
    }

    public void setSpdTemp(int spdTemp) {
        this.spdTemp = spdTemp;
    }

    public void setSpdCombat(int spdCombat) {
        this.spdCombat = spdCombat;
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

    public void setWisBase(int wisBase) {
        this.wisBase = wisBase;
    }

    public void setWisFinal(int wisFinal) {
        this.wisFinal = wisFinal;
    }

    public void setWisTemp(int wisTemp) {
        this.wisTemp = wisTemp;
    }

    public void setWisCombat(int wisCombat) {
        this.wisCombat = wisCombat;
    }

    public void setChrBase(int chrBase) {
        this.chrBase = chrBase;
    }

    public void setChrFinal(int chrFinal) {
        this.chrFinal = chrFinal;
    }

    public void setChrTemp(int chrTemp) {
        this.chrTemp = chrTemp;
    }

    public void setChrCombat(int chrCombat) {
        this.chrCombat = chrCombat;
    }

    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    /**
     * Takes given genderID and sets the genderID and genderName to the correct gender
     * throws IllegalGenderIF if entered genderID is not valid
     *      Current Genders:
     *      > (M) Male
     *      > (F) Female
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
            } else if (genderID == 'F'){
                this.genderName = ("Female");
            }
        }
    }

    /**
     * Takes given genderName and sets the genderName and genderID to the correct gender
     * throws IllegalGenderIF if entered genderName is not valid
     *      Current Genders:
     *      > Male (M)
     *      > Female (F)
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
}
