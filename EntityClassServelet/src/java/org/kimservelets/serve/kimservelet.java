/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kimservelets.serve;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Blade
 */
@WebServlet(name = "kimservelet", urlPatterns = {"/kimservelet"})
public class kimservelet extends HttpServlet {
@PersistenceUnit
EntityManagerFactory emf;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try( PrintWriter out = response.getWriter()){
            out.println("Okay.. is it working ?" + "<br>");
            //sample class to combine name age
//            sampleclass s = new sampleclass();
//            out.println(s.combine("idd juma", 23) + "<br>");
            //entity class from db
            TblCourier f = (TblCourier)emf.createEntityManager().createNamedQuery("TblCourier.findAll").getResultList().get(0);
            out.println(f.getCid() + "<br>");  
            TblCourierOfficers of = (TblCourierOfficers)emf.createEntityManager().createNamedQuery("TblCourierOfficers.findAll").getResultList().get(0);
            out.println(of.getOfficerName() + "<br>");
            out.println(of.getEmail() + "<br>");
            List<TblCourier> ff = emf.createEntityManager().createNamedQuery("TblCourier.findAll").getResultList();
            List<TblCourierOfficers> offi = emf.createEntityManager().createNamedQuery("TblCourierOfficers.findAll").getResultList();
//            out.println(ff.toArray());
            out.println("<h1>Current cauriers</h1><table cellpadding=20><thead><th>"
                    + "<td>#ID</td>"
                    + "<td>ShipmentNo</td>"
                    + "<td>Delivery boy</td>"
                    + "<td>Receiver</td>"
                    + "<td>Phone</td>"
                    + "<td>Invoice</td>"
                    + "<td>Weight</td>"
                    + "</th></thead><tbody>");
            for( int i=0; i < ff.size(); i++ ){
                out.println("<tr>");
                out.println("<td></td>");
                out.println("<td>" + ff.get(i).getCid() + "</td>");
                out.println("<td>" + ff.get(i).getConsNo() + "</td>");
                out.println("<td>" + ff.get(i).getShipName() + "</td>");
                out.println("<td>" + ff.get(i).getRevName() + "</td>");
                out.println("<td>" + ff.get(i).getPhone() + "</td>");
                out.println("<td>" + ff.get(i).getInviceNo() + "</td>");
                out.println("<td>" + ff.get(i).getWeight() + "</td>");
                out.println("</tr>");
            }
            out.println("</tbody></table>");
            
            out.println("<h1>Our Officers</h1><table cellpadding=20><thead><th>"
                    + "<td>#ID</td>"
                    + "<td>Officer name</td>"
                    + "<td>Address</td>"
                    + "<td>Email</td>"
                    + "<td>office</td>"
                    + "<td>Registration date</td>"
                    + "</th></thead><tbody>");
            for( int i=0; i < offi.size(); i++ ){
                out.println("<tr>");
                out.println("<td></td>");
                out.println("<td>" + offi.get(i).getCid() + "</td>");
                out.println("<td>" + offi.get(i).getOfficerName() + "</td>");
                out.println("<td>" + offi.get(i).getAddress() + "</td>");
                out.println("<td>" + offi.get(i).getEmail() + "</td>");
                out.println("<td>" + offi.get(i).getOffice() + "</td>");
                out.println("<td>" + offi.get(i).getRegDate() + "</td>");
                out.println("</tr>");
            }
            out.println("</tbody></table>");
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

    private void foreach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
