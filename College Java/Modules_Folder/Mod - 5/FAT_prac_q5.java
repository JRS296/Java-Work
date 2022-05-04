import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FAT_prac_q5 extends HttpServlet
{
     public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
     {
          //set response content type
          res.setContentType("text/html");
          //get printWrite obj
          PrintWriter pw = res.getWriter();
          //read form data from page as request parameter
          String name = req.getParameter("name");
          int age = Integer.parseInt(req.getParameter("age"));
          if (age>=18)
          {
               pw.println("<font color='green' size='4'>"+name+" you are eligible to vote</font>");
          }
          else
               pw.println("<font color='red' size='4'>"+name+" you are not eligible to vote</font>");
          //add hyperlink to dynamic page
          pw.println("<br><br><a href= 'index.html'>Home</a>");
          //close the stream
          pw.close();
     }
}