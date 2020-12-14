package game.strategy;

/**
 * Concrete implementation of Attacks interface
 * */
public class FistAttack implements Attacks {

    /**
     * @return description of the weapon used
     * */
    @Override
    public String attack() {
        return "attacks with fists of fury!";
    }

    /**
     * @return weopon damage inflicted
     * */
    @Override
    public int attackDamage() {
        return 5;
    }
}
