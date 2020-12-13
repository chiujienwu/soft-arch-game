package game.factory;

import java.util.Random;

public class MonsterFactory {

    int numberOfMonsters = 4;

    public Monster createMonster() {

        Monster newMonster;
        Random random = new Random();

        switch (random.nextInt(numberOfMonsters)+1) {
            case 1:
                newMonster = new Orc();
                break;
            case 2:
                newMonster = new Troll();
                break;
            case 3:
                newMonster = new Golem();
                break;
            default:
                newMonster = new Villager();
        }
        return newMonster;
    }

}
