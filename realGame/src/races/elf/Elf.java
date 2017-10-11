package races.elf;

import races.Race;

public abstract class Elf extends Race {

    public Elf() {
        //Sets Race Name and ID
        setRaceName("Elf");
        setRaceID(2);

        //Sets Race Attributes
        setStrRace(genRandomAttributeRange(0));
        setConRace(genRandomAttributeRange(0));
        setDexRace(genRandomAttributeRange(0));
        setFocRace(genRandomAttributeRange(0));
        setIntRace(genRandomAttributeRange(0));
        setWitRace(genRandomAttributeRange(0));

        //Sets Race Skills
        setSkillAthRace(genRandomSkillRange(0));
        setSkillEndRace(genRandomSkillRange(0));
        setSkillSurRace(genRandomSkillRange(0));
        setSkillPerRace(genRandomSkillRange(0));
        setSkillResRace(genRandomSkillRange(0));
        setSkillRefRace(genRandomSkillRange(0));
        setSkillInsRace(genRandomSkillRange(0));
        setSkillKnoRace(genRandomSkillRange(0));
        setSkillChaRace(genRandomSkillRange(0));
    }
}
