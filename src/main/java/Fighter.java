import java.util.Random;

public class Fighter extends Class  {

    @Override
    public void attack(Player player){
    int fighterAttackScore = player.getAttackScore();
    int proficiency = player.getProwessScore();

    Random ran = new Random();
    int d20 = ran.nextInt(20);

    int attackRoll = fighterAttackScore + proficiency + d20;

    }
}
