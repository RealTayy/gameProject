package creatures.entity.player;

import creatures.entity.Entity;


public class PlayerEntity extends Entity {

    public int strPoints = 0;
    public int conPoints = 0;
    public int resPoints = 0;
    public int dexPoints = 0;
    public int agiPoints = 0;
    public int spdPoints = 0;
    public int intPoints = 0;
    public int wisPoints = 0;
    public int chrPoints = 0;

    public PlayerEntity() {
        updateFinalAttributes();
    }

    @Override
    public void updateFinalAttributes() {
        super.updateFinalAttributes();
        strFinal += getStrPoints();
        conFinal += getStrPoints();
        resFinal += getStrPoints();
        dexFinal += getStrPoints();
        agiFinal += getStrPoints();
        spdFinal += getStrPoints();
        intFinal += getStrPoints();
        wisFinal += getStrPoints();
        chrFinal += getStrPoints();

    }

    @Override
    public void updateCombatAttributes() {

    }

    // Getters
        //Attribute Getters
    public int getStrPoints() {
        return strPoints;
    }

    public int getConPoints() {
        return conPoints;
    }

    public int getResPoints() {
        return resPoints;
    }

    public int getDexPoints() {
        return dexPoints;
    }

    public int getAgiPoints() {
        return agiPoints;
    }

    public int getSpdPoints() {
        return spdPoints;
    }

    public int getIntPoints() {
        return intPoints;
    }

    public int getWisPoints() {
        return wisPoints;
    }

    public int getChrPoints() {
        return chrPoints;
    }

    // Setters
        //Attribute Setters
    public void setStrPoints(int strPoints) {
        this.strPoints = strPoints;
    }

    public void setConPoints(int conPoints) {
        this.conPoints = conPoints;
    }

    public void setResPoints(int resPoints) {
        this.resPoints = resPoints;
    }

    public void setDexPoints(int dexPoints) {
        this.dexPoints = dexPoints;
    }

    public void setAgiPoints(int agiPoints) {
        this.agiPoints = agiPoints;
    }

    public void setSpdPoints(int spdPoints) {
        this.spdPoints = spdPoints;
    }

    public void setIntPoints(int intPoints) {
        this.intPoints = intPoints;
    }

    public void setWisPoints(int wisPoints) {
        this.wisPoints = wisPoints;
    }

    public void setChrPoints(int chrPoints) {
        this.chrPoints = chrPoints;
    }
}
