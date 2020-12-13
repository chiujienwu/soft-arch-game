package game.factory;

import game.strategy.Attacks;

public abstract class Monster {

    private String name;
    private int health;
    private String armor;
    private int gold;
    public Attacks typeOfAttack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

//    public WeaponStrategy getWeapon() {
//        return weapon;
//    }
//
//    public void setWeapon(WeaponStrategy weapon) {
//        this.weapon = weapon;
//    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getTypeOfAttack() {
        return typeOfAttack.attack();
    }

    public void setTypeOfAttack(Attacks newTypeOfAttack) {

    }
}
