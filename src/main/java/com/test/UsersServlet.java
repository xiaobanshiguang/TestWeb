package com.test;

import com.test.util.DbHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/usersServlet")
public class UsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           //设置编码
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
          //从数据库查询所有的用户信息
            String sql="select * from users";
            DbHelper dbHelper=new DbHelper();
            List<Map<String,Object>> list=  dbHelper.executeQuery(sql,null);
          //转发到jsp页面输出
            response.getWriter().print(list);
            request.setAttribute("list",list);
            request.getRequestDispatcher("showUsers.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         doPost(request,response);
    }
}
