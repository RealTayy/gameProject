import creatures.entity.player.PlayerEntity;
import races.elf.subclass.*;
import races.human.subclass.*;

public class PlayerInterface {

    public static void main(String[] args) {
        PlayerEntity testEntity = new PlayerEntity(2);
        testEntity.calculateMaxAttributeRank();
        testEntity.calculateMaxSkillRank();
        testEntity.updateFinalAttributes();
        testEntity.printInfo();
    }

    /*
    Determine Class paths and shit yo...
    https://img03.deviantart.net/b77b/i/2016/186/c/9/useful__rpg__classes_chart_by_halgalaz-da8uwfv.png

    calculateMaxAttributeRank see if you want to randomize base potential for each attr vs blanket?

    update calculateMaxSkillRank



    damage types
    Physical
    Fire
    Water
    Air
    Light
    Dark

str Str 123456
dex Dex 123456
con Con 123456
wit Wit 123456
foc Foc 123456
int Int 123456

ath Athletics       Str Dex
end Endurance       Con Foc
sur Survival        Int Str
per Perception      Foc Wit
res Resilience      Wit Con
ref Reflex          Dex Int
ins Insight         Foc Wit
kno Knowledge       Int Foc
cha Charisma        Wit Int



    BACKGROUND LORE?
    AMBITION?
    PERSONALITY?
     */

}
