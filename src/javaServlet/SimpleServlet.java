package javaServlet;

import org.jetbrains.annotations.NotNull;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "SimpleServlet",urlPatterns = "/SimpleServlet")
public class SimpleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, @NotNull HttpServletResponse response) throws ServletException, IOException {
        //step 1 set context type
        response.setContentType("text/html");

        //step 2 get the printWriter
        PrintWriter out = response.getWriter();

        //step 3 generate HML code
        out.println("<html><body>");
        out.println("<h2>Java Servlet</h2> <hr/>");
        out.println("Time on sever is :" + new Date());
        out.println("This testing servlet by Override doGet method");
        out.println(request.getParameter("firstName")+ " "+ request.getParameter("lastName"));
        out.println("</body></html>");
    }
}
