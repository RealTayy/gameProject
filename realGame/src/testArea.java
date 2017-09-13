import java.util.Random;

public class testArea {

    int mainStat;
    int mainCategory;
    int subCategory;
    int lastCategory;

    int currentLevel = 1;
    int finalLevel = 1;

    public testArea(int mainStat, int mainCategory, int subCatgory, int lastCategory, int finalLevel) {
        this.mainStat = mainStat;
        this.mainCategory = mainCategory;
        this.subCategory = subCatgory;
        this.lastCategory = lastCategory;
        this.finalLevel = finalLevel;
    }

    int strM = 1;
    int conM = 1;
    int defM = 1;
    int dexM = 1;
    int agiM = 1;
    int focM = 1;
    int intM = 1;
    int wisM = 1;
    int chrM = 1;

    String lvlString = "lvl = " + ((currentLevel < 10) ? "0" : "") + currentLevel + " ";
    String strString = "str = " + ((strM < 10) ? "0" : "") + strM + " ";
    String conString = "con = " + ((conM < 10) ? "0" : "") + conM + " ";
    String defString = "def = " + ((defM < 10) ? "0" : "") + defM + " ";
    String dexString = "dex = " + ((dexM < 10) ? "0" : "") + dexM + " ";
    String agiString = "agi = " + ((agiM < 10) ? "0" : "") + agiM + " ";
    String focString = "foc = " + ((focM < 10) ? "0" : "") + focM + " ";
    String intString = "int = " + ((intM < 10) ? "0" : "") + intM + " ";
    String wisString = "wis = " + ((wisM < 10) ? "0" : "") + wisM + " ";
    String chrString = "chr = " + ((chrM < 10) ? "0" : "") + chrM + " ";

    public void levelUp() {
        while (currentLevel++ < finalLevel) {
            mainCategoryUp(2);
            subCategoryUp(1);
            lastCategoryUp(1);
            if (currentLevel > 3) {
                mainCategoryUp(0);
                subCategoryUp(1);
                mainStatUp(1);
            }
            if (currentLevel > 8) {
                lastCategoryUp(1);
                focM++;
            }
            lvlString += ((currentLevel < 10) ? "0" : "") + currentLevel + " ";
            strString += ((strM < 10) ? "0" : "") + strM + " ";
            conString += ((conM < 10) ? "0" : "") + conM + " ";
            defString += ((defM < 10) ? "0" : "") + defM + " ";
            dexString += ((dexM < 10) ? "0" : "") + dexM + " ";
            agiString += ((agiM < 10) ? "0" : "") + agiM + " ";
            focString += ((focM < 10) ? "0" : "") + focM + " ";
            intString += ((intM < 10) ? "0" : "") + intM + " ";
            wisString += ((wisM < 10) ? "0" : "") + wisM + " ";
            chrString += ((chrM < 10) ? "0" : "") + chrM + " ";
        }
    }

    public void mainStatUp(int n) {
        for (int i = 0; i < n; i++) {
            switch (mainStat) {
                case 1:
                    strM++;
                    break;
                case 2:
                    conM++;
                    break;
                case 3:
                    defM++;
                    break;
                case 4:
                    dexM++;
                    break;
                case 5:
                    agiM++;
                    break;
                case 6:
                    focM++;
                    break;
                case 7:
                    intM++;
                    break;
                case 8:
                    wisM++;
                    break;
                case 9:
                    chrM++;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public void mainCategoryUp(int n) {
        for (int i = 0; i < n; i++) {
            switch (mainCategory) {
                case 1:
                    randomStatUpCategory(1);
                    break;
                case 2:
                    randomStatUpCategory(2);
                    break;
                case 3:
                    randomStatUpCategory(3);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public void subCategoryUp(int n) {
        for (int i = 0; i < n; i++) {
            switch (subCategory) {
                case 1:
                    randomStatUpCategory(1);
                    break;
                case 2:
                    randomStatUpCategory(2);
                    break;
                case 3:
                    randomStatUpCategory(3);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public void lastCategoryUp(int n) {
        for (int i = 0; i < n; i++) {
            switch (lastCategory) {
                case 1:
                    randomStatUpCategory(1);
                    break;
                case 2:
                    randomStatUpCategory(2);
                    break;
                case 3:
                    randomStatUpCategory(3);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public void randomStatUpCategory(int category) {
        Random rand = new Random();
        int j = 1 + Math.abs(rand.nextInt() % 3);
        switch (category) {
            case 1:
                switch (j) {
                    case 1:
                        strM++;
                        break;
                    case 2:
                        conM++;
                        break;
                    case 3:
                        defM++;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                break;
            case 2:
                switch (j) {
                    case 1:
                        dexM++;
                        break;
                    case 2:
                        agiM++;
                        break;
                    case 3:
                        focM++;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                break;
            case 3:
                switch (j) {
                    case 1:
                        intM++;
                        break;
                    case 2:
                        wisM++;
                        break;
                    case 3:
                        chrM++;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void printStats() {
        int i = 1;
        String breaker = "";
        while (i++ < lvlString.length()){
            breaker += "-";
        }
        System.out.println(lvlString);
        System.out.println(strString);
        System.out.println(conString);
        System.out.println(defString);
        System.out.println(breaker);
        System.out.println(lvlString);
        System.out.println(dexString);
        System.out.println(agiString);
        System.out.println(focString);
        System.out.println(breaker);
        System.out.println(lvlString);
        System.out.println(intString);
        System.out.println(wisString);
        System.out.println(chrString);
    }

    public static void main(String[] args) {
        testArea test = new testArea(3, 1, 2, 3, 13);
        test.levelUp();
        test.printStats();

    }
}
