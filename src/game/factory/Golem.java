package game.factory;
import game.strategy.AxeAttack;
import java.util.Random;

/**
 * A subclass of Monster, a specific implementation
 * */
public class Golem extends Monster {

    public Golem() {

        int minHealth = 50;
        int maxHealth = 100;
        int minGold = 5;
        int maxGold = 10;

        setName("Golem");
        Random random = new Random();
        setHealth(random.nextInt(maxHealth - minHealth + 1) + minHealth);
        setGold(random.nextInt(maxGold - minGold + 1) + minGold);
        setArmor(6);

        // this can have the potential to have a second factory method
        // to choose a random weapon and pass into monster constructor
        // but for now, we will just have fixed weapon upon instantiation

        typeOfAttack = new AxeAttack();

    }
}
