package creatures.entity;

import creatures.Creature;

/**
 * The {@code Entity} abstract class is the superclass of all
 * PlayerEntity and EnemyEntity objects.
 * <p>
 * This is where a creature's MainClass and SubClass are determined
 */
public abstract class Entity extends Creature {

    int skillAthFinal = 0, skillAthBase = 0, skillAthTemp = 0, skillAthRank = 0;
    int skillEndFinal = 0, skillEndBase = 0, skillEndTemp = 0, skillEndRank = 0;
    int skillSurFinal = 0, skillSurBase = 0, skillSurTemp = 0, skillSurRank = 0;
    int skillPerFinal = 0, skillPerBase = 0, skillPerTemp = 0, skillPerRank = 0;
    int skillResFinal = 0, skillResBase = 0, skillResTemp = 0, skillResRank = 0;
    int skillRefFinal = 0, skillRefBase = 0, skillRefTemp = 0, skillRefRank = 0;
    int skillInsFinal = 0, skillInsBase = 0, skillInsTemp = 0, skillInsRank = 0;
    int skillKnoFinal = 0, skillKnoBase = 0, skillKnoTemp = 0, skillKnoRank = 0;
    int skillChaFinal = 0, skillChaBase = 0, skillChaTemp = 0, skillChaRank = 0;

    double potentialMultiplier = 1.0;

    public void updateFinalSkills() {
        updateBaseSkill();
        skillAthFinal = getSkillAthBase() + getSkillAthTemp() + getSkillAthRank();
        skillEndFinal = getSkillEndBase() + getSkillEndTemp() + getSkillEndRank();
        skillSurFinal = getSkillSurBase() + getSkillSurTemp() + getSkillSurRank();
        skillPerFinal = getSkillPerBase() + getSkillPerTemp() + getSkillPerRank();
        skillResFinal = getSkillResBase() + getSkillResTemp() + getSkillResRank();
        skillRefFinal = getSkillRefBase() + getSkillRefTemp() + getSkillRefRank();
        skillInsFinal = getSkillInsBase() + getSkillInsTemp() + getSkillInsRank();
        skillKnoFinal = getSkillKnoBase() + getSkillKnoTemp() + getSkillKnoRank();
        skillChaFinal = getSkillChaBase() + getSkillChaTemp() + getSkillChaRank();
    }

    /**
     * updateBaseSkill is a method that calculates an creature's base Skills depending on associated Attributes
     */
    public void updateBaseSkill() {
        skillAthBase = (getStrFinal() * 7 + getDexBase() * 3) / 10;
        skillEndBase = (getConFinal() * 7 + getFocBase() * 3) / 10;
        skillSurBase = (getIntFinal() * 7 + getStrBase() * 3) / 10;
        skillPerBase = (getFocFinal() * 7 + getWitBase() * 3) / 10;
        skillResBase = (getWitFinal() * 7 + getConBase() * 3) / 10;
        skillRefBase = (getDexFinal() * 7 + getIntBase() * 3) / 10;
        skillInsBase = (getFocFinal() * 7 + getWitBase() * 3) / 10;
        skillKnoBase = (getIntFinal() * 5 + getFocBase() * 5) / 10;
        skillChaBase = (getWitFinal() * 7 + getIntBase() * 3) / 10;
    }

    /**
     * updateFinalAttribute inside of {@Entity} is a method in which a creature's
     * final Attributes and Skills are calculated.
     *
     * This method sets atrFinal to the sum of the following:
     * +atrBase     {@Creature}
     * +atrRace     {@Creature}
     * +atrSubrace  {@Creature}
     * +atrMainClass{@Enity}
     * +atrSubClass {@Enity}
     *
     * This method set skillFinal to the sum of the follow:
     * +skillBase   {@Entity}
     *
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
        System.out.printf("Ath: %02d | ", getSkillAthFinal());
        System.out.printf("End: %02d | ", getSkillEndFinal());
        System.out.printf("Sur: %02d \n", getSkillSurFinal());
        System.out.printf("Per: %02d | ", getSkillPerFinal());
        System.out.printf("Res: %02d | ", getSkillResFinal());
        System.out.printf("Ref: %02d \n", getSkillRefFinal());
        System.out.printf("Ins: %02d | ", getSkillInsFinal());
        System.out.printf("Kno: %02d | ", getSkillKnoFinal());
        System.out.printf("Cha: %02d \n", getSkillChaFinal());
    }

    // Getters
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

    public int getSkillAthRank() {
        return skillAthRank;
    }

    public int getSkillEndRank() {
        return skillEndRank;
    }

    public int getSkillSurRank() {
        return skillSurRank;
    }

    public int getSkillPerRank() {
        return skillPerRank;
    }

    public int getSkillResRank() {
        return skillResRank;
    }

    public int getSkillRefRank() {
        return skillRefRank;
    }

    public int getSkillInsRank() {
        return skillInsRank;
    }

    public int getSkillKnoRank() {
        return skillKnoRank;
    }

    public int getSkillChaRank() {
        return skillChaRank;
    }

    // Setters
    // Skill Setters
    public void setSkillAthFinal(int skillAthFinal) {
        this.skillAthFinal = skillAthFinal;
    }

    public void setSkillAthBase(int skillAthBase) {
        this.skillAthBase = skillAthBase;
    }

    public void setSkillAthTemp(int skillAthTemp) {
        this.skillAthTemp = skillAthTemp;
    }

    public void setSkillEndFinal(int skillEndFinal) {
        this.skillEndFinal = skillEndFinal;
    }

    public void setSkillEndBase(int skillEndBase) {
        this.skillEndBase = skillEndBase;
    }

    public void setSkillEndTemp(int skillEndTemp) {
        this.skillEndTemp = skillEndTemp;
    }

    public void setSkillSurFinal(int skillSurFinal) {
        this.skillSurFinal = skillSurFinal;
    }

    public void setSkillSurBase(int skillSurBase) {
        this.skillSurBase = skillSurBase;
    }

    public void setSkillSurTemp(int skillSurTemp) {
        this.skillSurTemp = skillSurTemp;
    }

    public void setSkillPerFinal(int skillPerFinal) {
        this.skillPerFinal = skillPerFinal;
    }

    public void setSkillPerBase(int skillPerBase) {
        this.skillPerBase = skillPerBase;
    }

    public void setSkillPerTemp(int skillPerTemp) {
        this.skillPerTemp = skillPerTemp;
    }

    public void setSkillResFinal(int skillResFinal) {
        this.skillResFinal = skillResFinal;
    }

    public void setSkillResBase(int skillResBase) {
        this.skillResBase = skillResBase;
    }

    public void setSkillResTemp(int skillResTemp) {
        this.skillResTemp = skillResTemp;
    }

    public void setSkillRefFinal(int skillRefFinal) {
        this.skillRefFinal = skillRefFinal;
    }

    public void setSkillRefBase(int skillRefBase) {
        this.skillRefBase = skillRefBase;
    }

    public void setSkillRefTemp(int skillRefTemp) {
        this.skillRefTemp = skillRefTemp;
    }

    public void setSkillInsFinal(int skillInsFinal) {
        this.skillInsFinal = skillInsFinal;
    }

    public void setSkillInsBase(int skillInsBase) {
        this.skillInsBase = skillInsBase;
    }

    public void setSkillInsTemp(int skillInsTemp) {
        this.skillInsTemp = skillInsTemp;
    }

    public void setSkillKnoFinal(int skillKnoFinal) {
        this.skillKnoFinal = skillKnoFinal;
    }

    public void setSkillKnoBase(int skillKnoBase) {
        this.skillKnoBase = skillKnoBase;
    }

    public void setSkillKnoTemp(int skillKnoTemp) {
        this.skillKnoTemp = skillKnoTemp;
    }

    public void setSkillChaFinal(int skillChaFinal) {
        this.skillChaFinal = skillChaFinal;
    }

    public void setSkillChaBase(int skillChaBase) {
        this.skillChaBase = skillChaBase;
    }

    public void setSkillChaTemp(int skillChaTemp) {
        this.skillChaTemp = skillChaTemp;
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
}
