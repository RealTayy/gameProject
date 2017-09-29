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
        setConSubrace(genRandomAttributeRange(0));
        setDexSubrace(genRandomAttributeRange(3));
        setFocSubrace(genRandomAttributeRange(3));
        setIntSubrace(genRandomAttributeRange(3));
        setWitSubrace(genRandomAttributeRange(3));

        //Sets Subrace Skills
        setSkillAthSubrace(genRandomSkillRange(2));
        setSkillEndSubrace(genRandomSkillRange(2));
        setSkillSurSubrace(genRandomSkillRange(4));
        setSkillPerSubrace(genRandomSkillRange(9));
        setSkillResSubrace(genRandomSkillRange(4));
        setSkillRefSubrace(genRandomSkillRange(6));
        setSkillInsSubrace(genRandomSkillRange(3));
        setSkillKnoSubrace(genRandomSkillRange(9));
        setSkillChaSubrace(genRandomSkillRange(6));
    }
}
