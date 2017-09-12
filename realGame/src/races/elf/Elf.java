package races.elf;

import races.Race;

public abstract class Elf implements Race {
    final String subRaceName = "Elf";
    final int subRaceID = 2;

    final int strSubrace = 0;
    final int conSubrace = 0;
    final int resSubrace = 0;
    final int dexSubrace = 0;
    final int agiSubrace = 0;
    final int spdSubrace = 0;
    final int intSubrace = 0;
    final int wisSubrace = 0;
    final int chrSubrace = 0;

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
        return subRaceName;
    }

    public int getRaceID() {
        return subRaceID;
    }

    // Setters
}
