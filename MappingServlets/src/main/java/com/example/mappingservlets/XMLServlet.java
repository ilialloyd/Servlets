package com.example.mappingservlets;
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
//instead of Annotation we will do in xml file
//@WebServlet(name = "XMLServlet", value = "/XMLServlet")
public class XMLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Get called on XML SERVLET");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
