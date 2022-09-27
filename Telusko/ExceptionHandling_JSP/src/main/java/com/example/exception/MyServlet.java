package com.example.exception;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *
 */


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", value = "/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hi");

        int k = 9/0;

        String str = getServletConfig().getInitParameter("name");
        out.println(str);



    }


}
