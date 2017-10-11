package creatures;

import exceptions.IllegalGenderID;
import exceptions.IllegalSubRaceID;
import races.Race;
import races.elf.subclass.Chosen;
import races.elf.subclass.Wood;
import races.human.subclass.Dominion;
import races.human.subclass.Untargot;
import stats.Stats;

/**
 * The {@code Creature} is a main Superclass of all types of creatures in the game.
 * This is where a Creature's Race and SubRace is determined
 */

public abstract class Creature {
    public String creatureName = "none";

    private char genderID = 'M';
    private String genderName = "Male";

    public Stats stats = new Stats();

    //A Creature race is determined by setting variable {race} to a subRace class. See method {setRace} for more details
    public Race race;

    public Creature(Race raceOrSubrace) {
        race = raceOrSubrace;
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
        System.out.printf("Str: %02d | ", stats.getStrFinal());
        System.out.printf("Con: %02d |=| ", stats.getDexFinal());
        System.out.printf("Ath: %02d | ", stats.getSkillAthFinal());
        System.out.printf("End: %02d | ", stats.getSkillEndFinal());
        System.out.printf("Sur: %02d \n", stats.getSkillSurFinal());
        System.out.printf("Dex: %02d | ", stats.getConFinal());
        System.out.printf("Foc: %02d |=| ", stats.getWitFinal());
        System.out.printf("Per: %02d | ", stats.getSkillPerFinal());
        System.out.printf("Res: %02d | ", stats.getSkillResFinal());
        System.out.printf("Ref: %02d \n", stats.getSkillRefFinal());
        System.out.printf("Int: %02d | ", stats.getFocFinal());
        System.out.printf("Wit: %02d |=| ", stats.getIntFinal());
        System.out.printf("Ins: %02d | ", stats.getSkillInsFinal());
        System.out.printf("Kno: %02d | ", stats.getSkillKnoFinal());
        System.out.printf("Cha: %02d \n", stats.getSkillChaFinal());
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
