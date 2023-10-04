package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLogin extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("name");
        String password = req.getParameter("password");

        if ("Cyusa Ntaganira".equals(username) && "2408".equals(password)) {

            try {
                HttpSession session = req.getSession(true);
                session.setAttribute("name", username);
                res.sendRedirect("Admission.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            
            res.sendRedirect("forgot_passsword.html");
        }
    }
}
