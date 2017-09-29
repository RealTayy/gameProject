package creatures;

import exceptions.IllegalGenderID;
import exceptions.IllegalSubRaceID;
import races.Race;
import races.elf.subclass.Chosen;
import races.elf.subclass.Wood;
import races.human.subclass.Dominion;
import races.human.subclass.Untargot;

/**
 * The {@code Creature} is a main Superclass of all types of creatures in the game.
 * This is where a Creature's Race and SubRace is determined
 */

public abstract class Creature {
    public String creatureName = "none";

    private char genderID = 'M';
    private String genderName = "Male";

    //A Creature race is determined by setting variable {race} to a subRace class. See method {setRace} for more details
    public Race race = new Dominion();

    public int strFinal = 0;
    public int dexFinal = 0;
    public int conFinal = 0;
    public int witFinal = 0;
    public int focFinal = 0;
    public int intFinal = 0;
    public int curTotalAttributes = 0;
    public int maxTotalAttributes = 6 * 20; // Number of Attributes * Max Attribute Final

    public int skillAthFinal = 0;
    public int skillEndFinal = 0;
    public int skillSurFinal = 0;
    public int skillPerFinal = 0;
    public int skillResFinal = 0;
    public int skillRefFinal = 0;
    public int skillInsFinal = 0;
    public int skillKnoFinal = 0;
    public int skillChaFinal = 0;
    public int curTotalSkill = 0;
    public int maxTotalSkill = 9 * 50; // Number of Skills * Max Skill Final

    public Creature() {

    }

    public void printInfo() {
        System.out.println("Printing Information for " + creatureName);
        System.out.println("------Details-------");
        System.out.println("Name:     " + creatureName);
        System.out.printf("Ranking:  %02d\n", 99999999);
        System.out.printf("Att Rank: %02d\n", 99999999);
        System.out.printf("Skl Rank: %02d\n", 99999999);
        System.out.println("Gender:   " + genderName + " (ID:" + genderID + ")");
        System.out.println("----Race/SubRace----");
        System.out.println("Race:     " + race.getRaceName() + " (ID:" + race.getRaceID() + ")");
        System.out.println("SubRace:  " + race.getSubraceName() + " (ID:" + race.getSubraceID() + ")");
        System.out.println("-----Attributes---|=|-----------Skills-----------");
        System.out.printf("Str: %02d | ", strFinal);
        System.out.printf("Con: %02d |=| ", dexFinal);
        System.out.printf("Ath: %02d | ", skillAthFinal);
        System.out.printf("End: %02d | ", skillEndFinal);
        System.out.printf("Sur: %02d \n", skillSurFinal);
        System.out.printf("Dex: %02d | ", conFinal);
        System.out.printf("Foc: %02d |=| ", witFinal);
        System.out.printf("Per: %02d | ", skillPerFinal);
        System.out.printf("Res: %02d | ", skillResFinal);
        System.out.printf("Ref: %02d \n", skillRefFinal);
        System.out.printf("Int: %02d | ", focFinal);
        System.out.printf("Wit: %02d |=| ", intFinal);
        System.out.printf("Ins: %02d | ", skillInsFinal);
        System.out.printf("Kno: %02d | ", skillKnoFinal);
        System.out.printf("Cha: %02d \n", skillChaFinal);
    }

    public abstract void setFinalAttributes();

    /**
     * This should be run everything you finish changing any Attribute or Skill
     */
    public void updateCurrentTotalAtrSkl() {
        curTotalAttributes = strFinal + dexFinal + conFinal + witFinal + focFinal + intFinal;
        curTotalSkill = skillAthFinal + skillEndFinal + skillSurFinal + skillPerFinal
                + skillResFinal + skillRefFinal + skillInsFinal + skillKnoFinal + skillChaFinal;
    }

    public void updateCurrentFinalAtrSkl() {

        updateCurrentTotalAtrSkl();
    }

    //Setters

    /**
     * Takes given genderID and sets the genderID and genderName to the correct gender
     * throws IllegalGenderIF if entered genderID is not valid
     * Current Genders:
     * > (M) Male
     * > (F) Female
     *
     * @param genderID
     * @throws IllegalGenderID if not valid genderIF
     */
    public void setGenderID(char genderID) {
        if (genderID != 'M' & genderID != 'F') {
            throw new IllegalGenderID(Character.toString(genderID));
        } else {
            this.genderID = genderID;
            if (genderID == 'M') {
                this.genderName = ("Male");
            } else if (genderID == 'F') {
                this.genderName = ("Female");
            }
        }
    }

    /**
     * Takes given genderName and sets the genderName and genderID to the correct gender
     * throws IllegalGenderIF if entered genderName is not valid
     * Current Genders:
     * > Male (M)
     * > Female (F)
     *
     * @param genderName
     * @throws IllegalGenderID if not valid genderIF
     */
    public void setGenderName(String genderName) {
        if (genderName != "Male" & genderName != "Female") {
            throw new IllegalGenderID(genderName);
        } else {
            this.genderName = genderName;
            if (genderName == "Male") {
                this.genderID = ('M');
            } else if (genderName == "Female") {
                this.genderID = ('F');
            }
        }
    }

    /**
     * Sets a creature.race to a specified Race instance.
     * Changes creatures's raceName/SubraceName and raceID/SubraceID to the appropriate values.
     * Changes atrRace/atrSubrace to the appropriate values
     *
     * @param subRaceID changes the above according to the subRaceID given. subRaceID values can be
     *                  found inside each subRace Class. A master list can be found in {@Race}
     */
    public void setRace(int subRaceID) {
        switch (subRaceID) {
            case 101:
                race = new Dominion();
                break;
            case 102:
                race = new Untargot();
                break;
            case 201:
                race = new Chosen();
                break;
            case 202:
                race = new Wood();
                break;
            default:
                throw new IllegalSubRaceID(subRaceID);
        }
    }

}
