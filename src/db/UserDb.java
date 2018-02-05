package db;

import java.sql.*;

import static util.Constant.password;
import static util.Constant.sql_url;
import static util.Constant.user;

/**
 * Created by ASUS on 2017/7/17.
 */
public class UserDb {
    public static boolean connect(String username,String pss){
        String sql="select user_name,password from user where user_name="+
                "'"+username+"'"+"and password="+"'"+pss+"'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection(sql_url, user, password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next()){
                return true;
            }
            rs.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void Register(String username,String pss){
        String sql="insert into user (user_name,password,nickname) values ('"+username+"','"+pss+"','"+null+"')";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(sql_url,user,password);
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
