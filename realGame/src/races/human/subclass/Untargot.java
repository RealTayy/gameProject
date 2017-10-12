package races.human.subclass;

import races.human.Human;

public class Untargot extends Human {

    public Untargot() {
        super();

        //Sets Subrace Name and ID
        setSubraceName("Untargot");
        setSubraceID(102);

        //Sets Subrace Attributes
        setStrSubrace(genRandomAttributeRange(5));
        setDexSubrace(genRandomAttributeRange(5));
        setConSubrace(genRandomAttributeRange(2));
        setWitSubrace(genRandomAttributeRange(1));
        setFocSubrace(genRandomAttributeRange(1));
        setIntSubrace(genRandomAttributeRange(1));

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
