package game.strategy;

/**
 * Concrete implementation of Attacks interface
 * */
public class SwordAttack implements Attacks {

    /**
     * @return description of the weapon used
     * */
    @Override
    public String attack() {
        return "attacks with a sword!";
    }

    /**
     * @return weopon damage inflicted
     * */
    @Override
    public int attackDamage() {
        return 15;
    }
}
