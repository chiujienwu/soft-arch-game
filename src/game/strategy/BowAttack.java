package game.strategy;

/**
 * Concrete implementation of Attacks interface
 * */
public class BowAttack implements Attacks {
    @Override
    public String attack() {
        return "attacks with a bow!";
    }

    @Override
    public int attackDamage() {
        return 10;
    }
}
