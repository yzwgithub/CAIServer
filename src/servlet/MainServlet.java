package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "MainServlet")
public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String []imgName=new String[20];
        String[]imgDisc=new String [20];
        int i=0;
        String imgUrl="http://192.168.1.101:8080/pic/";
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        this.doPost(request,response);
        PrintWriter out=response.getWriter();
        String url="jdbc:mysql://127.0.0.1:3306/cai";
        String user="root";
        String password="111111";
        String sql="select src,discribe from main";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url, user, password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                imgName[i]=rs.getString("src");
                imgDisc[i]=rs.getString("discribe");
                i++;
            }
            String json="[{\"src\":\""+imgUrl+imgName[0]+ "\",\"disc\":\""+imgDisc[0]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[1] + "\",\"disc\":\""+imgDisc[1]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[2] + "\",\"disc\":\""+imgDisc[2]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[3] + "\",\"disc\":\""+imgDisc[3]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[4] + "\",\"disc\":\""+imgDisc[4]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[5] + "\",\"disc\":\""+imgDisc[5]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[6] + "\",\"disc\":\""+imgDisc[6]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[7] + "\",\"disc\":\""+imgDisc[7]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[8] + "\",\"disc\":\""+imgDisc[8]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[9] + "\",\"disc\":\""+imgDisc[9]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[10] + "\",\"disc\":\""+imgDisc[10]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[11] + "\",\"disc\":\""+imgDisc[11]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[12] + "\",\"disc\":\""+imgDisc[12]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[13] + "\",\"disc\":\""+imgDisc[13]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[14] + "\",\"disc\":\""+imgDisc[14]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[15] + "\",\"disc\":\""+imgDisc[15]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[16] + "\",\"disc\":\""+imgDisc[16]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[17] + "\",\"disc\":\""+imgDisc[17]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[18] + "\",\"disc\":\""+imgDisc[18]+"\"}," +
                    "{\"src\":\""+imgUrl+imgName[19] + "\",\"disc\":\""+imgDisc[19]+"\"}]";
            out.write(json);
            rs.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
