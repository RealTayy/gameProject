package races;

import exceptions.OutOfRange;

import java.util.Random;

/**
 * The {@Race} Abstract class contains all the pointers and variables for all Race instances
 * These include:
 * >Race ID & Names
 * >Race Attributes
 * >Race Skills
 * >Subrace ID & Names
 * >Subrace Attributes
 * >Subrace Skills
 */

public abstract class Race {
    /**
     * Race and Subrace Master List
     * Race ID master list:
     * 1    Human
     * 2    Elf
     *
     * Subrace ID masterList
     * 101  Dominion    (Human)
     * 102  Untargot    (Human)
     * 201  Chosen      (Elf)
     * 202  Wood        (Elf)
     */

    public String raceName = "none";
    public int raceID = -1;

    public String subraceName = "none";
    public int subraceID = -1;

    public int strRace = 0, strSubrace = 0;
    public int conRace = 0, conSubrace = 0;
    public int dexRace = 0, dexSubrace = 0;
    public int focRace = 0, focSubrace = 0;
    public int intRace = 0, intSubrace = 0;
    public int witRace = 0, witSubrace = 0;

    public int skillAthRace = 0, skillAthSubrace = 0;
    public int skillEndRace = 0, skillEndSubrace = 0;
    public int skillSurRace = 0, skillSurSubrace = 0;
    public int skillPerRace = 0, skillPerSubrace = 0;
    public int skillResRace = 0, skillResSubrace = 0;
    public int skillRefRace = 0, skillRefSubrace = 0;
    public int skillInsRace = 0, skillInsSubrace = 0;
    public int skillKnoRace = 0, skillKnoSubrace = 0;
    public int skillChaRace = 0, skillChaSubrace = 0;

    final int lowerRaceRange = 0;
    final int upperRaceRange = 10;

    final int lowerSubraceRange = 0;
    final int upperSubraceRange = 10;

    public int genRandomSkillRange(int base) {
        if (base < 0 || base > 10) {
            throw new OutOfRange(base, 0, 10);
        }
        int variance = 2;
        int upperBound = (base + variance > 10) ? 10 : base + variance;
        int lowerBound = (base - variance < 0) ? 0 : base - variance;
        int range = upperBound - lowerBound;

        Random rand = new Random();
        return rand.nextInt(range + 1) + lowerBound;
    }

    public int genRandomAttributeRange(int base) {
        if (base < 0 || base > 5) {
            throw new OutOfRange(base, 0, 5);
        }
        int variance = 2;
        int upperBound = (base + variance > 5) ? 5 : base + variance;
        int lowerBound = (base - variance < 0) ? 0 : base - variance;
        int range = upperBound - lowerBound;

        Random rand = new Random();
        return rand.nextInt(range + 1) + lowerBound;
    }











    // Getters
    // Attribute Getters
    public int getStrRace() {
        return strRace;
    }

    public int getStrSubrace() {
        return strSubrace;
    }

    public int getConRace() {
        return conRace;
    }

    public int getConSubrace() {
        return conSubrace;
    }

    public int getDexRace() {
        return dexRace;
    }

    public int getDexSubrace() {
        return dexSubrace;
    }

    public int getFocRace() {
        return focRace;
    }

    public int getFocSubrace() {
        return focSubrace;
    }

    public int getIntRace() {
        return intRace;
    }

    public int getIntSubrace() {
        return intSubrace;
    }

    public int getWitRace() {
        return witRace;
    }

    public int getWitSubrace() {
        return witSubrace;
    }

    // Skill Getters
    public int getSkillAthRace() {
        return skillAthRace;
    }

    public int getSkillEndRace() {
        return skillEndRace;
    }

    public int getSkillSurRace() {
        return skillSurRace;
    }

    public int getSkillPerRace() {
        return skillPerRace;
    }

    public int getSkillResRace() {
        return skillResRace;
    }

    public int getSkillRefRace() {
        return skillRefRace;
    }

    public int getSkillInsRace() {
        return skillInsRace;
    }

    public int getSkillKnoRace() {
        return skillKnoRace;
    }

    public int getSkillChaRace() {
        return skillChaRace;
    }

    public int getSkillAthSubrace() {
        return skillAthSubrace;
    }

    public int getSkillEndSubrace() {
        return skillEndSubrace;
    }

    public int getSkillSurSubrace() {
        return skillSurSubrace;
    }

    public int getSkillPerSubrace() {
        return skillPerSubrace;
    }

    public int getSkillResSubrace() {
        return skillResSubrace;
    }

    public int getSkillRefSubrace() {
        return skillRefSubrace;
    }

    public int getSkillInsSubrace() {
        return skillInsSubrace;
    }

    public int getSkillKnoSubrace() {
        return skillKnoSubrace;
    }

    public int getSkillChaSubrace() {
        return skillChaSubrace;
    }

    // Other Getters
    public String getRaceName() {
        return raceName;
    }

    public int getRaceID() {
        return raceID;
    }

    public String getSubraceName() {
        return subraceName;
    }

    public int getSubraceID() {
        return subraceID;
    }


    // Setters
    // Attribute Setters
    public void setStrRace(int strRace) {
        this.strRace = strRace;
    }

    public void setStrSubrace(int strSubrace) {
        this.strSubrace = strSubrace;
    }

    public void setConRace(int conRace) {
        this.conRace = conRace;
    }

    public void setConSubrace(int conSubrace) {
        this.conSubrace = conSubrace;
    }

    public void setDexRace(int dexRace) {
        this.dexRace = dexRace;
    }

    public void setDexSubrace(int dexSubrace) {
        this.dexSubrace = dexSubrace;
    }

    public void setFocRace(int focRace) {
        this.focRace = focRace;
    }

    public void setFocSubrace(int focSubrace) {
        this.focSubrace = focSubrace;
    }

    public void setIntRace(int intRace) {
        this.intRace = intRace;
    }

    public void setIntSubrace(int intSubrace) {
        this.intSubrace = intSubrace;
    }

    public void setWitRace(int witRace) {
        this.witRace = witRace;
    }

    public void setWitSubrace(int witSubrace) {
        this.witSubrace = witSubrace;
    }

    //Skill Setters
    public void setSkillAthRace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillAthRace = n;
        } else {
            throw new OutOfRange(n, lowerRaceRange, upperRaceRange);
        }
    }

    public void setSkillEndRace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillEndRace = n;
        } else {
            throw new OutOfRange(n, lowerRaceRange, upperRaceRange);
        }
    }

    public void setSkillSurRace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillSurRace = n;
        } else {
            throw new OutOfRange(n, lowerRaceRange, upperRaceRange);
        }
    }

    public void setSkillPerRace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillPerRace = n;
        } else {
            throw new OutOfRange(n, lowerRaceRange, upperRaceRange);
        }
    }

    public void setSkillResRace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillResRace = n;
        } else {
            throw new OutOfRange(n, lowerRaceRange, upperRaceRange);
        }
    }

    public void setSkillRefRace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillRefRace = n;
        } else {
            throw new OutOfRange(n, lowerRaceRange, upperRaceRange);
        }
    }

    public void setSkillInsRace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillInsRace = n;
        } else {
            throw new OutOfRange(n, lowerRaceRange, upperRaceRange);
        }
    }

    public void setSkillKnoRace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillKnoRace = n;
        } else {
            throw new OutOfRange(n, lowerRaceRange, upperRaceRange);
        }
    }

    public void setSkillChaRace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillChaRace = n;
        } else {
            throw new OutOfRange(n, lowerRaceRange, upperRaceRange);
        }
    }

    public void setSkillAthSubrace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillAthSubrace = n;
        } else {
            throw new OutOfRange(n, lowerSubraceRange, upperSubraceRange);
        }
    }

    public void setSkillEndSubrace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillEndSubrace = n;
        } else {
            throw new OutOfRange(n, lowerSubraceRange, upperSubraceRange);
        }
    }

    public void setSkillSurSubrace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillSurSubrace = n;
        } else {
            throw new OutOfRange(n, lowerSubraceRange, upperSubraceRange);
        }
    }

    public void setSkillPerSubrace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillPerSubrace = n;
        } else {
            throw new OutOfRange(n, lowerSubraceRange, upperSubraceRange);
        }
    }

    public void setSkillResSubrace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillResSubrace = n;
        } else {
            throw new OutOfRange(n, lowerSubraceRange, upperSubraceRange);
        }
    }

    public void setSkillRefSubrace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillRefSubrace = n;
        } else {
            throw new OutOfRange(n, lowerSubraceRange, upperSubraceRange);
        }
    }

    public void setSkillInsSubrace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillInsSubrace = n;
        } else {
            throw new OutOfRange(n, lowerSubraceRange, upperSubraceRange);
        }
    }

    public void setSkillKnoSubrace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillKnoSubrace = n;
        } else {
            throw new OutOfRange(n, lowerSubraceRange, upperSubraceRange);
        }
    }

    public void setSkillChaSubrace(int n) {
        if (n >= lowerRaceRange & n <= upperRaceRange) {
            this.skillChaSubrace = n;
        } else {
            throw new OutOfRange(n, lowerSubraceRange, upperSubraceRange);
        }
    }

    // Other Setters
    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public void setRaceID(int raceID) {
        this.raceID = raceID;
    }

    public void setSubraceName(String subraceName) {
        this.subraceName = subraceName;
    }

    public void setSubraceID(int subraceID) {
        this.subraceID = subraceID;
    }


}
