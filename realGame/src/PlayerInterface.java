import creatures.entity.player.PlayerEntity;
import races.elf.subclass.Wood;
import races.human.subclass.Dominion;

public class PlayerInterface {

    public static void main(String[] args) {
        PlayerEntity testEntity = new PlayerEntity();
        testEntity.updateFinalAttributes();
        testEntity.printInfo();
        testEntity.race = new Wood();
        testEntity.updateFinalAttributes();
        testEntity.printInfo();
    }

    /*

    Add class to updatefinal attributtes

    Create Classes? like 2 classes and 2 subclasses for each? fk it 1 time...

    headSlot
    chestSlot
    beltSlot
    handSlot
    legSlot
    feetSlot

    weaponSlot
    offSlot

    neckSlot
    ringOneSlot
    ringTwoSlot

    BACKGROUND LORE?
    AMBITION?
    PERSONALITY?
     */

}
