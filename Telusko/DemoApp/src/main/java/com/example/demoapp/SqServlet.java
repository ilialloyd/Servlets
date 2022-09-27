package com.example.demoapp;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *
 */

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //to fetch setAttribute value
      //  int k = (int)request.getAttribute("k");

        //if you sending values with sendRedirect() method, you can fetch argument with getParameter method
       // int k = Integer.parseInt(request.getParameter("k"));

        //fetch value from HTTPSession
      //  HttpSession session = request.getSession();
        //session.removeAttribute("k");  -  remove attribute key
       // int k = (int)session.getAttribute("k");

        //Because client send us cookie first we need to accept Cookie
        //Because it is cookies and client don't know which cookie we need we use array here

        int k=0;
        Cookie [] cookies =request.getCookies();
        for(Cookie c :cookies){
            //now we need to fetch. so we're getting exactly k value with equal() method
            if(c.getName().equals("k"))
                k=Integer.parseInt(c.getValue());
        }


        k=k*k;

        //and sending response o client
        PrintWriter out = response.getWriter();
        out.println("Result is "+k);


    }
}
