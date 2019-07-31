/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Prajwal
 */
public class RegisterServlet extends HttpServlet {
    static int count ;

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
           ServletContext sc = getServletContext();
        String driver = sc.getInitParameter("driver");
        String url = sc.getInitParameter("url");
        String dbid = sc.getInitParameter("sql_id");
        String dbpass = sc.getInitParameter("pass");
        
        String mobile = request.getParameter("mobile_no");
        String name = request.getParameter("username");
        String login_id = request.getParameter("login_id");
        String pass = request.getParameter("password");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        PrintWriter out = response.getWriter();
        try{
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
              if(name.length() == 0 || login_id.length() == 0 || pass.length() == 0 || address.length() == 0 || email.length() == 0 || mobile.length() == 0)
            {
                response.sendRedirect("index.jsp");
                out.println("<font color = 'red'>Registration Unsucessful !! Please fill all the necessary details.</font>");
            }
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,dbid,dbpass);
            con.setAutoCommit(false);
            PreparedStatement pst = con.prepareStatement("insert into kart_login values("+mobile+",?,?,?)");
            pst.setString(1, login_id);
            pst.setString(2, pass);
            pst.setString(3, address);
            int status = pst.executeUpdate();
            pst = con.prepareStatement("insert into kart_info values("+mobile+",?,?,?)");
            pst.setString(1, name);
            pst.setString(2, gender);
            pst.setString(3, email);
            int status1 = pst.executeUpdate();
            if(status > 0 && status1 > 0)
            {
                con.commit();
                con.setAutoCommit(true);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.include(request, response);
                out.println("Registration Sucessful");
            }
            else
            {
                con.rollback();
                RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
                rd.include(request, response);
                out.println("Registration Unsucessful");
            }
            out.println("</body>");
            out.println("</html>");
        }
         catch(com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e)
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);
            out.println("The login ID already exist.Please Try again with another ID");
        }
        catch(Exception e)
        {
            System.out.println(e);
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
