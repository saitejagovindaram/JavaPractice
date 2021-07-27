package Assignment6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCreation {
    public static void main(String[] args) {
        Map<String, Object> mymap = new HashMap<>();

        Map<String,String> m1=new HashMap<>();
        m1.put("key1","val1");

        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        mymap.put("iam_a_integer", 1);
        mymap.put("iam_a_map",m1);
        mymap.put("iam_a_list",l1);

        System.out.println(mymap);
    }
}
