package races.human.subclass;

import races.human.Human;

public class Untargot extends Human {
    final String subRaceName = "Untargot";
    final int subRaceID = 102;

    final int strSubRace = 0;
    final int conSubRace = 0;
    final int dexSubRace = 0;
    final int focSubRace = 0;
    final int intSubRace = 0;
    final int witSubRace = 0;

    // Getters
    //// Attribute Getters
    public int getStrSubRace() {
        return strSubRace;
    }

    public int getConSubRace() {
        return conSubRace;
    }

    public int getDexSubRace() {
        return dexSubRace;
    }

    public int getFocSubRace() {
        return focSubRace;
    }

    public int getIntSubRace() {
        return intSubRace;
    }

    public int getWitSubRace() {
        return witSubRace;
    }

    public String getSubraceName() {
        return subRaceName;
    }

    public int getSubraceID() {
        return subRaceID;
    }

    // Setters
}
