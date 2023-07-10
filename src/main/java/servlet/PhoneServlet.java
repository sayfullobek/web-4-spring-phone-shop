package servlet;

import lombok.SneakyThrows;
import model.Phone;
import model.Result;
import service.DbService;
import template.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PhoneServlet extends HttpServlet {
    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DbService dbService = new DbService();
        List<Phone> phoneList = dbService.getPhoneList();
        StringBuilder stringBuilder = new StringBuilder();
        for (Phone phone : phoneList) {
            stringBuilder.append(
                    "        <tr>\n" +
                            "            <td>" + phone.getTr() + "</td>\n" +
                            "            <td>" + phone.getName() + "</td>\n" +
                            "            <td>" + phone.getPrice() + "</td>\n" +
                            "            <td>" + phone.getYear() + "</td>\n" +
                            "            <td><img style=\"width:60px; height:60px;\" src=\"" + phone.getColor() + "\"></img></td>\n" +
                            "            <td>" + phone.getMemory() + "</td>\n" +
                            "        </tr>\n"
            );
        }

        PrintWriter writer = resp.getWriter();
        Component component = new Component();
        writer.write(
                component.Dashboard(
                        "    <div class=\"header bg-gradient-primary pb-8 pt-5 pt-md-8\">\n" +
                                "      <div class=\"container-fluid\">\n" +
                                "        <div class=\"header-body\">\n" +
                                "<div class=\"container\">\n" +
                                "    <h1 class=\"text-center\">phone page</h1>\n" +
                                "    <button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\n" +
                                "        +add\n" +
                                "    </button>\n" +
                                "    <table class=\"table\">\n" +
                                "        <thead>\n" +
                                "        <tr>\n" +
                                "            <th>T/r</th>\n" +
                                "            <th>name</th>\n" +
                                "            <th>price</th>\n" +
                                "            <th>year</th>\n" +
                                "            <th>img</th>\n" +
                                "            <th>memory</th>\n" +
                                "        </tr>\n" +
                                "        </thead>\n" +
                                "        <tbody>\n" +
                                stringBuilder +
                                "        </tbody>\n" +
                                "    </table>\n" +
                                "\n" +
                                "    <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n" +
                                "        <div class=\"modal-dialog\">\n" +
                                "            <div class=\"modal-content\">\n" +
                                "                <div class=\"modal-header\">\n" +
                                "                    <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">Modal title</h1>\n" +
                                "                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n" +
                                "                </div>\n" +
                                "                <div class=\"modal-body\">\n" +
                                "                    <form action=\"/phone\" method=\"post\">\n" +
                                "                        <label for=\"name\" class=\"text-primary m-2\">phone name</label>\n" +
                                "                        <input type=\"text\" placeholder=\"enter name\" class=\"form-control\" id=\"name\" name=\"name\">\n" +
                                "\n" +
                                "                        <label for=\"price\" class=\"text-primary m-2\">phone price</label>\n" +
                                "                        <input type=\"number\" placeholder=\"enter price\" class=\"form-control\" id=\"price\" name=\"price\">\n" +
                                "\n" +
                                "                        <label for=\"year\" class=\"text-primary m-2\">phone year</label>\n" +
                                "                        <input type=\"date\" placeholder=\"enter year\" class=\"form-control\" id=\"year\" name=\"year\">\n" +
                                "\n" +
                                "                        <label for=\"color\" class=\"text-primary m-2\">phone img</label>\n" +
                                "                        <input type=\"url\" placeholder=\"enter color\" class=\"form-control\" id=\"color\" name=\"color\">\n" +
                                "\n" +
                                "                        <label for=\"memory\" class=\"text-primary m-2\">phone memory</label>\n" +
                                "                        <input type=\"number\" placeholder=\"enter memory\" class=\"form-control mb-3\" id=\"memory\" name=\"memory\">\n" +
                                "\n" +
                                "                        <button type=\"submit\" class=\"btn btn-primary\">Save</button>\n" +
                                "                        <button type=\"button\" class=\"btn btn-danger\" data-bs-dismiss=\"modal\">Close</button>\n" +
                                "                    </form>\n" +
                                "                </div>\n" +
                                "            </div>\n" +
                                "        </div>\n" +
                                "    </div>\n" +
                                "</div>\n" +
                                "</div>" +
                                "</div>" +
                                "</div>"
                )
        );
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String year = req.getParameter("year");
        String color = req.getParameter("color");
        String memory = req.getParameter("memory");
        int yearcha = Integer.parseInt(year.substring(0, 4));
        Phone phone = Phone.builder()
                .name(name)
                .price(Double.parseDouble(price))
                .year(yearcha)
                .color(color)
                .memory(Double.parseDouble(memory))
                .build();
        DbService dbService = new DbService();
        Result result = dbService.addPhone(phone);
        if (result.isSuccess()) {
            writer.write(
                    "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>Phone</title>\n" +
                            "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                            "          integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "\n" +
                            "<div class=\"container\">\n" +
                            "    <h1 class=\"text-center text-success\">" + result.getMessage() + "</h1>\n" +
                            "    <a href=\"http://localhost:8080/phone\" class=\"btn btn-success\">orqaga</a>\n" +
                            "</div>\n" +
                            "\n" +
                            "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"\n" +
                            "        integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\"\n" +
                            "        crossorigin=\"anonymous\"></script>\n" +
                            "</body>\n" +
                            "</html>"
            );
        } else {
            writer.write(
                    "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>Phone</title>\n" +
                            "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                            "          integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "\n" +
                            "<div class=\"container\">\n" +
                            "    <h1 class=\"text-center text-danger\">xatolik</h1>\n" +
                            "    <a href=\"http://localhost:8080/phone\" class=\"btn btn-success\">orqaga</a>\n" +
                            "</div>\n" +
                            "\n" +
                            "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"\n" +
                            "        integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\"\n" +
                            "        crossorigin=\"anonymous\"></script>\n" +
                            "</body>\n" +
                            "</html>"
            );
        }
    }
}
