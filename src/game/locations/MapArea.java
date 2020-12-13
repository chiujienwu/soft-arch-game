package game.locations;

import game.factory.Monster;
import game.strategy.Attacks;

import java.util.ArrayList;

public class MapArea {

    String name;
    Monster monster;
    int goldDropped;
    Attacks typeofWeaponDropped;

    public MapArea(String name, Monster monster, int goldDropped, Attacks typeofWeaponDropped) {
        this.name = name;
        this.monster = monster;
        this.goldDropped = goldDropped;
        this.typeofWeaponDropped = typeofWeaponDropped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public int getGoldDropped() {
        return goldDropped;
    }

    public void setGoldDropped(int goldDropped) {
        this.goldDropped = goldDropped;
    }

    public Attacks getTypeofWeaponDropped() {
        return typeofWeaponDropped;
    }

    public void setTypeofWeaponDropped(Attacks typeofWeaponDropped) {
        this.typeofWeaponDropped = typeofWeaponDropped;
    }
}
