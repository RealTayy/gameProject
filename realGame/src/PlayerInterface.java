import creatures.entity.player.PlayerEntity;
import races.elf.subclass.*;
import races.human.subclass.*;

public class PlayerInterface {

    public static void main(String[] args) {
        PlayerEntity testEntity = new PlayerEntity();
        testEntity.setRace(102);
        testEntity.updateFinalAttributes();
        testEntity.printInfo();
    }

    /*
    Determine Class paths and shit yo...
    https://img03.deviantart.net/b77b/i/2016/186/c/9/useful__rpg__classes_chart_by_halgalaz-da8uwfv.png

    Working in Entity. Trying to determine max Rank per race and what nots.

    damage types
    Physical
    Fire
    Water
    Air
    Light
    Dark

str 123456
dex 123456
con 123456
wit 123456
foc 123456
int 123456

Athletics       Str Dex
Endurance       Con Foc
Survival        Int Str
Perception      Foc Wit
Resilience      Wit Con
Reflex          Dex Int
Insight         Foc Wit
Knowledge       Int Foc
Charisma        Wit Int



    BACKGROUND LORE?
    AMBITION?
    PERSONALITY?
     */

}
