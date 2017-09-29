import creatures.entity.Entity;

public class PlayerInterface {

    public static void main(String[] args) {
        Entity testEntity = new Entity(1);
        testEntity.printInfo();

    }

/*

Make sure Current Rating is calculating correctly in Entity.PrintInfo & Entity.updateCurrentRank

Make pontential level actually matter?

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
