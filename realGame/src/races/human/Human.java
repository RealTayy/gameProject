package races.human;

import races.Race;

public abstract class Human extends Race {

    public Human() {
        //Sets Race Name and ID
        setRaceName("Human");
        setRaceID(1);

        //Sets Race Attributes
        setStrRace(genRandomAttributeRange(3));
        setConRace(genRandomAttributeRange(3));
        setDexRace(genRandomAttributeRange(3));
        setFocRace(genRandomAttributeRange(3));
        setIntRace(genRandomAttributeRange(3));
        setWitRace(genRandomAttributeRange(3));

        //Sets Race Skills
        setSkillAthRace(genRandomSkillRange(3));
        setSkillEndRace(genRandomSkillRange(3));
        setSkillSurRace(genRandomSkillRange(7));
        setSkillPerRace(genRandomSkillRange(8));
        setSkillResRace(genRandomSkillRange(6));
        setSkillRefRace(genRandomSkillRange(7));
        setSkillInsRace(genRandomSkillRange(5));
        setSkillKnoRace(genRandomSkillRange(7));
        setSkillChaRace(genRandomSkillRange(7));
    }
}