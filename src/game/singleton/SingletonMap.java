package game.singleton;

import game.factory.MonsterFactory;
import game.locations.MapArea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Singleton Pattern to allow only one instance of the game map
 * */
public class SingletonMap {

    // this is the access point to a Singleton Pattern implementation
    // static so the access point is available on a global basis for checking
    private static SingletonMap onlyInstance = null;

    MonsterFactory monsterFactory = new MonsterFactory();
    MapArea cave = new MapArea("Cave", monsterFactory.createMonster(),0,null);
    MapArea mountain = new MapArea("Mountain", monsterFactory.createMonster(),0,null);
    MapArea village = new MapArea("Village", monsterFactory.createMonster(),0,null);
    MapArea woods = new MapArea("Woods", monsterFactory.createMonster(),0,null);
    String[] mapAreas = {cave.getName(), mountain.getName(), village.getName(), woods.getName()};
    private List<String> mapList = new ArrayList<>(Arrays.asList(mapAreas));

    /**
     * SingetonMap class constructor
     * */
    private SingletonMap() {
    };

    /**
     * @return a single instance of a SingletonMap class
     * */
    public static SingletonMap getInstance() {
        if (onlyInstance == null) {
            // lazy instantiation since getInstance() may not be called
            // synchronized protects against multi-threading.
            synchronized (SingletonMap.class) {
                if (onlyInstance == null) {
                    onlyInstance = new SingletonMap();
                }
            }
        }

        return onlyInstance;
    }

    /**
     * @return all the map location names available in game
     * */
    public List<String> getMapList() {
        return onlyInstance.mapList;
    }



}
