package creatures.monster.goblin.mountain;

import creatures.monster.Monster;
import races.Race;
import races.goblin.subclass.DeepGoblin;
import stats.Stats;

public class DeepGoblinBigBoss extends Monster {

        public DeepGoblinBigBoss(int difficulty) {
        super(401);
        creatureName = "Deep Goblin Big Boss";
        stats = generateStats(difficulty);

    }

    public Stats generateStats(int difficulty) {
        Stats stats = new Stats();
        stats.setStrFinal((difficulty * 2) + 2 );
        stats.setDexFinal((difficulty * 3) + 3 );
        stats.setConFinal((difficulty * 1) + 4 );
        stats.setWitFinal((difficulty * 1) + 3 );
        stats.setFocFinal((difficulty * 2) + 1 );
        stats.setIntFinal((difficulty * 2) + 5 );

        stats.setSkillAthFinal((difficulty * 6) + 5);
        stats.setSkillEndFinal((difficulty * 4) + 5);
        stats.setSkillSurFinal((difficulty * 5) + 4);
        stats.setSkillPerFinal((difficulty * 6) + 8);
        stats.setSkillResFinal((difficulty * 4) + 4);
        stats.setSkillRefFinal((difficulty * 6) + 4);
        stats.setSkillInsFinal((difficulty * 4) + 7);
        stats.setSkillKnoFinal((difficulty * 5) + 5);
        stats.setSkillChaFinal((difficulty * 4) + 3);

        return stats;
    }


}
