package races.human;

import races.Race;

public abstract class Human implements Race {
    final String raceName = "Human";
    final int raceID = 1;

    final int strRace = 0;
    final int conRace = 0;
    final int dexRace = 0;
    final int focRace = 0;
    final int intRace = 0;
    final int witRace = 0;

    // Getters
    //// Attribute Getters
    public int getStrRace() {
        return strRace;
    }

    public int getConRace() {
        return conRace;
    }

    public int getDexRace() {
        return dexRace;
    }

    public int getFocRace() {
        return focRace;
    }

    public int getIntRace() {
        return intRace;
    }

    public int getWitRace() {
        return witRace;
    }

    public String getRaceName() {
        return raceName;
    }

    public int getRaceID() {
        return raceID;
    }

    // Setters
}
