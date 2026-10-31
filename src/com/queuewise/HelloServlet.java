
package com.queuewise;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>QueueWise</title></head>");
        out.println("<body style='font-family:Arial;text-align:center;padding:80px;'>");
        out.println("<h1>Welcome to QueueWise!</h1>");
        out.println("<p>Your first Java Servlet is working.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
 