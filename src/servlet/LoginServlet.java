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
            response.setStatus(200);
            out.print("1");
            System.out.println("登录成功");
        } else {
            response.setStatus(100);
            out.print("2");
            System.out.println("登录失败");
        }
        out.flush();
        out.close();
    }
}
