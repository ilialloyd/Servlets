package com.example.fovandredirect;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *forwarding() -method allows you to send request to somewhere else
 *
 * getRequestDispatcher() ile gondermek istediyimiz requesti declare edirik
 * sonra onu foward() ile request edirik sonrada response ye yollayiriq
 *
 *          General using of
 * forward() - if you want to forward another page inside your application
 * sendRedirect() - if you want to send them outside url path
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SamuraiServlet", value = "/samuraiServlet")
public class SamuraiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // burada getRequestDispatcher() ile gondermekl istediyimiz requesti declare edirik
        // sonra onu foward() ile request edirik sonrada response ye yollayiriq
        System.out.println("GET method called in SamuraiServlet");

       // getServletContext().getRequestDispatcher("/samurai").forward(request, response);
        //redirecting to the url
        response.sendRedirect("/samurai");
        //or you can redirect totally different url
        //response.sendRedirect("https://en.wikipedia.org/wiki/Samurai_Champloo");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
