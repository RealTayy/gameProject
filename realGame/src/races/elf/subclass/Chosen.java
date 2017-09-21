package races.elf.subclass;

import races.Race;
import races.elf.Elf;

public class Chosen extends Elf implements Race {
    final String subRaceName = "Wood";
    final int subRaceID = 202;

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
