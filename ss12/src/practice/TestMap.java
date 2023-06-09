package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Smith", 30);
        map.put("Joe", 34);
        map.put("Shaw", 50);
        map.put("Luke", 10);
        System.out.println("Display entries in this map : ");
        System.out.println(map + "\n");
        Map<String, Integer> map1 = new LinkedHashMap<>(16, 0.75f, true);
        map1.put("Smith", 30);
        map1.put("Joe", 34);
        map1.put("Shaw", 50);
        map1.put("Luke", 10);
        System.out.println("the age of Smith is " + map1.get("Smith"));

    }
}
