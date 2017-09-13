package mainClass;

public interface MainClass {
    /** MainClass and SubClass MasterList
     *
     */

    String mainClassName = "none";
    int mainClassID = -1;

    String subClassName = "none";
    int subClassID = -1;

    int strMainClass = 0, strSubClass = 0;
    int conMainClass = 0, conSubClass = 0;
    int defMainClass = 0, defSubClass = 0;
    int dexMainClass = 0, dexSubClass = 0;
    int agiMainClass = 0, agiSubClass = 0;
    int focMainClass = 0, focSubClass = 0;
    int intMainClass = 0, intSubClass = 0;
    int wisMainClass = 0, wisSubClass = 0;
    int chrMainClass = 0, chrSubClass = 0;

    int getStrMainClass();
    int getConMainClass();
    int getDefMainClass();
    int getDexMainClass();
    int getAgiMainClass();
    int getFocMainClass();
    int getIntMainClass();
    int getWisMainClass();
    int getChrMainClass();

    int getStrSubClass();
    int getConSubClass();
    int getDefSubClass();
    int getDexSubClass();
    int getAgiSubClass();
    int getFocSubClass();
    int getIntSubClass();
    int getWisSubClass();
    int getChrSubClass();
}
