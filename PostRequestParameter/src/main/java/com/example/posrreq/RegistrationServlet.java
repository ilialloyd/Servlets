package com.example.posrreq;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *
 */


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/register")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// how to send post request
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        if (email.isEmpty() || name.isEmpty() || age.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            request.setAttribute("error", "You are missing inputs");
            // getServletContext().getRequestDispatcher("/register").forward(request,response);
            //instead of this long we can call doGet method
            doGet(request, response);

        } else {
            if (!password.equalsIgnoreCase(confirmPassword)) {
                request.setAttribute("error", "The password do not match");
                doGet(request, response);
            } else {
                System.out.println("Account has been created");
            }
        }

    }

}

