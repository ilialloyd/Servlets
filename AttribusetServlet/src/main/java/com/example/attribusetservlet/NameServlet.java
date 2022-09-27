package com.example.attribusetservlet;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *
 *
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");

        StringBuilder error = new StringBuilder();
        if (firstName == null) {
            error.append("A first name was not provided");
        } else if (lastName == null) {
            error.append("A last name was not provided");
        } else if (age == null) {
            error.append("An age was not provided");
        }

        //Əgər error sayı birdən böyükdürdə attribute set edəcəyik
        if (error.length() > 0) {//əgər error varsa erroru attribute kimi
            request.setAttribute("error", error.toString());
            //əgər error yoxsa da Stringləri attribute kimi set edirik
        } else {
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
            request.setAttribute("age", age);
        }
        //with this method we send this to the jsp file
        //getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);
        getServletContext().getRequestDispatcher("/OtherServlet").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
