package game.locations;
import game.factory.Monster;
import game.strategy.Attacks;


/**
 * Class for Singleton pattern of a single game map to be instantiated.
 * */
public class MapArea {

    String name;
    Monster monster;
    int goldDropped;
    Attacks typeofWeaponDropped;

    /**
     * @param name is the name of the map area
     * @param goldDropped is the amount of gold the location may have available to Player to pick up
     * @param monster is the monster that occupies the map area
     * @param typeofWeaponDropped is the weapon the location may have available to Player to pick up
     * */
    public MapArea(String name, Monster monster, int goldDropped, Attacks typeofWeaponDropped) {
        this.name = name;
        this.monster = monster;
        this.goldDropped = goldDropped;
        this.typeofWeaponDropped = typeofWeaponDropped;
    }

    public String getName() {
        return name;
    }

    /**
     * @param name is the name of the map area
     * */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns the monster of the map area
     * */
    public Monster getMonster() {
        return monster;
    }

    /**
     * @param monster is the monster in the map area
     * */
    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    /**
     * returns the amount of gold of the map area that has been dropped or left behind
     * */
    public int getGoldDropped() {
        return goldDropped;
    }

    /**
     * @param goldDropped is the amount of gold in the map area available to player to accumulate
     * */
    public void setGoldDropped(int goldDropped) {
        this.goldDropped = goldDropped;
    }

    /**
     * returns the weapon of the map area that can be picked up by player to improve his weapons class
     * */
    public Attacks getTypeofWeaponDropped() {
        return typeofWeaponDropped;
    }
    /**
     * @param typeofWeaponDropped is the weapon in the map area available to player
     * */
    public void setTypeofWeaponDropped(Attacks typeofWeaponDropped) {
        this.typeofWeaponDropped = typeofWeaponDropped;
    }
}
