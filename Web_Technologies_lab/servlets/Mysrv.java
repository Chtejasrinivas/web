import java.io.*;
import javax.servlet.*;
public class Mysrv extends GenericServlet
{
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
{
PrintWriter out=res.getWriter()
res.setContentType("text/html");
out.println("<h1>Welcome to Servlets ☺ </h1>");
}
}