<%-- 
    Document   : soma
    Created on : 8 de abr. de 2024, 16:06:45
    Author     : IMAP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Soma</title>
    </head>
    <body>
        <form action="soma" method="POST">
            
            <h2>Digite os numeros:</h2> <br>
            Primeiro Valor:
            <input type="number" name="primeiro_valor" value="" /> <br><br>
            Segundo Valor:
            <input type="number" name="segundo_valor" value="" /> <br><br>
            
            <input type="submit" value="Calcular" />
        </form>
    </body>
</html>
