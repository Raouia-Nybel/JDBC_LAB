import com.sun.java.util.jar.pack.DriverResource;
import oracle.jdbc.OracleDriver;
import org.sqlite.JDBC;
import org.sqlite.SQLiteJDBCLoader;

import javax.sql.DataSource;
import javax.sql.rowset.JdbcRowSet;
import java.awt.*;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class Library_Sys_JDBC {
    Statement statement = null;
    Connection connection;
    ResultSet resultSet;
    Cursor cursor;
    public Library_Sys_JDBC() {
        super();
    }



    public void connection() {
        try {
            DriverManager.registerDriver(new org.sqlite.JDBC());
            connection=DriverManager.getConnection("jdbc:sqlite:E:\\Master-Studies\\S2\\Modern-Databases-Systems\\Lab\\Library_System_DB_2.db");
            /*DriverManager.registerDriver(new OracleDriver());
            connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1", "raouia", "raouia1999");*/
            //System.out.println("Well connected to DB");
            //connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertion(String sqlCommand)
    {
        try {
            statement= connection.createStatement();
            statement.executeUpdate(sqlCommand);
           /*// System.out.println("Reader well added to DB");
            resultSet=statement.executeQuery("SELECT * FROM Readers");
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+ " "+ resultSet.getString(2)+ " " + resultSet.getString(3)+ " " + resultSet.getString(4)+ " "+ resultSet.getString(5)+ " "+resultSet.getInt(6));
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }

        public void selection(String tableName)
        {
            try{
                statement= connection.createStatement();
                resultSet=statement.executeQuery("SELECT * FROM "+tableName);
                while(resultSet.next()){
                    switch (tableName){
                        case "Items": System.out.println(resultSet.getInt(1)+ " "
                                +resultSet.getInt(2)+" "
                                +resultSet.getString(3)+" "
                                +resultSet.getString(4)+" "
                                +resultSet.getString(5)+" "
                                +resultSet.getFloat(6));
                        break;
                        case "Members": System.out.println(resultSet.getInt(1)+ " "
                                +resultSet.getString(2)+" "
                                +resultSet.getString(3)+" "
                                +resultSet.getString(4)+" "
                                +resultSet.getString(5)+" "
                                +resultSet.getDouble(6)+" "
                                +resultSet.getString(7));
                        break;
                    }
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        public boolean verif(String sqlCommand)
        {
            boolean verif=false;
            try{
                statement=connection.createStatement();
                resultSet=statement.executeQuery(sqlCommand);
                if(resultSet.next()) verif=true;
                else verif=false;
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            return verif;
        }

}