package assignment8;


import com.modak.utils.JDBCConnectionManager;
//import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;



import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

public class connectionPool {

    public static void main(String[] args) throws IOException {

        try {


            JDBCConnectionManager connection = new JDBCConnectionManager();

            connection.configureHikariDataSource(new File("Jsonfiles/c.json"));

            HikariDataSource hikaridata = connection.getHikariDataSource();

            Connection myconnection = hikaridata.getConnection();
//            HikariConfig cfg=new HikariConfig("Jsonfiles/Config.json");
//            HikariDataSource ds=new HikariDataSource(cfg);
//            Connection myconnection=ds.getConnection();

            QueryRunner qr = new QueryRunner();
            List<Map<String, Object>> l1 = qr.query(myconnection, "select * from dep_sg", new MapListHandler());
            System.out.println(l1);
            myconnection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }


    }


}
