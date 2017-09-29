package creatures.entity;

import creatures.Creature;

public class Entity extends Creature {

    public double strRank = 0.0;
    public double dexRank = 0.0;
    public double conRank = 0.0;
    public double witRank = 0.0;
    public double focRank = 0.0;
    public double intRank = 0.0;
    private double curTotalAttributesRank = 0.0;

    public double skillAthRank = 0.0;
    public double skillEndRank = 0.0;
    public double skillSurRank = 0.0;
    public double skillPerRank = 0.0;
    public double skillResRank = 0.0;
    public double skillRefRank = 0.0;
    public double skillInsRank = 0.0;
    public double skillKnoRank = 0.0;
    public double skillChaRank = 0.0;
    private double curTotalSkillRank = 0.0;

    public int strRankMax = 0;
    public int dexRankMax = 0;
    public int conRankMax = 0;
    public int witRankMax = 0;
    public int focRankMax = 0;
    public int intRankMax = 0;
    private int maxTotalAttributesRank = 0;

    public int skillAthRankMax = 0;
    public int skillEndRankMax = 0;
    public int skillSurRankMax = 0;
    public int skillPerRankMax = 0;
    public int skillResRankMax = 0;
    public int skillRefRankMax = 0;
    public int skillInsRankMax = 0;
    public int skillKnoRankMax = 0;
    public int skillChaRankMax = 0;
    private int maxTotalSkillRank = 0;

    int potentialLevel = 0;

    double curAttributeRating = 0.0;
    double maxAttributeRating = 0.0;
    double curSkillRating = 0.0;
    double maxSkillRating = 0.0;

    public Entity(int potentialLevel) {
        super();
        calculateAtrSklMax();   // Generates random Atr and Skl Max based on Race/Subrace
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("-----Attributes-----");
        System.out.printf("Str: %05.2f/%02d | ", strRank, strRankMax);
        System.out.printf("Con: %05.2f/%02d \n", dexRank, dexRankMax);
        System.out.printf("Dex: %05.2f/%02d | ", conRank, conRankMax);
        System.out.printf("Foc: %05.2f/%02d \n", witRank, witRankMax);
        System.out.printf("Int: %05.2f/%02d | ", focRank, focRankMax);
        System.out.printf("Wit: %05.2f/%02d \n", intRank, intRankMax);
        System.out.printf("A.Total/Max: %06.2f/%02d \n", curTotalAttributesRank, maxTotalAttributesRank);
        System.out.printf("Current Rating: %4.2f/%4.2f \n", curAttributeRating, maxAttributeRating);
        System.out.println("-------Skills-------");
        System.out.printf("Ath: %05.2f/%02d | ", skillAthRank, skillAthRankMax);
        System.out.printf("End: %05.2f/%02d | ", skillEndRank, skillEndRankMax);
        System.out.printf("Sur: %05.2f/%02d \n", skillSurRank, skillSurRankMax);
        System.out.printf("Per: %05.2f/%02d | ", skillPerRank, skillPerRankMax);
        System.out.printf("Res: %05.2f/%02d | ", skillResRank, skillResRankMax);
        System.out.printf("Ref: %05.2f/%02d \n", skillRefRank, skillRefRankMax);
        System.out.printf("Ins: %05.2f/%02d | ", skillInsRank, skillInsRankMax);
        System.out.printf("Kno: %05.2f/%02d | ", skillKnoRank, skillKnoRankMax);
        System.out.printf("Cha: %05.2f/%02d \n", skillChaRank, skillChaRankMax);
        System.out.printf("S.Total/Max: %06.2f/%02d \n", curTotalSkillRank, maxTotalSkillRank);
        System.out.printf("Current Rating: %4.2f/%4.2f \n", curSkillRating, maxSkillRating);
    }

    @Override
    public void setFinalAttributes() {

    }

    /**
     *
     */
    public void updateCurrentRank() {

        updateCurrentFinalAtrSkl();

    }

    /**
     *
     */
    public void calculateAtrSklMax() {
        int atrBase = 15;
        int skillBase = 15;

        setStrRankMax(atrBase + race.getStrRace() + race.getStrSubrace());
        setDexRankMax(atrBase + race.getDexRace() + race.getDexSubrace());
        setConRankMax(atrBase + race.getConRace() + race.getConSubrace());
        setWitRankMax(atrBase + race.getWitRace() + race.getWitSubrace());
        setFocRankMax(atrBase + race.getFocRace() + race.getFocSubrace());
        setIntRankMax(atrBase + race.getIntRace() + race.getIntSubrace());
        maxTotalAttributesRank = strRankMax + dexRankMax + conRankMax + witRankMax + focRankMax + intRankMax;

        setSkillAthRankMax(skillBase + race.getSkillAthRace() + race.getSkillAthSubrace()
                    + ((strRankMax * 7 + dexRankMax * 3) / 10));
        setSkillEndRankMax(skillBase + race.getSkillEndRace() + race.getSkillEndSubrace()
                    + ((conRankMax * 7 + focRankMax * 3) / 10));
        setSkillSurRankMax(skillBase + race.getSkillSurRace() + race.getSkillSurSubrace()
                    + ((intRankMax * 7 + strRankMax * 3) / 10));
        setSkillPerRankMax(skillBase + race.getSkillPerRace() + race.getSkillPerSubrace()
                    + ((focRankMax * 7 + witRankMax * 3) / 10));
        setSkillResRankMax(skillBase + race.getSkillResRace() + race.getSkillResSubrace()
                    + ((witRankMax * 7 + conRankMax * 3) / 10));
        setSkillRefRankMax(skillBase + race.getSkillRefRace() + race.getSkillRefSubrace()
                    + ((dexRankMax * 7 + intRankMax * 3) / 10));
        setSkillInsRankMax(skillBase + race.getSkillInsRace() + race.getSkillInsSubrace()
                    + ((focRankMax * 7 + witRankMax * 3) / 10));
        setSkillKnoRankMax(skillBase + race.getSkillKnoRace() + race.getSkillKnoSubrace()
                    + ((intRankMax * 7 + focRankMax * 3) / 10));
        setSkillChaRankMax(skillBase + race.getSkillChaRace() + race.getSkillChaSubrace()
                    + ((witRankMax * 7 + intRankMax * 3) / 10));
        maxTotalSkillRank = skillAthRankMax + skillEndRankMax + skillSurRankMax + skillPerRankMax
                + skillResRankMax + skillRefRankMax + skillInsRankMax + skillKnoRankMax + skillChaRankMax;

        maxAttributeRating = ((double) maxTotalAttributesRank / (double) maxTotalAttributes) * 5;
        maxSkillRating = ((double) maxTotalSkillRank / (double) maxTotalSkill) * 5;

        updateCurrentRank();
    }



    //Setters

    public void setStrRankMax(int n) {
        this.strRankMax = (n > 20) ? 20 : n;
    }

    public void setDexRankMax(int n) {
        this.dexRankMax = (n > 20) ? 20 : n;
    }

    public void setConRankMax(int n) {
        this.conRankMax = (n > 20) ? 20 : n;
    }

    public void setWitRankMax(int n) {
        this.witRankMax = (n > 20) ? 20 : n;
    }

    public void setFocRankMax(int n) {
        this.focRankMax = (n > 20) ? 20 : n;
    }

    public void setIntRankMax(int n) {
        this.intRankMax = (n > 20) ? 20 : n;
    }

    public void setSkillAthRankMax(int n) {
        this.skillAthRankMax = (n > 50) ? 50 : n;
    }

    public void setSkillEndRankMax(int n) {
        this.skillEndRankMax = (n > 50) ? 50 : n;
    }

    public void setSkillSurRankMax(int n) {
        this.skillSurRankMax = (n > 50) ? 50 : n;
    }

    public void setSkillPerRankMax(int n) {
        this.skillPerRankMax = (n > 50) ? 50 : n;
    }

    public void setSkillResRankMax(int n) {
        this.skillResRankMax = (n > 50) ? 50 : n;
    }

    public void setSkillRefRankMax(int n) {
        this.skillRefRankMax = (n > 50) ? 50 : n;
    }

    public void setSkillInsRankMax(int n) {
        this.skillInsRankMax = (n > 50) ? 50 : n;
    }

    public void setSkillKnoRankMax(int n) {
        this.skillKnoRankMax = (n > 50) ? 50 : n;
    }

    public void setSkillChaRankMax(int n) {
        this.skillChaRankMax = (n > 50) ? 50 : n;
    }
}