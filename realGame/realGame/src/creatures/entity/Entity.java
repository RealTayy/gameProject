package creatures.entity;

import creatures.Creature;
import exceptions.IllegalAtrOrSkill;
import exceptions.OutOfRange;
import races.Race;

import java.util.Random;

public class Entity extends Creature {

    public double strRank = 0.0;
    public double dexRank = 0.0;
    public double conRank = 0.0;
    public double witRank = 0.0;
    public double focRank = 0.0;
    public double intRank = 0.0;
    public double curTotalAttributeRank = 0.0;

    public double skillAthRank = 0.0;
    public double skillEndRank = 0.0;
    public double skillSurRank = 0.0;
    public double skillPerRank = 0.0;
    public double skillResRank = 0.0;
    public double skillRefRank = 0.0;
    public double skillInsRank = 0.0;
    public double skillKnoRank = 0.0;
    public double skillChaRank = 0.0;
    public double curTotalSkillRank = 0.0;

    public int strMaxRank = 0;
    public int dexMaxRank = 0;
    public int conMaxRank = 0;
    public int witMaxRank = 0;
    public int focMaxRank = 0;
    public int intMaxRank = 0;
    public int maxTotalAttributeRank = 0;

    public int skillAthMaxRank = 0;
    public int skillEndMaxRank = 0;
    public int skillSurMaxRank = 0;
    public int skillPerMaxRank = 0;
    public int skillResMaxRank = 0;
    public int skillRefMaxRank = 0;
    public int skillInsMaxRank = 0;
    public int skillKnoMaxRank = 0;
    public int skillChaMaxRank = 0;
    public int maxTotalSkillRank = 0;

    public double curAttributeRating = 0.0;
    public double maxAttributeRating = 0.0;
    public double curSkillRating = 0.0;
    public double maxSkillRating = 0.0;

    int potentialLevel = 0;
    int percentDeveloped = 0;

    public Entity(Race race, int potentialLevel, int percentDeveloped) {
        super(race);
        setPotentialLevel(potentialLevel);
        setPercentDeveloped(percentDeveloped);
        initializeNewEntity();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("----PotentialLVL----");
        System.out.println("Potential Level: " + potentialLevel);
        System.out.println("Development Percentage: " + percentDeveloped + "%");
        System.out.println("-----Attributes-----");
        System.out.printf("Str: %05.2f/%02d | ", strRank, strMaxRank);
        System.out.printf("Con: %05.2f/%02d \n", dexRank, dexMaxRank);
        System.out.printf("Dex: %05.2f/%02d | ", conRank, conMaxRank);
        System.out.printf("Foc: %05.2f/%02d \n", witRank, witMaxRank);
        System.out.printf("Int: %05.2f/%02d | ", focRank, focMaxRank);
        System.out.printf("Wit: %05.2f/%02d \n", intRank, intMaxRank);
        System.out.printf("A.Total/Max: %5.2f/%02d \n", curTotalAttributeRank, maxTotalAttributeRank);
        System.out.printf("Current Rating: %4.2f/%4.2f \n", curAttributeRating, maxAttributeRating);
        System.out.println("-------Skills-------");
        System.out.printf("Ath: %05.2f/%02d | ", skillAthRank, skillAthMaxRank);
        System.out.printf("End: %05.2f/%02d | ", skillEndRank, skillEndMaxRank);
        System.out.printf("Sur: %05.2f/%02d \n", skillSurRank, skillSurMaxRank);
        System.out.printf("Per: %05.2f/%02d | ", skillPerRank, skillPerMaxRank);
        System.out.printf("Res: %05.2f/%02d | ", skillResRank, skillResMaxRank);
        System.out.printf("Ref: %05.2f/%02d \n", skillRefRank, skillRefMaxRank);
        System.out.printf("Ins: %05.2f/%02d | ", skillInsRank, skillInsMaxRank);
        System.out.printf("Kno: %05.2f/%02d | ", skillKnoRank, skillKnoMaxRank);
        System.out.printf("Cha: %05.2f/%02d \n", skillChaRank, skillChaMaxRank);
        System.out.printf("S.Total/Max: %06.2f/%02d \n", curTotalSkillRank, maxTotalSkillRank);
        System.out.printf("Current Rating: %4.2f/%4.2f \n", curSkillRating, maxSkillRating);
    }

    @Override
    public void setFinalAttributesAndSkills() {
        strFinal = (int) strRank;
        dexFinal = (int) strRank;
        conFinal = (int) strRank;
        witFinal = (int) strRank;
        focFinal = (int) strRank;
        intFinal = (int) strRank;

        skillAthFinal = (int) skillAthRank;
        skillEndFinal = (int) skillEndRank;
        skillSurFinal = (int) skillSurRank;
        skillPerFinal = (int) skillPerRank;
        skillResFinal = (int) skillResRank;
        skillRefFinal = (int) skillRefRank;
        skillInsFinal = (int) skillInsRank;
        skillKnoFinal = (int) skillKnoRank;
        skillChaFinal = (int) skillChaRank;
    }

    /**
     * Randomly Generates an Entity's max rank for Attributes and Skills
     * Randomly assigns an Entity's initial current rank for Attributes and Skills based on Entity's percent developed
     */
    public void initializeNewEntity() {
        generateMaxRankForAtrSkl();
        generateInitialRankForAtrSkl(percentDeveloped);
        setFinalAttributesAndSkills();
    }

    /**
     * Generates and sets all maxes for Attributes and Skills rank and ratings
     * -atrMaxRank             -skillMaxRank
     * -maxTotalAttributeRank  -maxAttributeRating
     * -maxTotalSkillRank      -maxSKillRating
     *
     * Max Rank for Attribute is calculated by this equation:
     * 5(base) + (potentialLevel * 2) + atrRace + atrSubrace
     *
     * Max Rank for Skills is calculated by this equations:
     * 6(base) + (potentialLevel *3) + skillRace + skillSubrace + ((Primary atr * 7 + Secondary atr * 3) / 10)
     */
    public void generateMaxRankForAtrSkl() {
        int atrBase = 5 + (potentialLevel * 2);
        int skillBase = 6 + (potentialLevel * 3);

        setStrMaxRank(atrBase + race.getStrRace() + race.getStrSubrace());
        setDexMaxRank(atrBase + race.getDexRace() + race.getDexSubrace());
        setConMaxRank(atrBase + race.getConRace() + race.getConSubrace());
        setWitMaxRank(atrBase + race.getWitRace() + race.getWitSubrace());
        setFocMaxRank(atrBase + race.getFocRace() + race.getFocSubrace());
        setIntMaxRank(atrBase + race.getIntRace() + race.getIntSubrace());
        maxTotalAttributeRank = strMaxRank + dexMaxRank + conMaxRank + witMaxRank + focMaxRank + intMaxRank;

        setSkillAthMaxRank(skillBase + race.getSkillAthRace() + race.getSkillAthSubrace() + ((strMaxRank * 7 + dexMaxRank * 3) / 10));
        setSkillEndMaxRank(skillBase + race.getSkillEndRace() + race.getSkillEndSubrace() + ((conMaxRank * 7 + focMaxRank * 3) / 10));
        setSkillSurMaxRank(skillBase + race.getSkillSurRace() + race.getSkillSurSubrace() + ((intMaxRank * 7 + strMaxRank * 3) / 10));
        setSkillPerMaxRank(skillBase + race.getSkillPerRace() + race.getSkillPerSubrace() + ((focMaxRank * 7 + witMaxRank * 3) / 10));
        setSkillResMaxRank(skillBase + race.getSkillResRace() + race.getSkillResSubrace() + ((witMaxRank * 7 + conMaxRank * 3) / 10));
        setSkillRefMaxRank(skillBase + race.getSkillRefRace() + race.getSkillRefSubrace() + ((dexMaxRank * 7 + intMaxRank * 3) / 10));
        setSkillInsMaxRank(skillBase + race.getSkillInsRace() + race.getSkillInsSubrace() + ((focMaxRank * 7 + witMaxRank * 3) / 10));
        setSkillKnoMaxRank(skillBase + race.getSkillKnoRace() + race.getSkillKnoSubrace() + ((intMaxRank * 7 + focMaxRank * 3) / 10));
        setSkillChaMaxRank(skillBase + race.getSkillChaRace() + race.getSkillChaSubrace() + ((witMaxRank * 7 + intMaxRank * 3) / 10));
        maxTotalSkillRank = skillAthMaxRank + skillEndMaxRank + skillSurMaxRank + skillPerMaxRank
                + skillResMaxRank + skillRefMaxRank + skillInsMaxRank + skillKnoMaxRank + skillChaMaxRank;

        maxAttributeRating = ((double) maxTotalAttributeRank / (double) maxTotalAttribute) * 5;
        maxSkillRating = ((double) maxTotalSkillRank / (double) maxTotalSkill) * 5;
    }

    /**
     * Assigns initial skill and attribute ranks using a weighted formula that favors those with a higher max rank
     *
     * @param percentDeveloped from 0 to 100. This is how leveled an Entity's intial rank will be compared to its max
     */
    public void generateInitialRankForAtrSkl(int percentDeveloped) {
        int skillPoints = (maxTotalSkillRank * percentDeveloped) / 100;
        int attributePoints = (maxTotalAttributeRank * percentDeveloped) / 100;

        addWeightedSkillRank(skillPoints);
        addWeightedAttributeRank(attributePoints);
    }

    /**
     *
     */
    public void updateCurrentTotalRankAtrSkl() {
        curTotalAttributeRank = strRank + dexRank + conRank + focRank + intRank + witRank;
        curTotalSkillRank = skillAthRank + skillEndRank + skillSurRank + skillPerRank
                + skillResRank + skillRefRank + skillInsRank + skillKnoRank + skillChaRank;

        updateCurrentRatingAtrSkl();
    }

    /**
     *
     */
    public void updateCurrentRatingAtrSkl() {
        curAttributeRating = (curTotalAttributeRank / (double) maxTotalAttribute) * 5;
        curSkillRating = (curTotalSkillRank / (double) maxTotalSkill) * 5;
    }

    /**
     * Checks if a entity's current Attribute or Skill rank is equal to its respective Max rank
     * @param attributeOrSkill 3 Letter abbreviation of a Strength or Skill or the Full Name
     *                         Also accepts:    Attribute(Atr) -Checks all Attributes
     *                                          Skill(Skl)     -Checks all Skills
     *                                          All            -Checks all Attributes and Skills
     * @returns Returns true if current rank == max rank.
     */
    public boolean isRankMaxed(String attributeOrSkill) {
        attributeOrSkill = attributeOrSkill.substring(0,3).toLowerCase();
        switch (attributeOrSkill) {
            case "str" : return (strRank == strMaxRank);
            case "dex" : return (dexRank == dexMaxRank);
            case "con" : return (conRank == conMaxRank);
            case "wit" : return (witRank == witMaxRank);
            case "foc" : return (focRank == focMaxRank);
            case "int" : return (intRank == intMaxRank);
            case "ath" : return (skillAthRank == skillAthMaxRank);
            case "end" : return (skillEndRank == skillEndMaxRank);
            case "sur" : return (skillSurRank == skillSurMaxRank);
            case "per" : return (skillPerRank == skillPerMaxRank);
            case "res" : return (skillResRank == skillResMaxRank);
            case "ref" : return (skillRefRank == skillRefMaxRank);
            case "ins" : return (skillInsRank == skillInsMaxRank);
            case "kno" : return (skillKnoRank == skillKnoMaxRank);
            case "cha" : return (skillChaRank == skillChaMaxRank);
            case "ski" : return (curTotalSkillRank == maxTotalSkillRank);
            case "skl" : return (curTotalSkillRank == maxTotalSkillRank);
            case "atr" : return (curTotalAttributeRank== maxTotalAttributeRank);
            case "att" : return (curTotalAttributeRank== maxTotalAttributeRank);
            case "all" : return (isRankMaxed("skl") && isRankMaxed("atr"));
            default : throw new IllegalAtrOrSkill(attributeOrSkill);
        }
    }

    /**
     * Chooses an Entity's current attribute rank at random and increases it by 1 up into its maxRank.
     * If the chosen attribute is already max then it tries again.
     * If all attribute ranks are maxed then does nothing and prints out ERROR message to Terminal/Console
     *
     * @param ranksToAdd Number of ranks you would like to add
     */
    public void addRandomAttributeRank(int ranksToAdd) {
        Random rand = new Random();
        if (isRankMaxed("att")) ranksToAdd = 0; System.out.println("ERROR: All attributes already maxed");
        while (ranksToAdd-- > 0 && !isRankMaxed("Attribute")) {
            switch (rand.nextInt(6)) {
                case 0:
                    if (strRank == strMaxRank) addRandomAttributeRank(1);
                    else setStrRank(strRank + 1);
                    break;
                case 1:
                    if (dexRank == dexMaxRank) addRandomAttributeRank(1);
                    else setDexRank(dexRank + 1);
                    break;
                case 2:
                    if (conRank == conMaxRank) addRandomAttributeRank(1);
                    else setConRank(conRank + 1);
                    break;
                case 3:
                    if (witRank == witMaxRank) addRandomAttributeRank(1);
                    else setWitRank(witRank + 1);
                    break;
                case 4:
                    if (focRank == focMaxRank) addRandomAttributeRank(1);
                    else setFocRank(focRank + 1);
                    break;
                case 5:
                    if (intRank == intMaxRank) addRandomAttributeRank(1);
                    else setIntRank(intRank + 1);
                    break;
            }
        }
    }

    /**
     * Chooses an Entity's current skill rank at random and increases it by 1 up into its maxRank.
     * If the chosen skill is already max then it tries again.
     * If all skill ranks are maxed then does nothing and prints out ERROR message to Terminal/Console
     *
     * @param ranksToAdd Number of ranks you would like to add
     */
    public void addRandomSkillRank(int ranksToAdd) {
        Random rand = new Random();
        if (isRankMaxed("skl")) ranksToAdd = 0; System.out.println("ERROR: All skills already maxed");
        while (ranksToAdd-- > 0 && !isRankMaxed("Skill")) {
            switch (rand.nextInt(9)) {
                case 0:
                    if (skillAthRank == skillAthMaxRank) addRandomSkillRank(1);
                    else setSkillAthRank(skillAthRank + 1);
                    break;
                case 1:
                    if (skillEndRank == skillEndMaxRank) addRandomSkillRank(1);
                    else setSkillEndRank(skillEndRank + 1);
                    break;
                case 2:
                    if (skillSurRank == skillSurMaxRank) addRandomSkillRank(1);
                    else setSkillSurRank(skillSurRank + 1);
                    break;
                case 3:
                    if (skillPerRank == skillPerMaxRank) addRandomSkillRank(1);
                    else setSkillPerRank(skillPerRank + 1);
                    break;
                case 4:
                    if (skillResRank == skillResMaxRank) addRandomSkillRank(1);
                    else setSkillResRank(skillResRank + 1);
                    break;
                case 5:
                    if (skillRefRank == skillRefMaxRank) addRandomSkillRank(1);
                    else setSkillRefRank(skillRefRank + 1);
                    break;
                case 6:
                    if (skillInsRank == skillInsMaxRank) addRandomSkillRank(1);
                    else setSkillInsRank(skillInsRank + 1);
                    break;
                case 7:
                    if (skillKnoRank == skillKnoMaxRank) addRandomSkillRank(1);
                    else setSkillKnoRank(skillKnoRank + 1);
                    break;
                case 8:
                    if (skillChaRank == skillChaMaxRank) addRandomSkillRank(1);
                    else setSkillChaRank(skillChaRank + 1);
                    break;
            }
        }
    }

    /**
     * Chooses an Entity's current attribute rank using a weighted formula and increases it by 1 up into its maxRank.
     * If the chosen attribute is already max then it tries again.
     * If all attribute ranks are maxed then does nothing and prints out ERROR message to Terminal/Console
     *
     * The chances of a certain attribute being chosen is its maxRank/maxTotalAttributeRank
     *
     * EXAMPLE: totalMaxRank = 90
     *          strMaxRank = 15 -> .1667 -> 16.67%
     *          dexMaxRank = 20 -> .2222 -> 22.22%
     *          conMaxRank = 12 -> .1333 -> 13.33%
     *
     * @param ranksToAdd Number of ranks you would like to add
     */
    public void addWeightedAttributeRank(int ranksToAdd) {
        int strBound = strMaxRank;
        int dexBound = dexMaxRank + strBound;
        int conBound = conMaxRank + dexBound;
        int witBound = witMaxRank + conBound;
        int focBound = focMaxRank + witBound;
        int intBound = intMaxRank + focBound;
        int totBound = intBound;
        if (isRankMaxed("att")) {
            ranksToAdd = 0;
            System.out.println("ERROR: All attributes already maxed");
        }
        while (ranksToAdd-- > 0) {
            Random rand = new Random();
            int n = rand.nextInt(totBound) + 1;
            if ( 0 < n && n <= strBound) if (isRankMaxed("str")) addWeightedAttributeRank(1); else setStrRank(strRank + 1);
            else if ( strBound < n && n <= dexBound) if (isRankMaxed("dex")) addWeightedAttributeRank(1); else setDexRank(dexRank + 1);
            else if ( dexBound < n && n <= conBound) if (isRankMaxed("con")) addWeightedAttributeRank(1); else setConRank(conRank + 1);
            else if ( conBound < n && n <= witBound) if (isRankMaxed("wit")) addWeightedAttributeRank(1); else setWitRank(witRank + 1);
            else if ( witBound < n && n <= focBound) if (isRankMaxed("foc")) addWeightedAttributeRank(1); else setFocRank(focRank + 1);
            else if ( focBound < n && n <= intBound) if (isRankMaxed("int")) addWeightedAttributeRank(1); else setIntRank(intRank + 1);
            else throw new OutOfRange(n, 1, totBound);
        }
    }

    /**
     * Chooses an Entity's current skill rank using a weighted formula and increases it by 1 up into its maxRank.
     * If the chosen skill is already max then it tries again.
     * If all skill ranks are maxed then does nothing and prints out ERROR message to Terminal/Console
     *
     * The chances of a certain attribute being chosen is its maxRank/maxTotalSkillRank
     *
     * EXAMPLE: maxTotalSkillRank =
     *          strMaxRank = 15 -> .1667 -> 16.67%
     *          dexMaxRank = 20 -> .2222 -> 22.22%
     *          conMaxRank = 12 -> .1333 -> 13.33%
     *
     * @param ranksToAdd Number of ranks you would like to add
     */
    public void addWeightedSkillRank(int ranksToAdd) {
        int athBound = skillAthMaxRank;
        int endBound = skillEndMaxRank + athBound;
        int surBound = skillSurMaxRank + endBound;
        int perBound = skillPerMaxRank + surBound;
        int resBound = skillResMaxRank + perBound;
        int refBound = skillRefMaxRank + resBound;
        int insBound = skillInsMaxRank + refBound;
        int knoBound = skillKnoMaxRank + insBound;
        int chaBound = skillChaMaxRank + knoBound;
        int totBound = chaBound;
        if (isRankMaxed("skl")) {
            ranksToAdd = 0;
            System.out.println("ERROR: All skills already maxed");
        }
        while (ranksToAdd-- > 0) {
            Random rand = new Random();
            int n = rand.nextInt(totBound) + 1;
            if ( 0 < n && n <= athBound) if (isRankMaxed("ath")) addWeightedSkillRank(1); else setSkillAthRank(skillAthRank + 1);
            else if ( athBound < n && n <= endBound) if (isRankMaxed("end")) addWeightedSkillRank(1); else setSkillEndRank(skillEndRank + 1);
            else if ( endBound < n && n <= surBound) if (isRankMaxed("sur")) addWeightedSkillRank(1); else setSkillSurRank(skillSurRank + 1);
            else if ( surBound < n && n <= perBound) if (isRankMaxed("per")) addWeightedSkillRank(1); else setSkillPerRank(skillPerRank + 1);
            else if ( perBound < n && n <= resBound) if (isRankMaxed("res")) addWeightedSkillRank(1); else setSkillResRank(skillResRank + 1);
            else if ( resBound < n && n <= refBound) if (isRankMaxed("ref")) addWeightedSkillRank(1); else setSkillRefRank(skillRefRank + 1);
            else if ( refBound < n && n <= insBound) if (isRankMaxed("ins")) addWeightedSkillRank(1); else setSkillInsRank(skillInsRank + 1);
            else if ( insBound < n && n <= knoBound) if (isRankMaxed("kno")) addWeightedSkillRank(1); else setSkillKnoRank(skillKnoRank + 1);
            else if ( knoBound < n && n <= chaBound) if (isRankMaxed("cha")) addWeightedSkillRank(1); else setSkillChaRank(skillChaRank + 1);
            else throw new OutOfRange(n, 1, totBound);
        }
    }















    //Setters

    public void setStrMaxRank(int n) {
        this.strMaxRank = (n > 20) ? 20 : n;
    }

    public void setDexMaxRank(int n) {
        this.dexMaxRank = (n > 20) ? 20 : n;
    }

    public void setConMaxRank(int n) {
        this.conMaxRank = (n > 20) ? 20 : n;
    }

    public void setWitMaxRank(int n) {
        this.witMaxRank = (n > 20) ? 20 : n;
    }

    public void setFocMaxRank(int n) {
        this.focMaxRank = (n > 20) ? 20 : n;
    }

    public void setIntMaxRank(int n) {
        this.intMaxRank = (n > 20) ? 20 : n;
    }

    public void setSkillAthMaxRank(int n) {
        this.skillAthMaxRank = (n > 50) ? 50 : n;
    }

    public void setSkillEndMaxRank(int n) {
        this.skillEndMaxRank = (n > 50) ? 50 : n;
    }

    public void setSkillSurMaxRank(int n) {
        this.skillSurMaxRank = (n > 50) ? 50 : n;
    }

    public void setSkillPerMaxRank(int n) {
        this.skillPerMaxRank = (n > 50) ? 50 : n;
    }

    public void setSkillResMaxRank(int n) {
        this.skillResMaxRank = (n > 50) ? 50 : n;
    }

    public void setSkillRefMaxRank(int n) {
        this.skillRefMaxRank = (n > 50) ? 50 : n;
    }

    public void setSkillInsMaxRank(int n) {
        this.skillInsMaxRank = (n > 50) ? 50 : n;
    }

    public void setSkillKnoMaxRank(int n) {
        this.skillKnoMaxRank = (n > 50) ? 50 : n;
    }

    public void setSkillChaMaxRank(int n) {
        this.skillChaMaxRank = (n > 50) ? 50 : n;
    }

    public void setStrRank(double d) {
        this.strRank = (d > strMaxRank) ? strMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setDexRank(double d) {
        this.dexRank = (d > dexMaxRank) ? dexMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setConRank(double d) {
        this.conRank = (d > conMaxRank) ? conMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setWitRank(double d) {
        this.witRank = (d > witMaxRank) ? witMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setFocRank(double d) {
        this.focRank = (d > focMaxRank) ? focMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setIntRank(double d) {
        this.intRank = (d > intMaxRank) ? intMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setSkillAthRank(double d) {
        this.skillAthRank = (d > skillAthMaxRank) ? skillAthMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setSkillEndRank(double d) {
        this.skillEndRank = (d > skillEndMaxRank) ? skillEndMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setSkillSurRank(double d) {
        this.skillSurRank = (d > skillSurMaxRank) ? skillSurMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setSkillPerRank(double d) {
        this.skillPerRank = (d > skillPerMaxRank) ? skillPerMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setSkillResRank(double d) {
        this.skillResRank = (d > skillResMaxRank) ? skillResMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setSkillRefRank(double d) {
        this.skillRefRank = (d > skillRefMaxRank) ? skillRefMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setSkillInsRank(double d) {
        this.skillInsRank = (d > skillInsMaxRank) ? skillInsMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setSkillKnoRank(double d) {
        this.skillKnoRank = (d > skillKnoMaxRank) ? skillKnoMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setSkillChaRank(double d) {
        this.skillChaRank = (d > skillChaMaxRank) ? skillChaMaxRank : d;
        updateCurrentTotalRankAtrSkl();
    }

    public void setPercentDeveloped(int percentDeveloped) {
        if (percentDeveloped < 0 | percentDeveloped > 100) throw new OutOfRange(percentDeveloped, 0, 100);
        else this.percentDeveloped = percentDeveloped;
    }

    public void setPotentialLevel(int potentialLevel) {
        if (potentialLevel < 0 | potentialLevel > 4) throw new OutOfRange(potentialLevel, 0, 4);
        else this.potentialLevel = potentialLevel;

    }
}