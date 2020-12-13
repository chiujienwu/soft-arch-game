package game.strategy;

public class FistAttack implements Attacks {

    @Override
    public String attack() {
        return "attacks with fists of fury!";
    }

    @Override
    public int attackDamage() {
        return 0;
    }
}
