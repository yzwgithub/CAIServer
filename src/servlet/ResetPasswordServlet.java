package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResetPasswordServlet")
public class ResetPasswordServlet extends HttpServlet {
    String new_password;
    String ensure_password;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        new_password=request.getParameter("new_password");
        ensure_password=request.getParameter("ensure_password");
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        out.write("提交成功");
        System.out.println("修改后的密码："+new_password);
    }

}
