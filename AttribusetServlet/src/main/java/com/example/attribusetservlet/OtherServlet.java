package com.example.attribusetservlet;
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

@WebServlet(name = "OtherServlet", value = "/OtherServlet")
public class OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //we can try to see first that if error exist first
        //if there is error nothing will be happen
        if(request.getAttribute("error")==null){
            //how to get attributes(values from the link)
            //casting string because it returns object
            String firstName = (String) request.getAttribute("firstName");
            String lastName = (String) request.getAttribute("lastName");
            String age = (String) request.getAttribute("age");
            System.out.println(firstName+" "+lastName+" "+age);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
