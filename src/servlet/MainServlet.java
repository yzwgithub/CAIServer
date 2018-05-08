package servlet;

import util.Constant;
import util.Image;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static util.Constant.*;
import static util.Constant.password;
import static util.Constant.user;

@WebServlet(name = "MainServlet")
public class MainServlet extends HttpServlet {
    private List image=new ArrayList();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out=response.getWriter();
        String sql="select * from main";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection(sql_url, user, password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                image.add(Constant.str1+imgUrl+rs.getString("src")+Constant.str2+rs.getString("discribe")+Constant.str4+imgUrl+rs.getString("name")+Constant.str3);
            }
            out.write(image.toString());
            System.out.println(image.toString());
            rs.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

