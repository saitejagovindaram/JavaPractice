package assignment7;

import com.google.gson.Gson;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.io.FileUtils;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.StringRenderer;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class QuerryrunnerInsert {
    public static void main(String[] args) throws IOException, SQLException {
        File myjson=new File("Jsonfiles/Config.json");
        String str= FileUtils.readFileToString(myjson, String.valueOf(StandardCharsets.UTF_8));
        Gson g=new Gson();
        Map<String, Object> m1=g.fromJson(str,Map.class);
        String s1=(String)m1.get("url");
        String s2=(String)m1.get("user");
        String s3=(String)m1.get("password");


        STGroupFile file=new STGroupFile("templates/queryrunnerInsert.stg",'$','$');
        file.registerRenderer(String.class, new StringRenderer());
        ST t1=file.getInstanceOf("template1");
        String renderquery=t1.render();




        Connection con= DriverManager.getConnection(s1,s2,s3);
        QueryRunner qr=new QueryRunner();

//        String insertquery="insert into dep_sg values(?,?)";
//        String delquery="delete from dep_sg where dep_id=?";
        Object[] valuesarray={55,"ECEDEPT"};
//        Object value=55;
        qr.update(con,renderquery,valuesarray);



        List<Map<String,Object>> l1=qr.query(con,"select * from dep_sg", new MapListHandler());
        System.out.println(l1);



    }
}
