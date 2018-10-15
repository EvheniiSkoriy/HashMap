import org.junit.Test;
import source.MyHashMap;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testOnOutPut(){
        MyHashMap map = new MyHashMap();
        fillMap(map,100L, 125L, 150L);
        checkOutPut(map,100L, 45);
        checkOutPut(map,125L, 32);
        checkOutPut(map,150L, -99);
        assertEquals(3, map.size());
    }

    @Test
    public void testSize(){
        MyHashMap map = new MyHashMap();
        assertEquals(0, map.size());
        map.put(100, 45L);
        assertEquals(1, map.size());
    }

    @Test
    public void testFillSameKeys(){
        MyHashMap map = new MyHashMap();
        fillMap(map,100L, 125L, 150L);
        fillMap(map,10L, 20L, 30L);
        checkOutPut(map,10L, 45);
        checkOutPut(map,20L, 32);
        checkOutPut(map,30L, -99);
        assertEquals(3, map.size());
    }

    @Test
    public void testOnNull(){
        MyHashMap map = new MyHashMap();
        map.put(101,null);
        checkOutPut(map,null, 100);
        checkOutPut(map,null, 101);
    }

    private static void fillMap(MyHashMap map, Long value1, Long value2, Long value3){
        map.put(45, value1);
        map.put(32, value2);
        map.put(-99, value3);
    }

    private static void checkOutPut(MyHashMap map, Long expected, Integer key){
        Long actual = map.get(key);
        assertEquals(expected, actual);
    }



}
