package races.elf;

import races.Race;

public abstract class Elf extends Race {

    public Elf() {
        //Sets Race Name and ID
        setRaceName("Elf");
        setRaceID(2);

        //Sets Race Attributes
        setStrRace(5);
        setConRace(5);
        setDexRace(5);
        setFocRace(5);
        setIntRace(5);
        setWitRace(5);

        //Sets Race Skills
        setSkillAthRace(5);
        setSkillEndRace(5);
        setSkillSurRace(5);
        setSkillPerRace(5);
        setSkillResRace(5);
        setSkillRefRace(5);
        setSkillInsRace(5);
        setSkillKnoRace(5);
        setSkillChaRace(5);
    }
}
