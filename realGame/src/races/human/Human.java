package races.human;

import races.Race;

public abstract class Human implements Race {
    final String raceName = "Human";
    final int raceID = 1;

    final int strRace = 0;
    final int conRace = 0;
    final int resRace = 0;
    final int dexRace = 0;
    final int agiRace = 0;
    final int spdRace = 0;
    final int intRace = 0;
    final int wisRace = 0;
    final int chrRace = 0;

    // Getters
    //// Attribute Getters
    public int getStrRace() {
        return strRace;
    }

    public int getConRace() {
        return conRace;
    }

    public int getResRace() {
        return resRace;
    }

    public int getDexRace() {
        return dexRace;
    }

    public int getAgiRace() {
        return agiRace;
    }

    public int getSpdRace() {
        return spdRace;
    }

    public int getIntRace() {
        return intRace;
    }

    public int getWisRace() {
        return wisRace;
    }

    public int getChrRace() {
        return chrRace;
    }

    public String getRaceName() {
        return raceName;
    }

    public int getRaceID() {
        return raceID;
    }

    // Setters
}
