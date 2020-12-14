package game.strategy;

/**
 * Concrete implementation of Attacks interface
 * */
public class AxeAttack implements Attacks {

    @Override
    public String attack() {
        return "attacks with an axe!";
    }

    @Override
    public int attackDamage() {
        return 20;
    }


}
