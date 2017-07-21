package servlet;

import db.UserDb;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ASUS on 2017/7/15.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        if (request==null){
            return;
        }
        this.doPost(request,response);
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        String account=request.getParameter("account");
        String password=request.getParameter("password");
        if (UserDb.connect(account,password)){
            out.write("登录成功");
            System.out.print("登录成功");
        } else {
            out.write("登录失败");
            System.out.print("登录失败");
        }
        out.flush();
        out.close();
    }
}
