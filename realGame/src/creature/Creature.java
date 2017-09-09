package creature;

/**
 * Created by Tay on 9/9/2017.
 */
public abstract class Creature {
    public String raceName = "none";
    public int raceID = -1;

    public String subraceName = "none";
    public int subraceID = -1;

    public int strBase = 5, strFinal = 5, strTemp = 0, strCombat = 0;
    public int conBase = 5, conFinal = 5, conTemp = 0, conCombat = 0;
    public int resBase = 5, resFinal = 5, resTemp = 0, resCombat = 0;
    public int dexBase = 5, dexFinal = 5, dexTemp = 0, dexCombat = 0;
    public int agiBase = 5, agiFinal = 5, agiTemp = 0, agiCombat = 0;
    public int spdBase = 5, spdFinal = 5, spdTemp = 0, spdCombat = 0;
    public int intBase = 5, intFinal = 5, intTemp = 0, intCombat = 0;
    public int wisBase = 5, wisFinal = 5, wisTemp = 0, wisCombat = 0;
    public int chrBase = 5, chrFinal = 5, chrTemp = 0, chrCombat = 0;

    public abstract void updateFinalAttributes();

    public abstract void updateCombatAttributes();

    public void printInfo() {
        System.out.println("Printing Information for " + "REPLACE THIS WITH NAME");
        System.out.println("-----Statistics-----");
        System.out.println("Level: " + getCreatureName());
        System.out.println("----Race/Subrace----");
        System.out.println("Race: \t\t" + getRaceName() + " (ID:" + getRaceID() + ")");
        System.out.println("Subrace: \t" + getSubraceName() + " (ID:" + getSubraceID() + ")");
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

    public String getRaceName() {
        return raceName;
    }

    public int getRaceID() {
        return raceID;
    }

    public String getSubraceName() {
        return subraceName;
    }

    public int getSubraceID() {
        return subraceID;
    }

    public String getCreatureName() {
        return creatureName;
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

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public void setRaceID(int raceID) {
        this.raceID = raceID;
    }

    public void setSubraceName(String subraceName) {
        this.subraceName = subraceName;
    }

    public void setSubraceID(int subraceID) {
        this.subraceID = subraceID;
    }

    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }
}
