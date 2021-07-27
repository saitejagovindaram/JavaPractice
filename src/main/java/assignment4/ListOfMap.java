package assignment4;
import java.util.*;
public class ListOfMap {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        map1.put("one", "Apple");
        map1.put("two", "Orange");

        Map<String,String> map2 = new HashMap<>();
        map2.put("three", "Cat");
        map2.put("four", "Dog");

        Map<String,String> map3 = new HashMap<>();
        map3.put("five", "Cricket");
        map3.put("six", "Football");


        List<Map<String, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

        Iterator <Map<String, String>> i = list.iterator();
        while(i.hasNext()){
            for(Map.Entry<String, String> entry : i.next().entrySet()){
                System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
            }
        }
    }
}
