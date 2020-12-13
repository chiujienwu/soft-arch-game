package game;

import game.factory.Monster;
import game.factory.MonsterFactory;
import game.services.GameOutputService;
import game.singleton.SingletonMap;

public class Main {

    public static void main(String[] args) {

        MonsterFactory monsterFactory = new MonsterFactory();
//        SingletonMap newMap = SingletonMap.getInstance();
//        System.out.println("Instance ID: " + System.identityHashCode(newMap));
//        System.out.println(newMap.getMapList());


        for(int x=0; x < 10; x++) {
            Monster monster = monsterFactory.createMonster();
            System.out.println("Name: " + monster.getName());
            System.out.println("Health: " + monster.getHealth());
            System.out.println("Gold: " + monster.getGold());
            System.out.println("Name: " + monster.getTypeOfAttack());
            System.out.println("----------------------------");

        }

        SingletonMap newMap = SingletonMap.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(newMap));
        System.out.println(newMap.getMapList());
        System.out.println("----------------------------");

        GameOutputService output = new GameOutputService();

        output.addToMessage("hello there");
        output.outputMessage();
        output.clearMessage();
        output.outputMessage();

    }

}
