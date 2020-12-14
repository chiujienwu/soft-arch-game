package game.strategy;

/**
 * Concrete implementation of Attacks interface
 * */
public class AxeAttack implements Attacks {

    /**
     * @return description of the weapon used
     * */
    @Override
    public String attack() {
        return "attacks with an axe!";
    }

    /**
     * @return weopon damage inflicted
     * */
    @Override
    public int attackDamage() {
        return 20;
    }


}
