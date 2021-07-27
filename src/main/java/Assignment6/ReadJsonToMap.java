package Assignment6;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class ReadJsonToMap {
    public static void main(String[] args) throws Exception{

        File file=new File("Jsonfiles/file1.json");
        String str= FileUtils.readFileToString(file, String.valueOf(StandardCharsets.UTF_8));
        Gson g = new Gson();
//        BufferedReader br = new BufferedReader((new FileReader("Jsonfiles/file1.json")));
        Map<String,Object> m1=g.fromJson(str,Map.class);
        for(Map.Entry<String,Object> entry : m1.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
