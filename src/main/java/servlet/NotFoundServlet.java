package servlet;

import template.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NotFoundServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        Component component = new Component();
        writer.write(
                component.Dashboard(
                        "    <div class=\"header bg-gradient-primary pb-8 pt-5 pt-md-8\">\n" +
                                "      <div class=\"container-fluid\">\n" +
                                "        <div class=\"header-body\">\n" +
                                "<h1 class=\"text-center text-danger\">404 Not found pages</h1>"
                                + "</div>" +
                                "</div>" +
                                "</div>"
                )
        );
    }
}
