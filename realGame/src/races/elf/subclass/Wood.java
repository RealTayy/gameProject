package races.elf.subclass;

import races.Race;
import races.elf.Elf;

public class Wood extends Elf implements Race {
    final String subRaceName = "Wood";
    final int subRaceID = 202;

    int strSubRace = 0;
    int conSubRace = 0;
    int defSubRace = 0;
    int dexSubRace = 0;
    int agiSubRace = 0;
    int focSubRace = 0;
    int intSubRace = 0;
    int wisSubRace = 0;
    int chrSubRace = 0;

    // Getters
    //// Attribute Getters
    public int getStrSubRace() {
        return strSubRace;
    }

    public int getConSubRace() {
        return conSubRace;
    }

    public int getDefSubRace() {
        return defSubRace;
    }

    public int getDexSubRace() {
        return dexSubRace;
    }

    public int getAgiSubRace() {
        return agiSubRace;
    }

    public int getFocSubRace() {
        return focSubRace;
    }

    public int getIntSubRace() {
        return intSubRace;
    }

    public int getWisSubRace() {
        return wisSubRace;
    }

    public int getChrSubRace() {
        return chrSubRace;
    }

    public String getSubraceName() {
        return subRaceName;
    }

    public int getSubraceID() {
        return subRaceID;
    }

    // Setters
}
