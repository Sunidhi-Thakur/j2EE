package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Sunidhi Thakur
 */
public class FirstServlet implements Servlet{
    ServletConfig conf;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Creating Object......");
    }

    @Override
    public ServletConfig getServletConfig() {
        return conf;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing.....");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h3>Created by Sunidhi</h1>");
        out.println("<h5>on "+new Date().toString()+"</h5>");
    }

    @Override
    public String getServletInfo() {
        return "Created by Sunidhi....";
        
    }

    @Override
    public void destroy() {
        System.out.println("Destroying.....");

    }    
}
