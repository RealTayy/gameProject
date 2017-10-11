package exceptions;

/**
 * Created by Tay on 9/30/2017.
 */
public class IllegalAtrOrSkill extends RuntimeException {

    public IllegalAtrOrSkill(){
        super();
    }

    public IllegalAtrOrSkill(String attributeOrSkill){
        super(attributeOrSkill + " is not an accepted Attribute or Skill. See creatures.entity.Entity.isRankMaxed() for accepted arguments");
    }
}
