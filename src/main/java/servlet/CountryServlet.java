package servlet;

import model.Country;
import template.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CountryServlet extends HttpServlet {
    private final List<Country> countries = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder stringBuilder = new StringBuilder();
        for (Country country : countries) {
            stringBuilder.append(
                    "<tr>\n" +
                            "<td>" + country.getTr() + "</td>\n" +
                            "<td>" + country.getName() + "</td>\n" +
                            "</tr>\n"
            );
        }
        String table = "";
        if (countries.size() == 0) {
            table = "<h3 class=\"text-center text-danger\">xozircha davlatlar mavjud emas...</h3>";
        } else {
            table = "<table class=\"table\">\n" +
                    "        <thead>\n" +
                    "        <tr>\n" +
                    "            <th>T/r</th>\n" +
                    "            <th>name</th>\n" +
                    "        </tr>\n" +
                    "        </thead>\n" +
                    "        <tbody>\n" +
                    stringBuilder +
                    "        </tbody>\n" +
                    "    </table>\n";
        }
        PrintWriter writer = resp.getWriter();
        Component component = new Component();
        writer.write(
                component.Dashboard(
                        "    <div class=\"header bg-gradient-primary pb-8 pt-5 pt-md-8\">\n" +
                                "      <div class=\"container-fluid\">\n" +
                                "        <div class=\"header-body\">\n" +
                                "<div class=\"container\">\n" +
                                "    <h1 class=\"text-center text-success\">country pages</h1>\n" +
                                "<button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\n" +
                                "  +add\n" +
                                "</button>\n" +
                                table +
                                "</div>\n" +
                                "<!-- Button trigger modal -->\n" +
                                "\n" +
                                "<!-- Modal -->\n" +
                                "<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n" +
                                "  <div class=\"modal-dialog\">\n" +
                                "    <div class=\"modal-content\">\n" +
                                "      <div class=\"modal-header\">\n" +
                                "        <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">add country</h1>\n" +
                                "        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n" +
                                "      </div>\n" +
                                "      <div class=\"modal-body\">\n" +
                                "<form action=\"/country\" method=\"post\">" +
                                "        <input type=\"text\" placeholder=\"enter country name\" id=\"countryName\" name=\"countryName\" class=\"form-control mb-3\"/>\n" +
                                "        <button type=\"submit\" class=\"btn btn-primary\">Save</button>\n" +
                                "        <button type=\"button\" class=\"btn btn-danger\" data-bs-dismiss=\"modal\">Close</button>\n" +
                                "</form>" +
                                "      </div>\n" +
                                "    </div>\n" +
                                "  </div>\n" +
                                "</div>"
                                + "</div>" +
                                "</div>" +
                                "</div>"
                )
        );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String countryName = req.getParameter("countryName");
        countries.add(new Country(countries.size() + 1, countries.size() + 1, countryName));
        PrintWriter writer = resp.getWriter();
        writer.write(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>save country</title>\n" +
                        "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                        "          integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<h1 class=\"text-center text-success\">saqlandi</h1>\n" +
                        "<a href=\"http://localhost:8080/country\" class=\"btn btn-success\">orqaga</a>\n" +
                        "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"\n" +
                        "        integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\"\n" +
                        "        crossorigin=\"anonymous\"></script>\n" +
                        "</body>\n" +
                        "</html>"
        );
    }
}
