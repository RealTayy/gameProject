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
    int dexRace = 0, dexSubRace = 0;
    int focRace = 0, focSubRace = 0;
    int intRace = 0, intSubRace = 0;
    int witRace = 0, witSubRace = 0;



    String getRaceName();
    int getRaceID();
    String getSubraceName();
    int getSubraceID();


    int getStrRace();
    int getConRace();
    int getDexRace();
    int getFocRace();
    int getIntRace();
    int getWitRace();

    int getStrSubRace();
    int getConSubRace();
    int getDexSubRace();
    int getFocSubRace();
    int getIntSubRace();
    int getWitSubRace();

}
