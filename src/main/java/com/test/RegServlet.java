package com.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/regServlet")
public class RegServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取表单中提交的信息
        String uname=request.getParameter("uname");
        String pwd=request.getParameter("pwd");
        String sex=request.getParameter("sex");

        String[] arr=request.getParameterValues("hobby");

        String city=request.getParameter("city");

        response.getWriter().print(uname+","+pwd+","+sex+","+city);






    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request,response);
    }
}
