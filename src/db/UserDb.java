package db;

import java.sql.*;

/**
 * Created by ASUS on 2017/7/17.
 */
public class UserDb {
    static String url="jdbc:mysql://127.0.0.1:3306/cai";
    static String user="root";
    static String password="111111";
    public static boolean connect(String username,String pss){
        String sql="select user_name,password from user where user_name="+
                "'"+username+"'"+"and password="+"'"+pss+"'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url, user, password);
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
            Connection conn=DriverManager.getConnection(url,user,password);
            Statement stmt=conn.createStatement();
            stmt.executeQuery(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args []){
        Register("aaaaaa","111111");
    }


}
