package com.example.fovandredirect;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *
 *
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SecondaryServlet", value = "/samurai")
public class SecondaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Secondary got request");
        getServletContext().getRequestDispatcher("/Samurai.html").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
