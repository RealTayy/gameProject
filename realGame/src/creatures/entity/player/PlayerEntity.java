package creatures.entity.player;

import creatures.entity.Entity;

/**
 * The {@code PlayerEntity} class is the superclass of all Player Characters.
 *
 * PlayerEntity has atrPoints which are assigned by the Player.
 */
public class PlayerEntity extends Entity {

    public PlayerEntity(int potentialLevel) {
        super(potentialLevel);
    }

    /**
     * updateFinalAttribute inside of {@PlayerEntity} is a method in which a creature's
     * final stats are calculated.
     *
     * This method sets atrFinal to the sum of the following:
     * +atrBase     {@Creature}
     * +atrRace     {@Creature}
     * +atrSubrace  {@Creature}
     * +atrMainClass{@Enity}
     * +atrSubClass {@Enity}
     */
    @Override
    public void updateFinalAttributes() {
        super.updateFinalAttributes();

    }

    @Override
    public void updateCombatAttributes() {

    }

    // Getters


    // Setters

}
