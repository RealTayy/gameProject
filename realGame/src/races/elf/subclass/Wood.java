package races.elf.subclass;

import races.Race;
import races.elf.Elf;

public class Wood extends Elf implements Race {
    final String subRaceName = "Wood";
    final int subRaceID = 202;

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
    public int getStrSubrace() {
        return strSubrace;
    }

    public int getConSubrace() {
        return conSubrace;
    }

    public int getResSubrace() {
        return resSubrace;
    }

    public int getDexSubrace() {
        return dexSubrace;
    }

    public int getAgiSubrace() {
        return agiSubrace;
    }

    public int getSpdSubrace() {
        return spdSubrace;
    }

    public int getIntSubrace() {
        return intSubrace;
    }

    public int getWisSubrace() {
        return wisSubrace;
    }

    public int getChrSubrace() {
        return chrSubrace;
    }

    public String getSubraceName() {
        return subRaceName;
    }

    public int getSubraceID() {
        return subRaceID;
    }

    // Setters
}
