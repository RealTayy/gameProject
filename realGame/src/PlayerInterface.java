import creatures.Creature;
import creatures.entity.Entity;
import party.Party;

public class PlayerInterface {

    public static void main(String[] args) {
        Creature oliverKing = new Entity(101, 5, 50);
        oliverKing.setName("Oliver King");

        Creature liliVStrunk = new Entity(102, 5, 50);
        liliVStrunk.setName("Lilith V Struk");
        liliVStrunk.setGenderID('F');

        Creature hannsGunn = new Entity(202, 5, 50);
        hannsGunn.setName("Hanns Gunn");


        Party curParty = new Party();
        curParty.addMember(oliverKing);
        curParty.addMember(liliVStrunk);
        curParty.addMember(hannsGunn);
        curParty.printInfo();

        curParty.slot(1).printInfo();
    }

/*

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
