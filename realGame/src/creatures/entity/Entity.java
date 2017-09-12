package creatures.entity;

import creatures.Creature;
import exceptions.IllegalRaceID;
import exceptions.IllegalSubraceID;

/**
 * The {@code Enity} abstract class contains is the superclass of all
 * PlayerEntity and EnemyEnitity objects. *
 */
public abstract class Entity extends Creature {

    public int strClass = 0, strSubclass = 0;
    public int conClass = 0, conSubclass = 0;
    public int resClass = 0, resSubclass = 0;
    public int dexClass = 0, dexSubclass = 0;
    public int agiClass = 0, agiSubclass = 0;
    public int spdClass = 0, spdSubclass = 0;
    public int intClass = 0, intSubclass = 0;
    public int wisClass = 0, wisSubclass = 0;
    public int chrClass = 0, chrSubclass = 0;

    @Override
    public void updateFinalAttributes() {
        super.updateFinalAttributes();
        strFinal += 0;
        conFinal += 0;
        resFinal += 0;
        dexFinal += 0;
        agiFinal += 0;
        spdFinal += 0;
        intFinal += 0;
        wisFinal += 0;
        chrFinal += 0;

    }

    // Getters
        // Attribute Getters
    public int getStrClass() {
        return strClass;
    }

    public int getStrSubclass() {
        return strSubclass;
    }

    public int getConClass() {
        return conClass;
    }

    public int getConSubclass() {
        return conSubclass;
    }

    public int getResClass() {
        return resClass;
    }

    public int getResSubclass() {
        return resSubclass;
    }

    public int getDexClass() {
        return dexClass;
    }

    public int getDexSubclass() {
        return dexSubclass;
    }

    public int getAgiClass() {
        return agiClass;
    }

    public int getAgiSubclass() {
        return agiSubclass;
    }

    public int getSpdClass() {
        return spdClass;
    }

    public int getSpdSubclass() {
        return spdSubclass;
    }

    public int getIntClass() {
        return intClass;
    }

    public int getIntSubclass() {
        return intSubclass;
    }

    public int getWisClass() {
        return wisClass;
    }

    public int getWisSubclass() {
        return wisSubclass;
    }

    public int getChrClass() {
        return chrClass;
    }

    public int getChrSubclass() {
        return chrSubclass;
    }

    // Setters
        // Attribute Setters
    public void setStrClass(int strClass) {
        this.strClass = strClass;
    }

    public void setStrSubclass(int strSubclass) {
        this.strSubclass = strSubclass;
    }

    public void setConClass(int conClass) {
        this.conClass = conClass;
    }

    public void setConSubclass(int conSubclass) {
        this.conSubclass = conSubclass;
    }

    public void setResClass(int resClass) {
        this.resClass = resClass;
    }

    public void setResSubclass(int resSubclass) {
        this.resSubclass = resSubclass;
    }

    public void setDexClass(int dexClass) {
        this.dexClass = dexClass;
    }

    public void setDexSubclass(int dexSubclass) {
        this.dexSubclass = dexSubclass;
    }

    public void setAgiClass(int agiClass) {
        this.agiClass = agiClass;
    }

    public void setAgiSubclass(int agiSubclass) {
        this.agiSubclass = agiSubclass;
    }

    public void setSpdClass(int spdClass) {
        this.spdClass = spdClass;
    }

    public void setSpdSubclass(int spdSubclass) {
        this.spdSubclass = spdSubclass;
    }

    public void setIntClass(int intClass) {
        this.intClass = intClass;
    }

    public void setIntSubclass(int intSubclass) {
        this.intSubclass = intSubclass;
    }

    public void setWisClass(int wisClass) {
        this.wisClass = wisClass;
    }

    public void setWisSubclass(int wisSubclass) {
        this.wisSubclass = wisSubclass;
    }

    public void setChrClass(int chrClass) {
        this.chrClass = chrClass;
    }

    public void setChrSubclass(int chrSubclass) {
        this.chrSubclass = chrSubclass;
    }
}
