package com.example.initpar;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *
 */


import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String copyrightYear =getServletConfig().getInitParameter("copyrightYear");
        if (copyrightYear != null) {
            System.out.println(copyrightYear);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
