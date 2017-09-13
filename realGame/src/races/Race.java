package races;

public interface Race {
    /** Race and Subrace Master List
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

    String raceName = "none";
    int raceID = -1;

    String subRaceName = "none";
    int subRaceID = -1;

    int strRace = 0, strSubRace = 0;
    int conRace = 0, conSubRace = 0;
    int defRace = 0, defSubRace = 0;
    int dexRace = 0, dexSubRace = 0;
    int agiRace = 0, agiSubRace = 0;
    int focRace = 0, focSubRace = 0;
    int intRace = 0, intSubRace = 0;
    int wisRace = 0, wisSubRace = 0;
    int chrRace = 0, chrSubRace = 0;

    String getRaceName();
    int getRaceID();
    String getSubraceName();
    int getSubraceID();


    int getStrRace();
    int getConRace();
    int getDefRace();
    int getDexRace();
    int getAgiRace();
    int getFocRace();
    int getIntRace();
    int getWisRace();
    int getChrRace();

    int getStrSubRace();
    int getConSubRace();
    int getDefSubRace();
    int getDexSubRace();
    int getAgiSubRace();
    int getFocSubRace();
    int getIntSubRace();
    int getWisSubRace();
    int getChrSubRace();
}
