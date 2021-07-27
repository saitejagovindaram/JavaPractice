package assignment8;

import com.modak.utils.JSONUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.*;

public class usingJSONUtils {
    public static void main(String[] args) {
        String jsonstr="{\n" +
                "  \"s\": \"hello\",\n" +
                "  \"a\": \"hai\",\n" +
                "  \"i\": \"bye\",\n" +
                "  \"t\": [\"saiteja\",\"mintu\"]\n" +
                "}";
        HashMap<String, Object> mymap= JSONUtils.jsonToMap(jsonstr);
        System.out.println(mymap);


//        System.out.println("JSONobject creation");
//        JSONObject j1=new JSONObject("{\n" +
//                "  \"s\": \"hello\",\n" +
//                "  \"a\": \"hai\",\n" +
//                "  \"i\": \"bye\",\n" +
//                "  \"t\": [\"saiteja\",\"mintu\"]\n" +
//                "}");
//        JSONObject jsonfrommap=new JSONObject(mymap);
        JSONObject jsonobj=new JSONObject();
        jsonobj.put("url","http://myportal.com");
        jsonobj.put("user", "myname");
        jsonobj.put("password", "mypassword");
        HashMap<String, Object> mymap1=JSONUtils.jsonToMap(jsonobj);
        System.out.println(mymap1);

        System.out.println("\n*******listofmaps to json*******");
        Map<String, Object> m1=new HashMap<>();
        m1.put("s", "sai");
        m1.put("sai",3434);
        Map<String , Object> m2=new HashMap<>();
        m2.put("a","teja");
        m2.put("saiteja", 777);
        Map<String , Object> m3=new HashMap<>();
        m3.put("i","saiteja");

        List<Map<String, Object>> l1=new ArrayList<>();
        l1.add(m1);
        l1.add(m2);
        l1.add(m3);
        Iterator i=l1.iterator();
        while(i.hasNext()){
            String jsonString=JSONUtils.map2JsonString((Map<String, Object>)i.next());
            System.out.println(jsonString);
        }



        System.out.println("\n map to json");
        JSONObject jsonObject=new JSONObject();
        for(Map.Entry<String, Object> entry:m1.entrySet()){
            jsonObject.put(entry.getKey(),entry.getValue());
        }
        System.out.println(jsonObject);








    }



}
