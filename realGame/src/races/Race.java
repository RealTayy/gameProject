package races;

public interface Race {

    String raceName = "none";
    int raceID = -1;

    String subraceName = "none";
    int subraceID = -1;

    int strRace = 0, strSubrace = 0;
    int conRace = 0, conSubrace = 0;
    int resRace = 0, resSubrace = 0;
    int dexRace = 0, dexSubrace = 0;
    int agiRace = 0, agiSubrace = 0;
    int spdRace = 0, spdSubrace = 0;
    int intRace = 0, intSubrace = 0;
    int wisRace = 0, wisSubrace = 0;
    int chrRace = 0, chrSubrace = 0;

    String getRaceName();
    int getRaceID();
    String getSubraceName();
    int getSubraceID();


    int getStrRace();
    int getConRace();
    int getResRace();
    int getDexRace();
    int getAgiRace();
    int getSpdRace();
    int getIntRace();
    int getWisRace();
    int getChrRace();

    int getStrSubrace();
    int getConSubrace();
    int getResSubrace();
    int getDexSubrace();
    int getAgiSubrace();
    int getSpdSubrace();
    int getIntSubrace();
    int getWisSubrace();
    int getChrSubrace();
}
