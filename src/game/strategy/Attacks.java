package game.strategy;

/**
 * Weapons interface
 * */
public interface Attacks {
    // gives a character object ability (behavior) to attack with a weapon
    // and deal damage to opponent's health
    String attack();
    int attackDamage();
}
