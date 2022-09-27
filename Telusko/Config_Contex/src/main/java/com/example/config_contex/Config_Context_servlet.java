package com.example.config_contex;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 * ServletConfig and ServletContext
 * Practical implementation of ServletConfig and ServletContext

They both are interface.
ServletConfig and ServletContext both are used to get initial value of servlet or an application.
The values are stored in key value pair.
context-param and context-name tags are used to store the values.
In ServletContext values are shared by all the servlets
Whereas in ServletConfig values each servlet can have independent values.
 *
 */

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Config_Context_servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        out.print("Hi ");

        // now instead of fetching value from ServletContext we will fetch from ServletConfig
       // String str = getServletContext().getInitParameter("Phone");
        String str = getServletConfig().getInitParameter("name");
        out.println(str);

    }
}
