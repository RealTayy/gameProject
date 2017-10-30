package party;

import creatures.Creature;
import exceptions.OutOfRange;

import java.util.ArrayList;

public class Party {

    int partySizeLimit = 6; // needs work

    public ArrayList<Creature> partyMembers = new ArrayList<>();

    /**
     *
     */
    public void printInfo() {
        System.out.println("=====Party Info=====");
        System.out.println("Party Size: " + getPartySize());
        for (int i = 0 ; i < getPartySize(); i++ ) {
            System.out.println("------Slot #" + (i + 1) + "------");
            System.out.println("Name : " + slot(i).getName());
            System.out.println("Race : " + slot(i).race.getRaceName());
            System.out.println("Subrace : " + slot(i).race.getSubraceName());
            System.out.printf("> A.Rank: %4.2f     | S.Rank: %4.2f\n" , slot(i).stats.getCurAttributeRating(), slot(i).stats.getCurSkillRating());
            System.out.printf("> Str: %02d  ", slot(i).stats.getStrFinal());
            System.out.printf("Dex: %02d | ", slot(i).stats.getDexFinal());
            System.out.printf("Ath: %02d  ", slot(i).stats.getSkillAthFinal());
            System.out.printf("End: %02d  ", slot(i).stats.getSkillEndFinal());
            System.out.printf("Sur: %02d \n", slot(i).stats.getSkillSurFinal());
            System.out.printf("> Con: %02d  ", slot(i).stats.getConFinal());
            System.out.printf("Wit: %02d | ", slot(i).stats.getWitFinal());
            System.out.printf("Per: %02d  ", slot(i).stats.getSkillPerFinal());
            System.out.printf("Res: %02d  ", slot(i).stats.getSkillResFinal());
            System.out.printf("Ref: %02d \n", slot(i).stats.getSkillRefFinal());
            System.out.printf("> Foc: %02d  ", slot(i).stats.getFocFinal());
            System.out.printf("Int: %02d | ", slot(i).stats.getIntFinal());
            System.out.printf("Ins: %02d  ", slot(i).stats.getSkillInsFinal());
            System.out.printf("Kno: %02d  ", slot(i).stats.getSkillKnoFinal());
            System.out.printf("Cha: %02d \n", slot(i).stats.getSkillChaFinal());
        }
    }

    /**
     *
     * @param creature
     */
    public void addMember(Creature creature) {
        partyMembers.add(creature);
    }

    /**
     *
     * @param index
     * @return
     */
    public Creature slot(int index){
        return partyMembers.get(index);
    }






    // Getters
    public int getPartySize() {
        return partyMembers.size();
    }







    // Setters
    public void setPartySizeLimit(int partySize) {
         if (partySize > 8) throw new OutOfRange(partySize, 0, 8);
    }

    public static void main(String[] args) {

    }




}

