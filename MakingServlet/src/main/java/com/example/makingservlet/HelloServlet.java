package com.example.makingservlet;
/**
 * Leave your comment below if you have
 * --------------------------------------------------------
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
//mapping adlanan emeliyyat
//url pattren ile url define ede bilerik ki bu url ni yazdiqda hemise bura gelib cixsin
@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("The GET request has been made to /hello");
        //göndəriləcək kontent type sini set edirik
        //Amma daha çox html taq seçilir və html göndərilir plain text yerine
        //response.setContentType("text/plain");
        //kontenti qeyd edirik ki klent request edende
        //ona neyi capa vereceyik
        //response.getWriter().println("Here is a line");
        //response.getWriter().println("Here is another line");
                //instead of text/plain
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello!</h1>");
        response.getWriter().println("<p>Welcome to Ilham's Webpage!</p>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("The POST request has been made to /hello");

    }
}
