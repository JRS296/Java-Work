import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Logg extends HttpServlet {
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
            Statement statement = conn.createStatement();
            String fname = request.getParameter("fname");
            String pass = request.getParameter("pass");
            PreparedStatement ps = conn.prepareStatement("Select firstname, password from login where firstname=? and password=?");
            ps.setString(1, fname);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next() == true)
                out.println("Logged In!");
            else
                out.println("Invalid!");
        } catch (Exception e) {
            out.println("<br>" + e);
        }
    }
    public void destroy() {
    }
}
