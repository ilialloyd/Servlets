package com.example.attribusetservlet;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *
 */


import com.example.attribusetservlet.model.Person;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "PersonServlet", value = "/person")
public class PersonServlet extends HttpServlet {
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
            //if its null we just send defsult constructor
            request.setAttribute("person",new Person());

            //əgər error yoxsa da Stringləri attribute kimi set edirik
        } else {
        //setting one by one, we will create new poerson and will sent our jsp file
            request.setAttribute("person",new Person(firstName,lastName,Integer.parseInt(age)));
        }
        //with this method we send this to the jsp file
       getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
