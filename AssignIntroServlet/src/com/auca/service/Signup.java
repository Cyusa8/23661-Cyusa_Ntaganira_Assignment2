package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Signup extends HttpServlet{
	String email, password;

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        email = req.getParameter("Email");
        password = req.getParameter("password");


        if (email != null && password != null) {
            res.sendRedirect("SignupSubmission.html");
        } else {
            System.out.println("Enter all fields");
        }
    }

}
