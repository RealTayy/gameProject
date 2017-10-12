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

    public double getCurAttributeRating() {
        return 5 * ((double) getCurTotalAttribute() / (double) maxTotalAttribute);
    }

    public double getCurSkillRating() {
        return 5 * ((double) getCurTotalSkill() / (double) maxTotalSkill);
    }






    // Setters

    public void setStrFinal(int n) {
        this.strFinal = (n < 1) ? 1 : n;
    }

    public void setDexFinal(int n) {
        this.dexFinal = (n < 1) ? 1 : n;
    }

    public void setConFinal(int n) {
        this.conFinal = (n < 1) ? 1 : n;
    }

    public void setWitFinal(int n) {
        this.witFinal = (n < 1) ? 1 : n;
    }

    public void setFocFinal(int n) {
        this.focFinal = (n < 1) ? 1 : n;
    }

    public void setIntFinal(int n) {
        this.intFinal = (n < 1) ? 1 : n;
    }

    public void setSkillAthFinal(int n) {
        this.skillAthFinal = (n < 1) ? 1 : n;
    }

    public void setSkillEndFinal(int n) {
        this.skillEndFinal = (n < 1) ? 1 : n;
    }

    public void setSkillSurFinal(int n) {
        this.skillSurFinal = (n < 1) ? 1 : n;
    }

    public void setSkillPerFinal(int n) {
        this.skillPerFinal = (n < 1) ? 1 : n;
    }

    public void setSkillResFinal(int n) {
        this.skillResFinal = (n < 1) ? 1 : n;
    }

    public void setSkillRefFinal(int n) {
        this.skillRefFinal = (n < 1) ? 1 : n;
    }

    public void setSkillInsFinal(int n) {
        this.skillInsFinal = (n < 1) ? 1 : n;
    }

    public void setSkillKnoFinal(int n) {
        this.skillKnoFinal = (n < 1) ? 1 : n;
    }

    public void setSkillChaFinal(int n) {
        this.skillChaFinal = (n < 1) ? 1 : n;
    }
}