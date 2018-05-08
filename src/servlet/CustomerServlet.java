package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private String ppt_title_str;
    private String ppt_type_str;
    private String ppt_pages_str;
    private String phone_str;
    private String ppt_describe_str;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ppt_title_str=request.getParameter("ppt_title_str");
        ppt_type_str=request.getParameter("ppt_type_str");
        ppt_pages_str=request.getParameter("ppt_pages_str");
        phone_str=request.getParameter("phone_str");
        ppt_describe_str=request.getParameter("ppt_describe_str");
        System.out.println("标题："+ppt_title_str+"\t"+"类型："+ppt_type_str+"\t"+"页数："+ppt_pages_str+"\t"+"电话："+phone_str+"\t"+"详细描述："+ppt_describe_str);
    }
}
