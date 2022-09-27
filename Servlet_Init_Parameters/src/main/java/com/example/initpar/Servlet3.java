package com.example.initpar;
/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *
 */


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
// web.xml yerine initParam ile burda mappingi etmek mumkundur.
@WebServlet(name = "Servlet3", value = "/hello2", initParams = {@WebInitParam(name="copyrightYear", value ="2019")})
public class Servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String copyrightYear =getServletConfig().getInitParameter("copyrightYear");
        if (copyrightYear != null) {
            System.out.println(copyrightYear);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
