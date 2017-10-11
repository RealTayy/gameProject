package races.elf.subclass;

import races.elf.Elf;

public class Wood extends Elf {

    public Wood() {
        super();

        //Sets Subrace Name and ID
        setSubraceName("Wood");
        setSubraceID(202);

        //Sets Subrace Attributes
        setStrSubrace(genRandomAttributeRange(0));
        setConSubrace(genRandomAttributeRange(0));
        setDexSubrace(genRandomAttributeRange(0));
        setFocSubrace(genRandomAttributeRange(0));
        setIntSubrace(genRandomAttributeRange(0));
        setWitSubrace(genRandomAttributeRange(0));

        //Sets Subrace Skills
        setSkillAthSubrace(genRandomSkillRange(0));
        setSkillEndSubrace(genRandomSkillRange(0));
        setSkillSurSubrace(genRandomSkillRange(0));
        setSkillPerSubrace(genRandomSkillRange(0));
        setSkillResSubrace(genRandomSkillRange(0));
        setSkillRefSubrace(genRandomSkillRange(0));
        setSkillInsSubrace(genRandomSkillRange(0));
        setSkillKnoSubrace(genRandomSkillRange(0));
        setSkillChaSubrace(genRandomSkillRange(0));
    }
}
