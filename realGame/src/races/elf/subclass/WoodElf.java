package races.elf.subclass;

import races.elf.Elf;

public class WoodElf extends Elf {

    public WoodElf() {
        super();

        //Sets Subrace Name and ID
        setSubraceName("WoodElf");
        setSubraceID(202);

        //Sets Subrace Attributes
        setStrSubrace(genRandomAttributeRange(5));
        setDexSubrace(genRandomAttributeRange(5));
        setConSubrace(genRandomAttributeRange(2));
        setWitSubrace(genRandomAttributeRange(1));
        setFocSubrace(genRandomAttributeRange(1));
        setIntSubrace(genRandomAttributeRange(1));

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
