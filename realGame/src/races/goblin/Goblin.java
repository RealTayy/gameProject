package races.goblin;

import races.Race;

public abstract class Goblin extends Race {

    public Goblin(){
        //Sets Race Name and ID
        setRaceName("Goblin");
        setRaceID(4);

        //Sets Race Attributes
        setStrRace(genRandomAttributeRange(4));
        setDexRace(genRandomAttributeRange(2));
        setConRace(genRandomAttributeRange(4));
        setWitRace(genRandomAttributeRange(2));
        setFocRace(genRandomAttributeRange(1));
        setIntRace(genRandomAttributeRange(2));

        //Sets Race Skills
        setSkillAthRace(genRandomSkillRange(5));
        setSkillEndRace(genRandomSkillRange(5));
        setSkillSurRace(genRandomSkillRange(5));
        setSkillPerRace(genRandomSkillRange(5));
        setSkillResRace(genRandomSkillRange(5));
        setSkillRefRace(genRandomSkillRange(5));
        setSkillInsRace(genRandomSkillRange(5));
        setSkillKnoRace(genRandomSkillRange(5));
        setSkillChaRace(genRandomSkillRange(5));
    }
}
