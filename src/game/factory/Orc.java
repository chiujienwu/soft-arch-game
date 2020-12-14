package game.factory;
import game.strategy.*;
import java.util.Random;

/**
 * A subclass of Monster, a specific implementation
 * */
public class Orc extends Monster {

    public Orc() {

        int minHealth = 30;
        int maxHealth = 60;
        int minGold = 3;
        int maxGold = 6;

        setName("Orc");
        Random random = new Random();
        setHealth(random.nextInt(maxHealth - minHealth + 1) + minHealth);
        setGold(random.nextInt(maxGold - minGold + 1) + minGold);
        setArmor(2);

        // this can have the potential to have a second factory method
        // to choose a random weapon and pass into monster constructor
        // but for now, we will just have fixed weapon upon instantiation

        typeOfAttack = new BowAttack();
    }

}
