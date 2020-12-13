package game.singleton;

import game.factory.MonsterFactory;
import game.locations.MapArea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SingletonMap {

    // this is the access point
    // static so the access point is available on a global basis for checking
    private static SingletonMap onlyInstance = null;



    MonsterFactory monsterFactory = new MonsterFactory();
    MapArea cave = new MapArea("Cave", monsterFactory.createMonster(),0,null);
    MapArea mountain = new MapArea("Mountain", monsterFactory.createMonster(),0,null);
    MapArea village = new MapArea("Village", monsterFactory.createMonster(),0,null);
    MapArea woods = new MapArea("Woods", monsterFactory.createMonster(),0,null);

    String[] mapAreas = {cave.getName(), mountain.getName(), village.getName(), woods.getName()};

    private List<String> mapList = new ArrayList<>(Arrays.asList(mapAreas));

    private SingletonMap() {
    };

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

    // returns a list of all areas of the map
    public List<String> getMapList() {
        return onlyInstance.mapList;
    }

    // returns a single random area of the map

}
