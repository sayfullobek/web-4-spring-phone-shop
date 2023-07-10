package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Title</title>\n" +
                        "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                        "          integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\"\n" +
                        "          crossorigin=\"anonymous\">\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<div class=\"container d-flex align-items-center justify-content-center flex-column\" style=\"height: 100vh\">\n" +
                        "    <form action=\"/login\" class=\"border shadow p-5 w-50 d-flex align-items-center justify-content-center flex-column\"\n" +
                        "          method=\"post\">\n" +
                        "        <h1 class=\"text-center text-primary\">login</h1>\n" +
                        "        <input type=\"number\" placeholder=\"enter phone number\" id=\"phoneNumber\" name=\"phoneNumber\"\n" +
                        "               class=\"form-control mt-3\">\n" +
                        "        <input type=\"password\" placeholder=\"enter password\" id=\"password\" name=\"password\" class=\"form-control mt-3\">\n" +
                        "        <a href=\"#\" onclick=\"login()\" type=\"submit\" class=\"btn btn-primary mt-3\">login</a>\n" +
                        "    </form>\n" +
                        "</div>\n" +
                        "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"\n" +
                        "        integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\"\n" +
                        "        crossorigin=\"anonymous\"></script>\n" +
                        "\n" +
                        "<script>\n" +
                        "    function login() {\n" +
                        "        let phone = document.getElementById(\"phoneNumber\").value;\n" +
                        "        let password = document.getElementById(\"password\").value;\n" +
                        "        if (phone === \"99000998877\") {\n" +
                        "            if (password === \"root123\") {\n" +
                        "                localStorage.setItem(\"phoneNumber\", phone)\n" +
                        "                localStorage.setItem(\"password\", password)\n" +
                        "                window.location.href = \"http://localhost:8080/dashboard\"\n" +
                        "            } else {\n" +
                        "                return alert(\"parol xato\")\n" +
                        "            }\n" +
                        "        } else {\n" +
                        "            return alert(\"tel raqam xato\")\n" +
                        "        }\n" +
                        "    }\n" +
                        "</script>\n" +
                        "</body>\n" +
                        "</html>"
        );
    }
}
