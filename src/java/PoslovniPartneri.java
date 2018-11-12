import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PoslovniPartneri extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ime=request.getParameter("ime");
        String adresa=request.getParameter("adresa");
        String email=request.getParameter("email");
        String telefon=request.getParameter("telefon");
        String zanimanje=request.getParameter("zanimanje");
        String radio=request.getParameter("radio");
        String cekirano=request.getParameter("cuvanje");
        String napomena=request.getParameter("napomena");
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>"+"<head><title>PoslovniPartneri</title></head>"+"<body>\n"+"<h4>Do servleta su stigli sledeci podaci:</h4>");
            out.println("<h5>Ime:"+ime+"</h5><h5>Adresa:"+adresa+"</h5><h5>E-mail:"+email+"</h5><h5>Predznanje Jave:"+radio+"</h5><h5>Telefon:"+telefon+"</h5><h5>Zanimanje:"+zanimanje+"</h5><h5>Napomena:"+napomena+"</h5>");
            out.println("</body></html>");
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
