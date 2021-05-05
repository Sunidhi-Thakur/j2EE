package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Sunidhi Thakur
 * 
 * creating Servlet using GenericServlet
 */
public class SecondServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       System.out.println("Servicing.....");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h3>Servlet 2 created by Sunidhi</h1>");
        out.println("<h5>on "+new Date().toString()+"</h5>");
    }
    
}
