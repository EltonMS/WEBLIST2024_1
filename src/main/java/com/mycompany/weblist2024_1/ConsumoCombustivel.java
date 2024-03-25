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
public class ConsumoCombustivel extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
/**
  Construa um projeto utilizando Servlets que calcula a quantidade de litros de 
combustível gastos em uma viagem utilizando-se um automóvel que faz 12 Km por 
litro. Para realizar esse cálculo, o usuário deverá fornecer o tempo gasto da viagem 
e a velocidade média durante a mesma. O algoritmo deverá apresentar como 
resultado os valores da velocidade média, tempo gasto na viagem, a distância 
percorrida e a quantidade de litros utilizada na viagem.
 
 */
   
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int tempo_viagem = Integer.parseInt(request.getParameter("tempo_viagem"));
        int vel_media =  Integer.parseInt(request.getParameter("vel_media"));
        int distancia_percorrida = tempo_viagem * vel_media;
        double litros_consumidos = distancia_percorrida / 12.0;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Consumo de Combustivel</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>O consumo de combustível foi de: " + litros_consumidos + " litros.</h1>");
            //out.println("<p>ervlet ConsumoCombustivel at " + request.getContextPath() + "</p>");
            out.println("</body>");
            out.println("</html>");
        
        
    }

   
}
