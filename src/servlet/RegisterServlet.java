package servlet;

import db.UserDb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ASUS on 2017/7/17.
 */
@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        String account = request.getParameter("account");
        String password=request.getParameter("password");
        if (UserDb.connect(account,password)==false){
            UserDb.Register(account,password);
            response.setStatus(200);
            out.print("1");
            System.out.println("插入成功");
        }else {
            response.setStatus(100);
            out.print("2");
            System.out.println("插入失败");
        }
    }
}
