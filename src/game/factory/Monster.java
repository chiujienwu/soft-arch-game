package game.factory;
import game.strategy.Attacks;

/**
 * Monster superclass for extensions
 * */
public abstract class Monster {

    private String name;
    private int health;
    private int armor;
    private int gold;
    public Attacks typeOfAttack;

    public String getName() {
        return name;
    }

    /**
     * @param name sets name of Monster
     * */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return health of a monster
     * */
    public int getHealth() {
        return health;
    }

    /**
     * @param health sets health of Monster
     * */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return strength armor of Monster which helps reduce health damage
     * */
    public int getArmor() {
        return armor;
    }

    /**
     * @param armor sets armor of Monster
     * */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    /**
     * @return gold of Monster which is dropped onto map location if Monster is defeated
     * */
    public int getGold() {
        return gold;
    }

    /**
     * @param gold sets gold of Monster
     * */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * @return weapon of Monster which is used to inflict health damage
     * */
    public String getTypeOfAttack() {
        return typeOfAttack.attack();
    }

    /**
     * @param newTypeOfAttack sets type of weapon of Monster
     * */
    public void setTypeOfAttack(Attacks newTypeOfAttack) {

    }
}
