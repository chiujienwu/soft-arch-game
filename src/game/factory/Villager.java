package game.factory;
import game.strategy.FistAttack;
import java.util.Random;

/**
 * A subclass of Monster, a specific implementation
 * */
public class Villager extends Monster {

    public Villager() {

        int minHealth = 20;
        int maxHealth = 40;
        int minGold = 2;
        int maxGold = 4;

        setName("Villager");
        Random random = new Random();
        setHealth(random.nextInt(maxHealth - minHealth + 1) + minHealth);
        setGold(random.nextInt(maxGold - minGold + 1) + minGold);

        // this can have the potential to have a second factory method
        // to choose a random weapon and pass into monster constructor
        // but for now, we will just have fixed weapon upon instantiation

        typeOfAttack = new FistAttack();
    }

}
