package races.human.subclass;

import races.human.Human;

public class Dominion extends Human {

    public Dominion() {
        super();

        //Sets Subrace Name and ID
        setSubraceName("Dominion");
        setSubraceID(101);

        //Sets Subrace Attributes
        setStrSubrace(genRandomAttributeRange(5));
        setDexSubrace(genRandomAttributeRange(2));
        setConSubrace(genRandomAttributeRange(5));
        setWitSubrace(genRandomAttributeRange(1));
        setFocSubrace(genRandomAttributeRange(1));
        setIntSubrace(genRandomAttributeRange(1));

        //Sets Subrace Skills
        setSkillAthSubrace(genRandomSkillRange(5));
        setSkillEndSubrace(genRandomSkillRange(5));
        setSkillSurSubrace(genRandomSkillRange(5));
        setSkillPerSubrace(genRandomSkillRange(5));
        setSkillResSubrace(genRandomSkillRange(5));
        setSkillRefSubrace(genRandomSkillRange(5));
        setSkillInsSubrace(genRandomSkillRange(5));
        setSkillKnoSubrace(genRandomSkillRange(5));
        setSkillChaSubrace(genRandomSkillRange(5));
    }
}
