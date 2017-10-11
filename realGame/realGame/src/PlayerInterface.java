import creatures.entity.Entity;
import races.elf.subclass.*;
import races.human.subclass.*;

import java.util.Arrays;

public class PlayerInterface {

    public static void main(String[] args) {
        Entity testEntity = new Entity(new Dominion(), 3, 100);
        testEntity.printInfo();
    }

/*
setFinalAttributesAndSkills and Skills in Entity from Creatures abstract method


==Attributes==
str Str 123456
dex Dex 123456
con Con 123456
wit Wit 123456
foc Foc 123456
int Int 123456

==Skills==
ath Athletics       Str Dex
end Endurance       Con Foc
sur Survival        Int Str
per Perception      Foc Wit
res Resilience      Wit Con
ref Reflex          Dex Int
ins Insight         Foc Wit
kno Knowledge       Int Foc
cha Charisma        Wit Int

*/

}
