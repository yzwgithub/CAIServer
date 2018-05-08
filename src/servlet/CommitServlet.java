package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="CommitServlet")
public class CommitServlet extends HttpServlet {

    String s_phone;
    String s_de;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        s_phone=req.getParameter("s_phone");
        s_de=req.getParameter("s_de");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out=resp.getWriter();
        out.write("提交成功");
        System.out.println("用户:"+s_phone+",用户建议:"+s_de);
    }
}
