package template.client;

import model.Phone;
import service.DbService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserPanel {
    public String userPanel() throws IOException, SQLException, ClassNotFoundException {
        String bootstrapCss = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\css\\bootstrap.min.css");
        String style = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\css\\style.css");
        String responsive = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\css\\responsive.css");
        String jqueryCss = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\css\\jquery.mCustomScrollbar.min.css");
        String owlCarousel = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\css\\owl.carousel.min.css");

        String jqueryJs = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\js\\jquery.min.js");
        String popper = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\js\\popper.min.js");
        String bundle = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\js\\bootstrap.bundle.min.js");
        String minJs = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\js\\jquery-3.0.0.min.js");
        String plugin = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\js\\plugin.js");
        String customM = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\js\\jquery.mCustomScrollbar.concat.min.js");
        String custom = links("D:\\java\\my-full-stack-group-projects\\web-3-edu-center\\web-4-first-spring\\src\\main\\java\\template\\client\\assets\\js\\custom.js");
        DbService dbService = new DbService();
        List<Phone> phoneList = dbService.getPhoneList();
        StringBuilder phones = new StringBuilder();
        for (Phone phone : phoneList) {
            phones.append(
                    "                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-6 margin\">\n" +
                            "                        <div class=\"shadow brand_box\">\n" +
                            "                            <img src=\"" + phone.getColor() + "\" alt=\"img\" />\n" +
                            "                            <h3><strong class=\"red\">" + phone.getName() + "</strong></h3>\n" +
                            "                            <span> year : " + phone.getYear() + " </span>\n" +
                            "                            <span> xotirasi " + phone.getMemory() + " </span>\n" +
                            "                            <span> narxi " + phone.getPrice() + " </span>\n" +
                            "                        </div>\n" +
                            "                    </div>\n"
            );
        }
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "    <!-- basic -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n" +
                "    <title>pomato</title>\n" +
                "    <meta name=\"keywords\" content=\"\">\n" +
                "    <meta name=\"description\" content=\"\">\n" +
                "    <meta name=\"author\" content=\"\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
                "    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\" media=\"screen\">\n" +
                "      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n" +
                "      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n" +
                "</head>\n" +
                "<!-- body -->\n" +
                "\n" +
                "<body class=\"main-layout \">\n" +
                "<style>" +
                bootstrapCss + style + responsive + jqueryCss + owlCarousel +
                "</style>" +
                "    <header>\n" +
                "        <!-- header inner -->\n" +
                "        <!-- end header inner -->\n" +
                "    </header>\n" +
                "\n" +
                "    <!-- brand -->\n" +
                "    <div class=\"brand\">\n" +
                "        <div class=\"container\">\n" +
                "            <div class=\"row\">\n" +
                "                <div class=\"col-md-12\">\n" +
                "                    <div class=\"titlepage\">\n" +
                "                        <h2 class=\"text-center text-danger\">Bizning telefonlarimiz. Dux bor Pul bor <a class=\"btn btn-danger\" href=\"http://localhost:8080/login\">kirish</a></h2>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"brand-bg\">\n" +
                "            <div class=\"container\">\n" +
                "                <div class=\"row\">\n" +
                phones +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <!-- end brand -->\n" +
                "    <!-- contact -->\n" +
                "    <div class=\"contact\">\n" +
                "        <div class=\"container\">\n" +
                "            <div class=\"row\">\n" +
                "                <div class=\"col-md-12\">\n" +
                "                    <div class=\"titlepage\">\n" +
                "                        <h2>Biz bilan a'loqa</h2>\n" +
                "                    </div>\n" +
                "                    <form class=\"main_form\">\n" +
                "                        <div class=\"row\">\n" +
                "                            <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-6\">\n" +
                "                                <input class=\"form-control\" placeholder=\"Your name\" type=\"text\" name=\"Your Name\">\n" +
                "                            </div>\n" +
                "                            <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-6\">\n" +
                "                                <input class=\"form-control\" placeholder=\"Email\" type=\"text\" name=\"Email\">\n" +
                "                            </div>\n" +
                "                            <div class=\" col-md-12\">\n" +
                "                                <input class=\"form-control\" placeholder=\"Phone\" type=\"text\" name=\"Phone\">\n" +
                "                            </div>\n" +
                "                            <div class=\"col-md-12\">\n" +
                "                                <textarea class=\"textarea\" placeholder=\"Message\"></textarea>\n" +
                "                            </div>\n" +
                "                            <div class=\" col-md-12\">\n" +
                "                                <button class=\"send\">Send</button>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </form>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <!-- end contact -->\n" +
                "\n" +
                "    <!-- footer -->\n" +
                "    <footer>\n" +
                "        <div id=\"contact\" class=\"footer\">\n" +
                "            <div class=\"container\">\n" +
                "                <div class=\"row pdn-top-30\">\n" +
                "                    <div class=\"col-md-12 \">\n" +
                "                        <div class=\"footer-box\">\n" +
                "                            <div class=\"headinga\">\n" +
                "                                <h3>Address</h3>\n" +
                "                                <span>Bizdan tel sotib oling va zavqlaning</span>\n" +
                "                                <p>(94)669-03-07\n" +
                "                                    <br>Mirshod@gmail.com</p>\n" +
                "                            </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"copyright\">\n" +
                "                <div class=\"container\">\n" +
                "                    <p>© 2023-Yil 10-iyul kuni biz mirshod bilan ushbu platformani yaratdik</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </footer>\n" +
                "<script>" +
                custom +
                "</script>" +
                "<script>" +
                plugin +
                "</script>" +
                "<script>" +
                popper +
                "</script>" +
                "<script>" +
                bundle +
                "</script>" +
                "<script>" +
                minJs +
                "</script>" +
                "<script>" +
                customM +
                "</script>" +
                "<script>" +
                jqueryJs +
                "</script>" +
                "    <script src=\"https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js\"></script>\n" +
                "    <script>\n" +
                "        $(document).ready(function() {\n" +
                "            $(\".fancybox\").fancybox({\n" +
                "                openEffect: \"none\",\n" +
                "                closeEffect: \"none\"\n" +
                "            });\n" +
                "\n" +
                "            $(\".zoom\").hover(function() {\n" +
                "\n" +
                "                $(this).addClass('transition');\n" +
                "            }, function() {\n" +
                "\n" +
                "                $(this).removeClass('transition');\n" +
                "            });\n" +
                "        });\n" +
                "    </script>\n" +
                "</body>\n" +
                "\n" +
                "</html>";
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
