package source;


public class Driver {

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        //map = fillHashMap(map);

        map.put(-128,100L);
        map.put(-128,120L);
        System.out.println(map.get(-128));
        System.out.println("Size is " + map.size());

    }

    private static MyHashMap fillHashMap(MyHashMap map){
        Long value = 0L;
        for(Integer i=0; i<64; i+=2){
            map.put(i,(value + 4));
            value+=4;
        }
        return map;
    }
}

