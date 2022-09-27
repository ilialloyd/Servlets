package com.example.initpar;
/*
 *           There are two types of init parameters available
 --------------------------------------------------------
 * There are context init parameters (defined in <context-param> element) and
 * servlet init parameters (defined in <init-param> element).
 * They are both referred to as init parameters, although defined in different elements.
 * Context init parameters are available to any servlet or JSP that are part of the current web app.
 * Servlet init parameters are available to only the servlet for which the <init-param> was configured.
 * Context init parameters are defined within the <web-app> element.
 * Servlet init parameters are defined within the <servlet> element for each specific servlet.
 */


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Servlet", value = "/token")
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //this line will try to find this token from the web.xml file
        String token = getServletContext().getInitParameter("authorizationToken");
      if(token!= null)
          System.out.println("Auth token: "+token);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
