package creatures.entity;

import creatures.Creature;
import races.Race;
import stats.Rank;

public class Entity extends Creature {

    Rank rank;

    public Entity(int subraceID, int potentialLevel, int percentDeveloped) {
        super(subraceID);
        rank = new Rank(super.race, potentialLevel, percentDeveloped);
        stats = rank;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("----PotentialLVL----");
        System.out.println("Potential Level: " + rank.getPotentialLevel());
        System.out.println("Development Percentage: " + rank.getPercentDeveloped() + "%");
        System.out.println("-----Attributes-----");
        System.out.printf("Str: %05.2f/%02d | ", rank.getStrRank(), rank.getStrMaxRank());
        System.out.printf("Dex: %05.2f/%02d \n", rank.getDexRank(), rank.getDexMaxRank());
        System.out.printf("Con: %05.2f/%02d | ", rank.getConRank(), rank.getConMaxRank());
        System.out.printf("Wit: %05.2f/%02d \n", rank.getWitRank(), rank.getWitMaxRank());
        System.out.printf("Foc: %05.2f/%02d | ", rank.getFocRank(), rank.getFocMaxRank());
        System.out.printf("Int: %05.2f/%02d \n", rank.getIntRank(), rank.getIntMaxRank());
        System.out.printf("A.Total/Max: %.2f/%02d \n", rank.getCurTotalAttributeRank(), rank.getMaxTotalAttributeRank());
        System.out.printf("Current Rating: %.2f/%4.2f \n", rank.getCurAttributeRankRating(), rank.getMaxAttributeRankRating());
        System.out.println("-------Skills-------");
        System.out.printf("Ath: %05.2f/%02d | ", rank.getSkillAthRank(), rank.getSkillAthMaxRank());
        System.out.printf("End: %05.2f/%02d | ", rank.getSkillEndRank(), rank.getSkillEndMaxRank());
        System.out.printf("Sur: %05.2f/%02d \n", rank.getSkillSurRank(), rank.getSkillSurMaxRank());
        System.out.printf("Per: %05.2f/%02d | ", rank.getSkillPerRank(), rank.getSkillPerMaxRank());
        System.out.printf("Res: %05.2f/%02d | ", rank.getSkillResRank(), rank.getSkillResMaxRank());
        System.out.printf("Ref: %05.2f/%02d \n", rank.getSkillRefRank(), rank.getSkillRefMaxRank());
        System.out.printf("Ins: %05.2f/%02d | ", rank.getSkillInsRank(), rank.getSkillInsMaxRank());
        System.out.printf("Kno: %05.2f/%02d | ", rank.getSkillKnoRank(), rank.getSkillKnoMaxRank());
        System.out.printf("Cha: %05.2f/%02d \n", rank.getSkillChaRank(), rank.getSkillChaMaxRank());
        System.out.printf("S.Total/Max: %.2f/%02d \n", rank.getCurTotalSkillRank(), rank.getMaxTotalSkillRank());
        System.out.printf("Current Rating: %.2f/%4.2f \n", rank.getCurSkillRankRating(), rank.getMaxSkillRankRating());
    }
}