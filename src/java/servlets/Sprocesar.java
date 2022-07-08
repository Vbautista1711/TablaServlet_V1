
package servlets;

import alumno.Alumno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
        

@WebServlet(name = "Sprocesar", urlPatterns = {"/Sprocesar"})
public class Sprocesar extends HttpServlet 
{
    
    Alumno alumnos[] = new Alumno[10];
    int cont = 0;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {


            if (request.getParameter("btnRegistrar")!=null)
            {

                alumnos[cont]=new Alumno();
                alumnos[cont].setMatricula(request.getParameter("tfMatricula"));
                alumnos[cont].setNombre(request.getParameter("tfNombre"));
                alumnos[cont].setApellidoPaterno(request.getParameter("tfApellidoPaterno"));
                alumnos[cont].setApellidoMaterno(request.getParameter("tfApellidoMaterno"));
                alumnos[cont].setDdi(Integer.parseInt(request.getParameter("tfDdi")));
                alumnos[cont].setDwi(Integer.parseInt(request.getParameter("tfDwi")));
                alumnos[cont].setEcbd(Integer.parseInt(request.getParameter("tfEcbd"))); 
                cont++;
            }

            if(request.getParameter("btnRegistrar")!=null)
            {
                if (cont ==10)
                {
                    out.print
                    (""  
                        +"<div id='advertencia'>"    
                        +"<h4>El arreglo esta lleno</h4>"
                        + "</div>"
                    );
                }


                out.println
                ("" 
                            +"<link rel=\"stylesheet\" href=\"css/estilo.css\">\n"

                           +"<div id='contenido'>"
                            + "<table class = 'tabla'>"
                            + "     <thead class='Datos' >"
                            + "     <tr>"
                            + "         <th>MATRICULA</th>"
                            + "         <th>NOMBRE</th>"
                            + "         <th>APELLIDO PATERNO</th>"
                            + "         <th>APELLIDO PATERNO</th>"
                            + "         <th>DDI</th>"
                            + "         <th>DWI</th>"
                            + "         <th>ECBD</th>"
                            + "         <th>PROM</th>"
                            + "     </tr>"
                            + " </thead>"
                            + "</div>"
                );
                for(int i = 0; i < cont; i++)
                {
                        out.println
                    (""
                            + "<tbody>"
                            +   "<tr>"
                            +       "<td>" + alumnos[i].getMatricula() + "</td>"
                            +       "<td>" + alumnos[i].getNombre() + "</td>"
                            +       "<td>" + alumnos[i].getApellidoPaterno() +"</td>"
                            +       "<td>" + alumnos[i].getApellidoMaterno() + "</td>"
                            +       "<td>" + alumnos[i].getDdi() + "</td>"
                            +       "<td>" + alumnos[i].getDwi() + "</td>"
                            +       "<td>" + alumnos[i].getEcbd() + "</td>"
                            +       "<td>" + alumnos[i].calcularPromedio(alumnos[i].getDdi(), alumnos[i].getDwi(), alumnos[i].getEcbd()) + "</td>"
                            +   "</tr>"
                            + "</tbody>"
                     );
                }
                out.println(""
                    + "</table>"
                );
            }

            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
