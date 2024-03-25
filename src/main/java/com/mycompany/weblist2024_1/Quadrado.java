/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.weblist2024_1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Elton
 */
public class Quadrado extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int numero_digitado = Integer.parseInt(request.getParameter("numero_digitado"));
        int quadrado = numero_digitado * numero_digitado;
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Quadrado do número digitado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>O quadrado do número digitado é : " + quadrado  + "</h1>");
            out.println("</body>");
            out.println("</html>");
       
    }

    
}
