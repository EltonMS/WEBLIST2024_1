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
 *Construa um projeto utilizando Servlets que leia o salário de 3 pessoas, escreva 
o maior valor e a diferença percentual para o menor valor.
 * @author Elton
 */
public class SalarioServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double primeiro_salario = Double.parseDouble(request.getParameter("primeiro_salario"));
        double segundo_salario = Double.parseDouble(request.getParameter("segundo_salario"));
        double terceiro_salario = Double.parseDouble(request.getParameter("terceiro_salario"));
        double maior_salario = 0;
        double menor_salario = 0;
        double diferenca_percentual;
        
        //Calculo do maior Salario
        if (primeiro_salario > segundo_salario && primeiro_salario > terceiro_salario){
            maior_salario = primeiro_salario;
        }
        else if(segundo_salario > primeiro_salario && segundo_salario > terceiro_salario){
            maior_salario = segundo_salario;
        }
        else if(terceiro_salario > primeiro_salario && terceiro_salario > segundo_salario){
                maior_salario = terceiro_salario;
            }
        //Calculo do menor salario
        if (primeiro_salario < segundo_salario && primeiro_salario < terceiro_salario){
            menor_salario = primeiro_salario;
        }
        else if(segundo_salario < primeiro_salario && segundo_salario < terceiro_salario){
            menor_salario = segundo_salario;
        }
        else if(terceiro_salario < primeiro_salario && terceiro_salario < segundo_salario){
                menor_salario = terceiro_salario;
            } 
        //diferença Percentual do maior para o menor
        diferenca_percentual = (menor_salario / maior_salario) * 100;
        
        response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculo de Salários</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>O maior salário é : " + maior_salario + "</h2>");
            out.println("<h2>O menor salário é : " + menor_salario + "</h2>");
            out.println("<h2>A diferença percentual do maior salário para o menor é de : " + diferenca_percentual + "</h2>");
            out.println("</body>");
            out.println("</html>");
        
        
        
        
        
    }
}
