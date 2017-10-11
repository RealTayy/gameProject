package stats;

public class Stats {
    private int strFinal = 0;
    private int dexFinal = 0;
    private int conFinal = 0;
    private int witFinal = 0;
    private int focFinal = 0;
    private int intFinal = 0;
    private int maxTotalAttribute = 6 * 20; // Number of Attributes * Max Attribute Final

    private int skillAthFinal = 0;
    private int skillEndFinal = 0;
    private int skillSurFinal = 0;
    private int skillPerFinal = 0;
    private int skillResFinal = 0;
    private int skillRefFinal = 0;
    private int skillInsFinal = 0;
    private int skillKnoFinal = 0;
    private int skillChaFinal = 0;
    private int maxTotalSkill = 9 * 50; // Number of Skills * Max Skill Final

    public void setFinalAttributesAndSkills(){

    }

    // Getters

    public int getStrFinal() {
        return strFinal;
    }

    public int getDexFinal() {
        return dexFinal;
    }

    public int getConFinal() {
        return conFinal;
    }

    public int getWitFinal() {
        return witFinal;
    }

    public int getFocFinal() {
        return focFinal;
    }

    public int getIntFinal() {
        return intFinal;
    }

    public int getCurTotalAttribute() {
        return strFinal + dexFinal + conFinal + witFinal + focFinal + intFinal;
    }

    public int getMaxTotalAttribute() {
        return maxTotalAttribute;
    }

    public int getSkillAthFinal() {
        return skillAthFinal;
    }

    public int getSkillEndFinal() {
        return skillEndFinal;
    }

    public int getSkillSurFinal() {
        return skillSurFinal;
    }

    public int getSkillPerFinal() {
        return skillPerFinal;
    }

    public int getSkillResFinal() {
        return skillResFinal;
    }

    public int getSkillRefFinal() {
        return skillRefFinal;
    }

    public int getSkillInsFinal() {
        return skillInsFinal;
    }

    public int getSkillKnoFinal() {
        return skillKnoFinal;
    }

    public int getSkillChaFinal() {
        return skillChaFinal;
    }

    public int getCurTotalSkill() {
        return skillAthFinal + skillEndFinal + skillSurFinal + skillPerFinal + skillResFinal + skillRefFinal + skillInsFinal + skillKnoFinal + skillChaFinal;
    }

    public int getMaxTotalSkill() {
        return maxTotalSkill;
    }






    // Setters

    public void setStrFinal(int strFinal) {
        this.strFinal = strFinal;
    }

    public void setDexFinal(int dexFinal) {
        this.dexFinal = dexFinal;
    }

    public void setConFinal(int conFinal) {
        this.conFinal = conFinal;
    }

    public void setWitFinal(int witFinal) {
        this.witFinal = witFinal;
    }

    public void setFocFinal(int focFinal) {
        this.focFinal = focFinal;
    }

    public void setIntFinal(int intFinal) {
        this.intFinal = intFinal;
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
}