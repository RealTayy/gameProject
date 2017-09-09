package creature.entity;

import creature.Creature;
import exceptions.IllegalRaceID;
import exceptions.IllegalSubraceID;

public abstract class Entity extends Creature {

    public int strRace = 0, strSubrace = 0, strClass = 0, strSubclass = 0;
    public int conRace = 0, conSubrace = 0, conClass = 0, conSubclass = 0;
    public int resRace = 0, resSubrace = 0, resClass = 0, resSubclass = 0;
    public int dexRace = 0, dexSubrace = 0, dexClass = 0, dexSubclass = 0;
    public int agiRace = 0, agiSubrace = 0, agiClass = 0, agiSubclass = 0;
    public int spdRace = 0, spdSubrace = 0, spdClass = 0, spdSubclass = 0;
    public int intRace = 0, intSubrace = 0, intClass = 0, intSubclass = 0;
    public int wisRace = 0, wisSubrace = 0, wisClass = 0, wisSubclass = 0;
    public int chrRace = 0, chrSubrace = 0, chrClass = 0, chrSubclass = 0;

    public void loadRace(int loadedRaceID) {
        switch (loadedRaceID) {
            case 1: // Human
                setRaceName("Human");
                setRaceID(1);
                //Enter in race attributes here
                break;

            case 2: // Elf
                setRaceName("Elf");
                setRaceID(2);
                //Enter in race attributes here
                setIntRace(getIntRace() + 1);
                break;

            default:
                throw new IllegalRaceID(loadedRaceID);

        }
    }

    public void loadSubrace(int loadedSubraceID) {
        switch (loadedSubraceID) {
            case 101: // Human Dominion
                loadRace(1);
                setSubraceName("Dominion");
                setSubraceID(loadedSubraceID);
                // Enter in race and subrace attributes here
                break;

            case 102: // Human Untargot
                loadRace(1);
                setSubraceName("Untargot");
                setSubraceID(loadedSubraceID);
                // Enter in race and subrace attributes here
                break;

            case 201: // Elf Chosen
                loadRace(2);
                setSubraceName("Dominion");
                setSubraceID(loadedSubraceID);
                // Enter in race and subrace attributes here
                break;

            case 202: // Elf Wild
                loadRace(2);
                setSubraceName("Dominion");
                setSubraceID(loadedSubraceID);
                // Enter in race and subrace attributes here
                break;

            default:
                throw new IllegalSubraceID(loadedSubraceID);
        }
    }

    // Getters
        // Attribute Getters
    public int getStrRace() {
        return strRace;
    }

    public int getStrSubrace() {
        return strSubrace;
    }

    public int getStrClass() {
        return strClass;
    }

    public int getStrSubclass() {
        return strSubclass;
    }

    public int getConRace() {
        return conRace;
    }

    public int getConSubrace() {
        return conSubrace;
    }

    public int getConClass() {
        return conClass;
    }

    public int getConSubclass() {
        return conSubclass;
    }

    public int getResRace() {
        return resRace;
    }

    public int getResSubrace() {
        return resSubrace;
    }

    public int getResClass() {
        return resClass;
    }

    public int getResSubclass() {
        return resSubclass;
    }

    public int getDexRace() {
        return dexRace;
    }

    public int getDexSubrace() {
        return dexSubrace;
    }

    public int getDexClass() {
        return dexClass;
    }

    public int getDexSubclass() {
        return dexSubclass;
    }

    public int getAgiRace() {
        return agiRace;
    }

    public int getAgiSubrace() {
        return agiSubrace;
    }

    public int getAgiClass() {
        return agiClass;
    }

    public int getAgiSubclass() {
        return agiSubclass;
    }

    public int getSpdRace() {
        return spdRace;
    }

    public int getSpdSubrace() {
        return spdSubrace;
    }

    public int getSpdClass() {
        return spdClass;
    }

    public int getSpdSubclass() {
        return spdSubclass;
    }

    public int getIntRace() {
        return intRace;
    }

    public int getIntSubrace() {
        return intSubrace;
    }

    public int getIntClass() {
        return intClass;
    }

    public int getIntSubclass() {
        return intSubclass;
    }

    public int getWisRace() {
        return wisRace;
    }

    public int getWisSubrace() {
        return wisSubrace;
    }

    public int getWisClass() {
        return wisClass;
    }

    public int getWisSubclass() {
        return wisSubclass;
    }

    public int getChrRace() {
        return chrRace;
    }

    public int getChrSubrace() {
        return chrSubrace;
    }

    public int getChrClass() {
        return chrClass;
    }

    public int getChrSubclass() {
        return chrSubclass;
    }

    // Setters
        // Attribute Setters
    public void setStrRace(int strRace) {
        this.strRace = strRace;
    }

    public void setStrSubrace(int strSubrace) {
        this.strSubrace = strSubrace;
    }

    public void setStrClass(int strClass) {
        this.strClass = strClass;
    }

    public void setStrSubclass(int strSubclass) {
        this.strSubclass = strSubclass;
    }

    public void setConRace(int conRace) {
        this.conRace = conRace;
    }

    public void setConSubrace(int conSubrace) {
        this.conSubrace = conSubrace;
    }

    public void setConClass(int conClass) {
        this.conClass = conClass;
    }

    public void setConSubclass(int conSubclass) {
        this.conSubclass = conSubclass;
    }

    public void setResRace(int resRace) {
        this.resRace = resRace;
    }

    public void setResSubrace(int resSubrace) {
        this.resSubrace = resSubrace;
    }

    public void setResClass(int resClass) {
        this.resClass = resClass;
    }

    public void setResSubclass(int resSubclass) {
        this.resSubclass = resSubclass;
    }

    public void setDexRace(int dexRace) {
        this.dexRace = dexRace;
    }

    public void setDexSubrace(int dexSubrace) {
        this.dexSubrace = dexSubrace;
    }

    public void setDexClass(int dexClass) {
        this.dexClass = dexClass;
    }

    public void setDexSubclass(int dexSubclass) {
        this.dexSubclass = dexSubclass;
    }

    public void setAgiRace(int agiRace) {
        this.agiRace = agiRace;
    }

    public void setAgiSubrace(int agiSubrace) {
        this.agiSubrace = agiSubrace;
    }

    public void setAgiClass(int agiClass) {
        this.agiClass = agiClass;
    }

    public void setAgiSubclass(int agiSubclass) {
        this.agiSubclass = agiSubclass;
    }

    public void setSpdRace(int spdRace) {
        this.spdRace = spdRace;
    }

    public void setSpdSubrace(int spdSubrace) {
        this.spdSubrace = spdSubrace;
    }

    public void setSpdClass(int spdClass) {
        this.spdClass = spdClass;
    }

    public void setSpdSubclass(int spdSubclass) {
        this.spdSubclass = spdSubclass;
    }

    public void setIntRace(int intRace) {
        this.intRace = intRace;
    }

    public void setIntSubrace(int intSubrace) {
        this.intSubrace = intSubrace;
    }

    public void setIntClass(int intClass) {
        this.intClass = intClass;
    }

    public void setIntSubclass(int intSubclass) {
        this.intSubclass = intSubclass;
    }

    public void setWisRace(int wisRace) {
        this.wisRace = wisRace;
    }

    public void setWisSubrace(int wisSubrace) {
        this.wisSubrace = wisSubrace;
    }

    public void setWisClass(int wisClass) {
        this.wisClass = wisClass;
    }

    public void setWisSubclass(int wisSubclass) {
        this.wisSubclass = wisSubclass;
    }

    public void setChrRace(int chrRace) {
        this.chrRace = chrRace;
    }

    public void setChrSubrace(int chrSubrace) {
        this.chrSubrace = chrSubrace;
    }

    public void setChrClass(int chrClass) {
        this.chrClass = chrClass;
    }

    public void setChrSubclass(int chrSubclass) {
        this.chrSubclass = chrSubclass;
    }
}
