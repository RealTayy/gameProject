package creatures.entity;

import creatures.Creature;
import exceptions.OutOfRange;

import java.util.Random;

/**
 * The {@code Entity} abstract class is the superclass of all
 * PlayerEntity and EnemyEntity objects.
 * <p>
 * This is where a creature's MainClass and SubClass are determined
 */
public abstract class Entity extends Creature {

    int skillAthFinal = 0, skillAthBase = 0, skillAthTemp = 0, skillAthRankMax = 0;
    int skillEndFinal = 0, skillEndBase = 0, skillEndTemp = 0, skillEndRankMax = 0;
    int skillSurFinal = 0, skillSurBase = 0, skillSurTemp = 0, skillSurRankMax = 0;
    int skillPerFinal = 0, skillPerBase = 0, skillPerTemp = 0, skillPerRankMax = 0;
    int skillResFinal = 0, skillResBase = 0, skillResTemp = 0, skillResRankMax = 0;
    int skillRefFinal = 0, skillRefBase = 0, skillRefTemp = 0, skillRefRankMax = 0;
    int skillInsFinal = 0, skillInsBase = 0, skillInsTemp = 0, skillInsRankMax = 0;
    int skillKnoFinal = 0, skillKnoBase = 0, skillKnoTemp = 0, skillKnoRankMax = 0;
    int skillChaFinal = 0, skillChaBase = 0, skillChaTemp = 0, skillChaRankMax = 0;

    double skillAthRank = 0.0;
    double skillEndRank = 0.0;
    double skillSurRank = 0.0;
    double skillPerRank = 0.0;
    double skillResRank = 0.0;
    double skillRefRank = 0.0;
    double skillInsRank = 0.0;
    double skillKnoRank = 0.0;
    double skillChaRank = 0.0;

    int strRankMax = 0;
    int dexRankMax = 0;
    int conRankMax = 0;
    int witRankMax = 0;
    int focRankMax = 0;
    int intRankMax = 0;

    double strRank = 0.0;
    double dexRank = 0.0;
    double conRank = 0.0;
    double witRank = 0.0;
    double focRank = 0.0;
    double intRank = 0.0;


    int potentialLevel = -1;

    int potentialSkillMax = 0;
    int potentialAttributeMax = 0;

    public Entity(int potentialLevel) {
        setPotentialLevel(potentialLevel);
    }

    public void updateFinalSkills() {
        updateBaseSkill();
        skillAthFinal = getSkillAthBase() + getSkillAthTemp() + (int) getSkillAthRank();
        skillEndFinal = getSkillEndBase() + getSkillEndTemp() + (int) getSkillEndRank();
        skillSurFinal = getSkillSurBase() + getSkillSurTemp() + (int) getSkillSurRank();
        skillPerFinal = getSkillPerBase() + getSkillPerTemp() + (int) getSkillPerRank();
        skillResFinal = getSkillResBase() + getSkillResTemp() + (int) getSkillResRank();
        skillRefFinal = getSkillRefBase() + getSkillRefTemp() + (int) getSkillRefRank();
        skillInsFinal = getSkillInsBase() + getSkillInsTemp() + (int) getSkillInsRank();
        skillKnoFinal = getSkillKnoBase() + getSkillKnoTemp() + (int) getSkillKnoRank();
        skillChaFinal = getSkillChaBase() + getSkillChaTemp() + (int) getSkillChaRank();
    }

    /**
     * updateBaseSkill is a method that calculates an creature's base Skills depending on associated Attributes
     */
    public void updateBaseSkill() {
        //skillBase = 70% Primary Attribute + 30% Secondary Attribute
        skillAthBase = (getStrFinal() * 7 + getDexBase() * 3) / 10;
        skillEndBase = (getConFinal() * 7 + getFocBase() * 3) / 10;
        skillSurBase = (getIntFinal() * 7 + getStrBase() * 3) / 10;
        skillPerBase = (getFocFinal() * 7 + getWitBase() * 3) / 10;
        skillResBase = (getWitFinal() * 7 + getConBase() * 3) / 10;
        skillRefBase = (getDexFinal() * 7 + getIntBase() * 3) / 10;
        skillInsBase = (getFocFinal() * 7 + getWitBase() * 3) / 10;
        skillKnoBase = (getIntFinal() * 7 + getFocBase() * 3) / 10;
        skillChaBase = (getWitFinal() * 7 + getIntBase() * 3) / 10;
    }

    public void calculateMaxSkillRank() {
        setSkillAthRankMax(race.getSkillAthRace() + race.getSkillAthSubrace() + (potentialLevel * 4) + ((getStrRankMax() * 7 + getDexRankMax() * 3) / 10));
        setSkillEndRankMax(race.getSkillEndRace() + race.getSkillEndSubrace() + (potentialLevel * 4) + ((getConRankMax() * 7 + getFocRankMax() * 3) / 10));
        setSkillSurRankMax(race.getSkillSurRace() + race.getSkillSurSubrace() + (potentialLevel * 4) + ((getIntRankMax() * 7 + getStrRankMax() * 3) / 10));
        setSkillPerRankMax(race.getSkillPerRace() + race.getSkillPerSubrace() + (potentialLevel * 4) + ((getFocRankMax() * 7 + getWitRankMax() * 3) / 10));
        setSkillResRankMax(race.getSkillResRace() + race.getSkillResSubrace() + (potentialLevel * 4) + ((getWitRankMax() * 7 + getConRankMax() * 3) / 10));
        setSkillRefRankMax(race.getSkillRefRace() + race.getSkillRefSubrace() + (potentialLevel * 4) + ((getDexRankMax() * 7 + getIntRankMax() * 3) / 10));
        setSkillInsRankMax(race.getSkillInsRace() + race.getSkillInsSubrace() + (potentialLevel * 4) + ((getFocRankMax() * 7 + getWitRankMax() * 3) / 10));
        setSkillKnoRankMax(race.getSkillKnoRace() + race.getSkillKnoSubrace() + (potentialLevel * 4) + ((getIntRankMax() * 7 + getFocRankMax() * 3) / 10));
        setSkillChaRankMax(race.getSkillChaRace() + race.getSkillChaSubrace() + (potentialLevel * 4) + ((getWitRankMax() * 7 + getIntRankMax() * 3) / 10));

        potentialSkillMax = getSkillAthRankMax() + getSkillEndRankMax() + getSkillSurRankMax() + getSkillPerRankMax()
                + getSkillResRankMax() + getSkillRefRankMax() + getSkillInsRankMax() + getSkillKnoRankMax() + getSkillChaRankMax();
    }

    public void calculateMaxAttributeRank() {
        Random rand = new Random();
        int basePotential = 2 + (potentialLevel * 2) + rand.nextInt(5);

        setStrRankMax(basePotential + race.getStrRace() + race.getStrSubrace());
        setDexRankMax(basePotential + race.getDexRace() + race.getDexSubrace());
        setConRankMax(basePotential + race.getConRace() + race.getConSubrace());
        setWitRankMax(basePotential + race.getWitRace() + race.getWitSubrace());
        setFocRankMax(basePotential + race.getFocRace() + race.getFocSubrace());
        setIntRankMax(basePotential + race.getIntRace() + race.getIntSubrace());

        potentialAttributeMax = getStrRankMax() + getDexRankMax() + getConRankMax()
                + getWitRankMax() + getFocRankMax() + getIntRankMax();
    }

    /**
     * updateFinalAttribute inside of {@Entity} is a method in which a creature's
     * final Attributes and Skills are calculated.
     * <p>
     * This method sets atrFinal to the sum of the following:
     * +atrBase     {@Creature}
     * +atrRace     {@Creature}
     * +atrSubrace  {@Creature}
     * +atrMainClass{@Enity}
     * +atrSubClass {@Enity}
     * <p>
     * This method set skillFinal to the sum of the follow:
     * +skillBase   {@Entity}
     */
    @Override
    public void updateFinalAttributes() {
        super.updateFinalAttributes();
        updateFinalSkills();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("-------Skills-------");
        System.out.printf("Ath: %02d/%02d | ", getSkillAthFinal(), getSkillAthRankMax());
        System.out.printf("End: %02d/%02d | ", getSkillEndFinal(), getSkillEndRankMax());
        System.out.printf("Sur: %02d/%02d \n", getSkillSurFinal(), getSkillSurRankMax());
        System.out.printf("Per: %02d/%02d | ", getSkillPerFinal(), getSkillPerRankMax());
        System.out.printf("Res: %02d/%02d | ", getSkillResFinal(), getSkillResRankMax());
        System.out.printf("Ref: %02d/%02d \n", getSkillRefFinal(), getSkillRefRankMax());
        System.out.printf("Ins: %02d/%02d | ", getSkillInsFinal(), getSkillInsRankMax());
        System.out.printf("Kno: %02d/%02d | ", getSkillKnoFinal(), getSkillKnoRankMax());
        System.out.printf("Cha: %02d/%02d \n", getSkillChaFinal(), getSkillChaRankMax());
        System.out.println("-----Potential!-----");
        System.out.println("-----Attributes-----");
        System.out.printf("Str: %05.2f/%02d | ", getStrRank(), getStrRankMax());
        System.out.printf("Con: %05.2f/%02d \n", getConRank(), getConRankMax());
        System.out.printf("Dex: %05.2f/%02d | ", getDexRank(), getDexRankMax());
        System.out.printf("Foc: %05.2f/%02d \n", getFocRank(), getFocRankMax());
        System.out.printf("Int: %05.2f/%02d | ", getIntRank(), getIntRankMax());
        System.out.printf("Wit: %05.2f/%02d \n", getWitRank(), getWitRankMax());
        System.out.println("Max potential:" +  potentialAttributeMax);
        System.out.println("Potential rating: " + (double)potentialAttributeMax / 24);
        System.out.println("-------Skills-------");
        System.out.printf("Ath: %05.2f/%02d | ", getSkillAthRank(), getSkillAthRankMax());
        System.out.printf("End: %05.2f/%02d | ", getSkillEndRank(), getSkillEndRankMax());
        System.out.printf("Sur: %05.2f/%02d \n", getSkillSurRank(), getSkillSurRankMax());
        System.out.printf("Per: %05.2f/%02d | ", getSkillPerRank(), getSkillPerRankMax());
        System.out.printf("Res: %05.2f/%02d | ", getSkillResRank(), getSkillResRankMax());
        System.out.printf("Ref: %05.2f/%02d \n", getSkillRefRank(), getSkillRefRankMax());
        System.out.printf("Ins: %05.2f/%02d | ", getSkillInsRank(), getSkillInsRankMax());
        System.out.printf("Kno: %05.2f/%02d | ", getSkillKnoRank(), getSkillKnoRankMax());
        System.out.printf("Cha: %05.2f/%02d \n", getSkillChaRank(), getSkillChaRankMax());
        System.out.println("Max potential: " + potentialSkillMax);
        System.out.println("Potential rating: " + (double) potentialSkillMax / 90);
    }

    // Getters
    //Attribute Rank Getters
    public int getStrRankMax() {
        return strRankMax;
    }

    public int getDexRankMax() {
        return dexRankMax;
    }

    public int getConRankMax() {
        return conRankMax;
    }

    public int getWitRankMax() {
        return witRankMax;
    }

    public int getFocRankMax() {
        return focRankMax;
    }

    public int getIntRankMax() {
        return intRankMax;
    }

    public double getStrRank() {
        return strRank;
    }

    public double getDexRank() {
        return dexRank;
    }

    public double getConRank() {
        return conRank;
    }

    public double getWitRank() {
        return witRank;
    }

    public double getFocRank() {
        return focRank;
    }

    public double getIntRank() {
        return intRank;
    }

    // Skill Getters
    public int getSkillAthFinal() {
        return skillAthFinal;
    }

    public int getSkillAthBase() {
        return skillAthBase;
    }

    public int getSkillAthTemp() {
        return skillAthTemp;
    }

    public int getSkillEndFinal() {
        return skillEndFinal;
    }

    public int getSkillEndBase() {
        return skillEndBase;
    }

    public int getSkillEndTemp() {
        return skillEndTemp;
    }

    public int getSkillSurFinal() {
        return skillSurFinal;
    }

    public int getSkillSurBase() {
        return skillSurBase;
    }

    public int getSkillSurTemp() {
        return skillSurTemp;
    }

    public int getSkillPerFinal() {
        return skillPerFinal;
    }

    public int getSkillPerBase() {
        return skillPerBase;
    }

    public int getSkillPerTemp() {
        return skillPerTemp;
    }

    public int getSkillResFinal() {
        return skillResFinal;
    }

    public int getSkillResBase() {
        return skillResBase;
    }

    public int getSkillResTemp() {
        return skillResTemp;
    }

    public int getSkillRefFinal() {
        return skillRefFinal;
    }

    public int getSkillRefBase() {
        return skillRefBase;
    }

    public int getSkillRefTemp() {
        return skillRefTemp;
    }

    public int getSkillInsFinal() {
        return skillInsFinal;
    }

    public int getSkillInsBase() {
        return skillInsBase;
    }

    public int getSkillInsTemp() {
        return skillInsTemp;
    }

    public int getSkillKnoFinal() {
        return skillKnoFinal;
    }

    public int getSkillKnoBase() {
        return skillKnoBase;
    }

    public int getSkillKnoTemp() {
        return skillKnoTemp;
    }

    public int getSkillChaFinal() {
        return skillChaFinal;
    }

    public int getSkillChaBase() {
        return skillChaBase;
    }

    public int getSkillChaTemp() {
        return skillChaTemp;
    }

    public double getSkillAthRank() {
        return skillAthRank;
    }

    public double getSkillEndRank() {
        return skillEndRank;
    }

    public double getSkillSurRank() {
        return skillSurRank;
    }

    public double getSkillPerRank() {
        return skillPerRank;
    }

    public double getSkillResRank() {
        return skillResRank;
    }

    public double getSkillRefRank() {
        return skillRefRank;
    }

    public double getSkillInsRank() {
        return skillInsRank;
    }

    public double getSkillKnoRank() {
        return skillKnoRank;
    }

    public double getSkillChaRank() {
        return skillChaRank;
    }

    public int getSkillAthRankMax() {
        return skillAthRankMax;
    }

    public int getSkillEndRankMax() {
        return skillEndRankMax;
    }

    public int getSkillSurRankMax() {
        return skillSurRankMax;
    }

    public int getSkillPerRankMax() {
        return skillPerRankMax;
    }

    public int getSkillResRankMax() {
        return skillResRankMax;
    }

    public int getSkillRefRankMax() {
        return skillRefRankMax;
    }

    public int getSkillInsRankMax() {
        return skillInsRankMax;
    }

    public int getSkillKnoRankMax() {
        return skillKnoRankMax;
    }

    public int getSkillChaRankMax() {
        return skillChaRankMax;
    }


    // Setters
    //Attribute Rank Setters
    public void setStrRankMax(int n) {
        if (n < 0) throw new OutOfRange(n, 0, 20);
        this.strRankMax = (n > 20) ? 20 : n;
    }

    public void setDexRankMax(int n) {
        if (n < 0) throw new OutOfRange(n, 0, 20);
        this.dexRankMax = (n > 20) ? 20 : n;
    }

    public void setConRankMax(int n) {
        if (n < 0) throw new OutOfRange(n, 0, 20);
        this.conRankMax = (n > 20) ? 20 : n;
    }

    public void setWitRankMax(int n) {
        if (n < 0) throw new OutOfRange(n, 0, 20);
        this.witRankMax = (n > 20) ? 20 : n;
    }

    public void setFocRankMax(int n) {
        if (n < 0) throw new OutOfRange(n, 0, 20);
        this.focRankMax = (n > 20) ? 20 : n;
    }

    public void setIntRankMax(int n) {
        if (n < 0) throw new OutOfRange(n, 0, 20);
        this.intRankMax = (n > 20) ? 20 : n;
    }

    // Skill Setters
    public void setSkillAthBase(int skillAthBase) {
        this.skillAthBase = skillAthBase;
    }

    public void setSkillEndBase(int skillEndBase) {
        this.skillEndBase = skillEndBase;
    }

    public void setSkillSurBase(int skillSurBase) {
        this.skillSurBase = skillSurBase;
    }

    public void setSkillPerBase(int skillPerBase) {
        this.skillPerBase = skillPerBase;
    }

    public void setSkillResBase(int skillResBase) {
        this.skillResBase = skillResBase;
    }

    public void setSkillRefBase(int skillRefBase) {
        this.skillRefBase = skillRefBase;
    }

    public void setSkillInsBase(int skillInsBase) {
        this.skillInsBase = skillInsBase;
    }

    public void setSkillKnoBase(int skillKnoBase) {
        this.skillKnoBase = skillKnoBase;
    }

    public void setSkillChaBase(int skillChaBase) {
        this.skillChaBase = skillChaBase;
    }

    public void setSkillAthFinal(int skillAthFinal) {
        this.skillAthFinal = skillAthFinal;
    }

    public void setSkillEndFinal(int skillEndFinal) {
        this.skillEndFinal = skillEndFinal;
    }

    public void setSkillSurFinal(int skillSurFinal) {
        this.skillSurFinal = skillSurFinal;
    }

    public void setSkillPerFinal(int skillPerFinal) {
        this.skillPerFinal = skillPerFinal;
    }

    public void setSkillResFinal(int skillResFinal) {
        this.skillResFinal = skillResFinal;
    }

    public void setSkillRefFinal(int skillRefFinal) {
        this.skillRefFinal = skillRefFinal;
    }

    public void setSkillInsFinal(int skillInsFinal) {
        this.skillInsFinal = skillInsFinal;
    }

    public void setSkillKnoFinal(int skillKnoFinal) {
        this.skillKnoFinal = skillKnoFinal;
    }

    public void setSkillChaFinal(int skillChaFinal) {
        this.skillChaFinal = skillChaFinal;
    }

    public void setSkillAthRank(int skillAthRank) {
        this.skillAthRank = skillAthRank;
    }

    public void setSkillEndRank(int skillEndRank) {
        this.skillEndRank = skillEndRank;
    }

    public void setSkillSurRank(int skillSurRank) {
        this.skillSurRank = skillSurRank;
    }

    public void setSkillPerRank(int skillPerRank) {
        this.skillPerRank = skillPerRank;
    }

    public void setSkillResRank(int skillResRank) {
        this.skillResRank = skillResRank;
    }

    public void setSkillRefRank(int skillRefRank) {
        this.skillRefRank = skillRefRank;
    }

    public void setSkillInsRank(int skillInsRank) {
        this.skillInsRank = skillInsRank;
    }

    public void setSkillKnoRank(int skillKnoRank) {
        this.skillKnoRank = skillKnoRank;
    }

    public void setSkillChaRank(int skillChaRank) {
        this.skillChaRank = skillChaRank;
    }

    public void setSkillAthRankMax(int n) {
        if (n < 10) {
            this.skillAthRankMax = 10;
        } else if (n > 50) {
            this.skillAthRankMax = 50;
        } else {
            this.skillAthRankMax = n;
        }

    }

    public void setSkillEndRankMax(int n) {
        if (n < 10) {
            this.skillEndRankMax = 10;
        } else if (n > 50) {
            this.skillEndRankMax = 50;
        } else {
            this.skillEndRankMax = n;
        }

    }

    public void setSkillSurRankMax(int n) {
        if (n < 10) {
            this.skillSurRankMax = 10;
        } else if (n > 50) {
            this.skillSurRankMax = 50;
        } else {
            this.skillSurRankMax = n;
        }

    }

    public void setSkillPerRankMax(int n) {
        if (n < 10) {
            this.skillPerRankMax = 10;
        } else if (n > 50) {
            this.skillPerRankMax = 50;
        } else {
            this.skillPerRankMax = n;
        }

    }

    public void setSkillResRankMax(int n) {
        if (n < 10) {
            this.skillResRankMax = 10;
        } else if (n > 50) {
            this.skillResRankMax = 50;
        } else {
            this.skillResRankMax = n;
        }

    }

    public void setSkillRefRankMax(int n) {
        if (n < 10) {
            this.skillRefRankMax = 10;
        } else if (n > 50) {
            this.skillRefRankMax = 50;
        } else {
            this.skillRefRankMax = n;
        }

    }

    public void setSkillInsRankMax(int n) {
        if (n < 10) {
            this.skillInsRankMax = 10;
        } else if (n > 50) {
            this.skillInsRankMax = 50;
        } else {
            this.skillInsRankMax = n;
        }

    }

    public void setSkillKnoRankMax(int n) {
        if (n < 10) {
            this.skillKnoRankMax = 10;
        } else if (n > 50) {
            this.skillKnoRankMax = 50;
        } else {
            this.skillKnoRankMax = n;
        }

    }

    public void setSkillChaRankMax(int n) {
        if (n < 10) {
            this.skillChaRankMax = 10;
        } else if (n > 50) {
            this.skillChaRankMax = 50;
        } else {
            this.skillChaRankMax = n;
        }

    }

    public void setSkillAthRank(double skillAthRank) {
        this.skillAthRank = skillAthRank;
    }

    public void setSkillEndRank(double skillEndRank) {
        this.skillEndRank = skillEndRank;
    }

    public void setSkillSurRank(double skillSurRank) {
        this.skillSurRank = skillSurRank;
    }

    public void setSkillPerRank(double skillPerRank) {
        this.skillPerRank = skillPerRank;
    }

    public void setSkillResRank(double skillResRank) {
        this.skillResRank = skillResRank;
    }

    public void setSkillRefRank(double skillRefRank) {
        this.skillRefRank = skillRefRank;
    }

    public void setSkillInsRank(double skillInsRank) {
        this.skillInsRank = skillInsRank;
    }

    public void setSkillKnoRank(double skillKnoRank) {
        this.skillKnoRank = skillKnoRank;
    }

    public void setSkillChaRank(double skillChaRank) {
        this.skillChaRank = skillChaRank;
    }

    public void setPotentialLevel(int n) {
        if (n < 1 || n > 3) throw new OutOfRange(n, 1, 3);
        this.potentialLevel = n;
    }
}
