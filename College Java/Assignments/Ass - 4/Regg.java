import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Regg extends HttpServlet {
    public void init() {
    }

    public Connection connect(PrintWriter out) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db1";
            String user = "root";
            String password = "admin";
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (Exception e) {
            out.println("<br>" + e);
        }
        return connection;
    }

    public void service(HttpServletRequest request, HttpServletResponse response) {
        PrintWriter out = null;
        try {
            out = response.getWriter();
            response.setContentType("text/html");
            Connection conn = connect(out);
            Statement st = conn.createStatement();
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            int table = st.executeUpdate("insert into login values('" + fname + "','" +
                    lname + "','" + email + "','" + pass + "');");
            out.println("Successful!");
        } catch (Exception e) {
            out.println("<br>" + e);
        }
    }

    public void destory() {
    }
}
