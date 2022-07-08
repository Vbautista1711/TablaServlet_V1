
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilo.css">
        <title>Calificaciones con Servlet</title>
    </head>
    <body>
       <div class='form-datos'>
            <h4>Formulario</h4>
            
            <form action='Sprocesar' method='post'>

                    <input type='text'   class='controls' name='tfMatricula'       placeholder="Ingrese la matricula"> 
                    <input type='text'   class='controls' name='tfNombre'          placeholder="Ingrese el nombre">
                    <input type='text'   class='controls' name='tfApellidoPaterno' placeholder="Ingrese el apellido paterno">
                    <input type='text'   class='controls' name='tfApellidoMaterno' placeholder="Ingrese el apellido materno"> 
                    <input type='number' class='controls' name='tfDdi'             placeholder="Ingrese la calificación de DDI" > 
                    <input type='number' class='controls' name='tfDwi'             placeholder="Ingrese la calificación de DWI">
                    <input type='number' class='controls' name='tfEcbd'            placeholder="Ingrese la calificación de ECBD">
                    
                <button type='submit' class='botons' name='btnRegistrar'>Registrar</button>
            </form> 
        </div> 