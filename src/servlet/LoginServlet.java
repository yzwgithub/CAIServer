package servlet;

import db.UserDb;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by ASUS on 2017/7/15.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        String account = request.getParameter("account");
        String password=request.getParameter("password");
        if(UserDb.connect(account,password)){
            response.setStatus(200);
        }
        else {
            response.setStatus(100);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
