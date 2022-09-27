package com.example.accesing;
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

@WebServlet(name = "NameServlet", value = "/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        if (firstName == null || lastName == null) {
            System.out.println("A full name was not provided");
        } else {
            System.out.println("Hello " + firstName + " " + lastName + ", nice to meet you");
        }
        //if we provide both names, we get else condition,
        //if not providfe one of the names, then we get if statement
//http://localhost:8080/name?firstName=Ilham&lastName=Mammadli
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
