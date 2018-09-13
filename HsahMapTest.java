package d20180828.ch11;

public class HashMapTest {

    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>(2);
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
    }
}
