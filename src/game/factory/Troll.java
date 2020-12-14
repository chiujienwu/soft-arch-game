package game.factory;
import game.strategy.*;
import java.util.Random;

/**
 * A subclass of Monster, a specific implementation
 * */
public class Troll extends Monster {

    public Troll() {

        int minHealth = 40;
        int maxHealth = 80;
        int minGold = 4;
        int maxGold = 8;
        setArmor(4);

        setName("Troll");
        Random random = new Random();
        setHealth(random.nextInt(maxHealth - minHealth + 1) + minHealth);
        setGold(random.nextInt(maxGold - minGold + 1) + minGold);

        // this can have the potential to have a second factory method
        // to choose a random weapon and pass into monster constructor
        // but for now, we will just have fixed weapon upon instantiation

        typeOfAttack = new SwordAttack();
    }

}
