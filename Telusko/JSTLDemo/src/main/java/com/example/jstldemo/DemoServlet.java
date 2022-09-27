package com.example.jstldemo;
/*
 *        STL stands for JSP standard Tag Library.
 --------------------------------------------------------
* The concept behind JSTL is to convert Java code in to HTML like code.

* The expression language helps to fetch data stored in java class.

* This language was just created so that it can be used inside JSTL.

* EL can be used instead of java tag to print something on server.
 */


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DemoServlet", value = "/demo")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = "Ilham";
        //we add name value to request and give it a name -label
        request.setAttribute("label", name);

        //we call jsp from servlet
        request.getRequestDispatcher("display.jsp").forward(request,response);
    }


}
