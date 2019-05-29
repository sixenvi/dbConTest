package com.example.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.sql.*;


public class MyServlet extends HttpServlet{
    private static final Logger log = LoggerFactory.getLogger(MyServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        getDriver();

        resp.setContentType("text/html");
        resp.getWriter().write("<html><body>Hello World</body></html>");
    }


    protected void getDriver() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            log.error("ClassNotFoundException!", e);
            e.printStackTrace();
        }


    }


}