package com.example.mappingservlets;
/*
 * Leave your comment below if you have
 * --------------------------------------------------------
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
//also if you do /kody/* - it means whatever comes after kody, you will still get the page
@WebServlet(name = "AnnotatedServlet", urlPatterns = {"/kody/*","/hay"})
public class AnnotatedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("The GET method has been called");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
