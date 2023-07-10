package template;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Component {
    public String Dashboard(String page) throws IOException {
        String nukle = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\assets\\js\\plugins\\nucleo\\css\\nucleo.css");
        String allMinCss = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\assets\\js\\plugins\\@fortawesome\\fontawesome-free\\css\\all.min.css");
        String argon = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\assets\\css\\argon-dashboard.min.css");
        String minJs = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\assets\\js\\plugins\\jquery\\dist\\jquery.min.js");
        String bundleJs = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\assets\\js\\plugins\\bootstrap\\dist\\js\\bootstrap.bundle.min.js");
        String chartMin = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\assets\\js\\plugins\\chart.js\\dist\\Chart.min.js");
        String chartEx = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\assets\\js\\plugins\\chart.js\\dist\\Chart.extension.js");
        String argonJs = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\assets\\js\\argon-dashboard.min.js");
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\" />\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "  <title>\n" +
                "    Argon Dashboard - Free Dashboard for Bootstrap 4 by Creative Tim\n" +
                "  </title>\n" +
                "  <!-- Favicon -->\n" +
                "<link rel=\"shortcut icon\" href=\"\">\n" +
                "  <link href=\"./assets/img/brand/favicon.png\" rel=\"icon\" type=\"image/png\">\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
                "          integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n" +
                "  <!-- Fonts -->\n" +
                "  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\">\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"\">" +
                "<style>" +
                nukle +
                allMinCss + argon +
                "</style>" +
                sideBar() +
                "<div class=\"main-content\">\n" +
                nav() +
                page +
                "</div>" +
                "<script>" +
                minJs +
                "</script>" +
                "<script>" +
                bundleJs +
                "</script>" +
                "<script>" +
                chartMin +
                "</script>" +
                "<script>" +
                chartEx +
                "</script>"
                + "<script>" +
                argonJs +
                "</script>" +
                "  <script src=\"https://cdn.trackjs.com/agent/v3/latest/t.js\"></script>\n" +
                "  <script>\n" +
                "    window.TrackJS &&\n" +
                "      TrackJS.install({\n" +
                "        token: \"ee6fab19c5a04ac1a32a645abde4613a\",\n" +
                "        application: \"argon-dashboard-free\"\n" +
                "      });\n" +
                "  </script>\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"\n" +
                "        integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\"\n" +
                "        crossorigin=\"anonymous\"></script>\n" +
                "<script>\n" +
                "    if (localStorage.length === 0) {\n" +
                "        window.location.href = \"http://localhost:8080/login\"\n" +
                "    }\n" +
                "</script>" +
                "<script>\n" +
                "    function logout() {\n" +
                "        localStorage.clear()\n" +
                "        window.location.reload()\n" +
                "    }\n" +
                "</script>" +
                "</body>\n" +
                "\n" +
                "</html>";
    }

    public String nav() {
        return "    <nav class=\"navbar navbar-top navbar-expand-md navbar-dark\" id=\"navbar-main\">\n" +
                "      <div class=\"container-fluid\">\n" +
                "        <!-- Brand -->\n" +
                "        <a class=\"h4 mb-0 text-white text-uppercase d-none d-lg-inline-block\" href=\"http://localhost:8080/dashboard\">Dashboard</a>\n" +
                "        <!-- Form -->\n" +
                "        <ul class=\"navbar-nav align-items-center d-none d-md-flex\">\n" +
                "          <li class=\"nav-item dropdown\">\n" +
                "            <a class=\"nav-link pr-0\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
                "              <div class=\"media align-items-center\">\n" +
                "                <span class=\"avatar avatar-sm rounded-circle\">\n" +
                "                  <img alt=\"Image placeholder\" src=\"https://static.vecteezy.com/system/resources/previews/001/503/720/original/a-cute-sheep-on-white-background-free-vector.jpg\">\n" +
                "                </span>\n" +
                "                <div class=\"media-body ml-2 d-none d-lg-block\">\n" +
                "                  <span class=\"mb-0 text-sm  font-weight-bold\">Mirshod shogirt</span>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </a>\n" +
                "            <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\">\n" +
                "              <div class=\"dropdown-divider\"></div>\n" +
                "              <a href=\"#!\" class=\"dropdown-item\">\n" +
                "                <i class=\"ni ni-user-run\"></i>\n" +
                "                <span onclick=\"logout()\">Logout</span>\n" +
                "              </a>\n" +
                "            </div>\n" +
                "          </li>\n" +
                "        </ul>\n" +
                "      </div>\n" +
                "    </nav>\n";
    }

    public String sideBar() {
        List<Side> sideList = Arrays.asList(
                new Side("Asosiy", "", "/dashboard"),
                new Side("Davlatlar", "", "/country"),
                new Side("Viloyat", "", "/region"),
                new Side("Tuman", "", "/district"),
                new Side("Telefon", "", "/phone")
        );
        StringBuilder str = new StringBuilder();
        for (Side side : sideList) {
            str.append(
                    "<li class=\"nav-item  active \">\n" +
                            "<a class=\"nav-link  active \" href=\"" + side.getLink() + "\">\n" +
                            "<i class=\"" + side.getIcon() + " text-primary\"></i>" + side.getName() + "\n" +
                            "</a>\n" +
                            "</li>\n"
            );
        }
        return "  <nav class=\"navbar navbar-vertical fixed-left navbar-expand-md navbar-light bg-white\" id=\"sidenav-main\">\n" +
                "    <div class=\"container-fluid\">\n" +
                "      <!-- Toggler -->\n" +
                "      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#sidenav-collapse-main\" aria-controls=\"sidenav-main\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "        <span class=\"navbar-toggler-icon\"></span>\n" +
                "      </button>\n" +
                "      <!-- Brand -->\n" +
                "      <a class=\"navbar-brand pt-0\" href=\"http://localhost:8080/dashboard\">\n" +
                "        <img src=\"https://static.vecteezy.com/system/resources/previews/001/503/720/original/a-cute-sheep-on-white-background-free-vector.jpg\" alt=\"...\">\n" +
                "      </a>\n" +
                "      <!-- User -->\n" +
                "      <ul class=\"nav align-items-center d-md-none\">\n" +
                "        <li class=\"nav-item dropdown\">\n" +
                "          <a class=\"nav-link nav-link-icon\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
                "            <i class=\"ni ni-bell-55\"></i>\n" +
                "          </a>\n" +
                "          <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\" aria-labelledby=\"navbar-default_dropdown_1\">\n" +
                "            <a class=\"dropdown-item\" href=\"#\">Action</a>\n" +
                "            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n" +
                "            <div class=\"dropdown-divider\"></div>\n" +
                "            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n" +
                "          </div>\n" +
                "        </li>\n" +
                "        <li class=\"nav-item dropdown\">\n" +
                "          <a class=\"nav-link\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
                "            <div class=\"media align-items-center\">\n" +
                "              <span class=\"avatar avatar-sm rounded-circle\">\n" +
                "                <img alt=\"Image placeholder\" src=\"./assets/img/theme/team-1-800x800.jpg\n" +
                "\">\n" +
                "              </span>\n" +
                "            </div>\n" +
                "          </a>\n" +
                "          <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\">\n" +
                "            <div class=\" dropdown-header noti-title\">\n" +
                "              <h6 class=\"text-overflow m-0\">Welcome!</h6>\n" +
                "            </div>\n" +
                "            <a href=\"./examples/profile.html\" class=\"dropdown-item\">\n" +
                "              <i class=\"ni ni-single-02\"></i>\n" +
                "              <span>My profile</span>\n" +
                "            </a>\n" +
                "            <a href=\"./examples/profile.html\" class=\"dropdown-item\">\n" +
                "              <i class=\"ni ni-settings-gear-65\"></i>\n" +
                "              <span>Settings</span>\n" +
                "            </a>\n" +
                "            <a href=\"./examples/profile.html\" class=\"dropdown-item\">\n" +
                "              <i class=\"ni ni-calendar-grid-58\"></i>\n" +
                "              <span>Activity</span>\n" +
                "            </a>\n" +
                "            <a href=\"./examples/profile.html\" class=\"dropdown-item\">\n" +
                "              <i class=\"ni ni-support-16\"></i>\n" +
                "              <span>Support</span>\n" +
                "            </a>\n" +
                "            <div class=\"dropdown-divider\"></div>\n" +
                "            <a href=\"#!\" class=\"dropdown-item\">\n" +
                "              <i class=\"ni ni-user-run\"></i>\n" +
                "              <span>Logout</span>\n" +
                "            </a>\n" +
                "          </div>\n" +
                "        </li>\n" +
                "      </ul>\n" +
                "      <!-- Collapse -->\n" +
                "      <div class=\"collapse navbar-collapse\" id=\"sidenav-collapse-main\">\n" +
                "        <!-- Collapse header -->\n" +
                "        <div class=\"navbar-collapse-header d-md-none\">\n" +
                "          <div class=\"row\">\n" +
                "            <div class=\"col-6 collapse-brand\">\n" +
                "              <a href=\"./index.html\">\n" +
                "                <img src=\"./assets/img/brand/blue.png\">\n" +
                "              </a>\n" +
                "            </div>\n" +
                "            <div class=\"col-6 collapse-close\">\n" +
                "              <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#sidenav-collapse-main\" aria-controls=\"sidenav-main\" aria-expanded=\"false\" aria-label=\"Toggle sidenav\">\n" +
                "                <span></span>\n" +
                "                <span></span>\n" +
                "              </button>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "        <!-- Form -->\n" +
                "        <form class=\"mt-4 mb-3 d-md-none\">\n" +
                "          <div class=\"input-group input-group-rounded input-group-merge\">\n" +
                "            <input type=\"search\" class=\"form-control form-control-rounded form-control-prepended\" placeholder=\"Search\" aria-label=\"Search\">\n" +
                "            <div class=\"input-group-prepend\">\n" +
                "              <div class=\"input-group-text\">\n" +
                "                <span class=\"fa fa-search\"></span>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </form>\n" +
                "        <!-- Navigation -->\n" +
                "        <ul class=\"navbar-nav\">\n" +
                str +
                "        </ul>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </nav>\n";
    }

    public String links(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        StringBuilder str = new StringBuilder();
        while (line != null) {
            str.append(line);
            line = bufferedReader.readLine();
        }
        return str.toString();
    }
}
