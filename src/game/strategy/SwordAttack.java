package game.strategy;

/**
 * Concrete implementation of Attacks interface
 * */
public class SwordAttack implements Attacks {
    @Override
    public String attack() {
        return "attacks with a sword!";
    }

    @Override
    public int attackDamage() {
        return 15;
    }
}
