import java.util.*;
public class TestHashMap {
    public static void main(String args[]) {
        HashMap <String, String> hashMap = new HashMap<String, String>();
        hashMap.put("c", "10");
        hashMap.put("f", "20");
        hashMap.put("k", "30");
        hashMap.put("x", "40");
        hashMap.put("p", "50");
        hashMap.put("g", "60");
        System.out.println("Map initial: " + hashMap);
        String ch = hashMap.get("f");
        System.out.println("Value associated to f: " + ch);
        Collection<String> values = hashMap.values();
        System.out.println("hashMap values: " + values);
        values.remove("30");
        System.out.println("hashMap values after removing 30: " + values);
        System.out.println("Map after remove: " + hashMap);
        Set<String> keys = hashMap.keySet();
        System.out.println("hashMap keys: " + keys);
        String old = hashMap.put("x", "25");
        System.out.println("Value associated to x before change: " + old);
        System.out.println("Map after change: " + hashMap);
        System.out.println("hashMap values after change: " + values);
    }
}