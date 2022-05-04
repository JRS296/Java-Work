import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FAT_prac_q4 extends HttpServlet implements Servlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><body><h2>Information about Http Request</h2>");
        pw.println("<br>Server Name: " + req.getServerName());
        pw.println("<br>Server Port: " + req.getServerPort());
        pw.println("<br>Ip Address: " + req.getRemoteAddr());
        pw.println("<br>Server Path: "+req.getServerPath()); pw.println("<br>Client Browser: "+req.getHeader("User-Agent"));
        pw.println("</body></html>");
        pw.close();
    }
}