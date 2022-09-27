package com.example.demoapp;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AddServlet extends HttpServlet {


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //request help to fetch data from user and response help to send it
        //We fetch value from num1 in .jsp file. Because get parameter will give us String. but we need integer
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        int k = i + j;
        //server to client print
        PrintWriter out = response.getWriter();
        out.println("Result is: " + k);

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //request help to fetch data from user and response help to send it
        //We fetch value from num1 in .jsp file. Because get parameter will give us String. but we need integer
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        int k = i + j;
        //server to client print
//        PrintWriter out = response.getWriter();
//        out.println("Result is: " + k);

        //sending data one servlet to another is session management
//        request.setAttribute("k",k);// key and value

        //how to call another servlet
//        getServletContext().getRequestDispatcher("/sq").forward(request, response);\

        //you can send with sendRedirect as well. but in this keys it should be url
        // response.sendRedirect("sq?k="+k); //URL Rewriting


        //HTTP Session  -
//        HttpSession session = request.getSession();
//        session.setAttribute("k",k);
//        response.sendRedirect("sq");

        //Cookies
        //
        Cookie cookie = new Cookie("k",k+"");
        //servlet will send response to client and
        response.addCookie(cookie);
        //send response to the client and client again will send request to SqServlet.
        //It will send a cookie as well
        response.sendRedirect("sq");
    }
}
