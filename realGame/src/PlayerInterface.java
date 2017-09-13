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

    damage types
    Physical
    Fire
    Water
    Air
    Light
    Dark

>>WARRIOR<<                     >>SCOUT<<                       >>SPELLCASTER<<
[Fighter]                       [Rogue]                         [MAGE]
1|STR.War.str|Duelist           1|DEX.Rog.dex|                  1|INT.Mag.int|Archmage
2|STR.War.str|B.Dancer          2|DEX.Rog.dex|                  2|INT.Mag.int|Warlock
3|STR.War.str|Soldier           3|DEX.Rog.dex|                  3|INT.Mag.int|Spell Sword

[Barbarian]                     [Monk]
1|CON.War.con|Beserker          1|AGI.Rog.agi|Brawler           1|WIS.Mag.wis|Page
2|CON.War.con|Warlord           2|AGI.Rog.agi|Martial Artist    2|WIS.Mag.wis|Diviner
3|CON.War.con|Marauder          3|AGI.Rog.agi|                  3|WIS.Mag.wis|Enchanter

[Knight]                        [Marksman]
1|DEF.War.def|Paladin           1|FOC.Rog.foc|Gunslinger        1|CHR.Mag.chr|Bard
2|DEF.War.def|Sentinel          2|FOC.Rog.foc|Ranger            2|CHR.Mag.chr|Druid
3|DEF.War.def|Death Knight      3|FOC.Rog.foc|Sniper            3|CHR.Mag.chr|Sorcerer


    LVLing up
    1-3 Archetype class +2 MainCat  +1 SubCat   +1 OtherCat
    1-5 Main Class      +2 MainCat  +2 SubCat   +1 OtherCat +1 MainStat
    1-5 Sub Class       +2 MainCat  +2 SubCat   +2 OtherCat +1 MainStat + 2ndMainStat

    Finish printInfo in @Entity class

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
