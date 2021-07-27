package assignment7;


import com.google.gson.Gson;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.List;
import java.util.Map;

public class JDBC_Connection {
    public static void main(String[] args) throws IOException {
        File myjosn = new File("Jsonfiles/Config.json");
        String str = FileUtils.readFileToString(myjosn, String.valueOf(StandardCharsets.UTF_8));
        Gson gson=new Gson();
        Map<String, Object> m1 = gson.fromJson(str, Map.class);
        String s1=(String)m1.get("url");
        System.out.println(s1);
        String s2=(String)m1.get("user");
        System.out.println(s2);
        String s3=(String)m1.get("password");
        System.out.println(s3);


        try {
            Connection con = DriverManager.getConnection(s1, s2, s3);
            System.out.println("first method");
            Statement s=con.createStatement();
            ResultSet rs = s.executeQuery("select * from buses offset 2");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)
                +" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getObject(5));
            }

            System.out.println("second method");
            QueryRunner qr=new QueryRunner();
            List<Map<String,Object>> l1=qr.query(con,"select * from dep_sg", new MapListHandler());
            System.out.println(l1);
            con.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
