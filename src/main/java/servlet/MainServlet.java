package servlet;

import template.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {
    //crud
    //create -> doPost
    //read -> doGet
    //update -> doUpdate
    //delete -> doDelete

    //req -> request -> so'rov
    //resp -> response -> javob

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Component component = new Component();
        PrintWriter writer = resp.getWriter();
        writer.write(
                component.Dashboard(main())
        );
    }

    public String main() {
        return "    <!-- Header -->\n" +
                "    <div class=\"header bg-gradient-primary pb-8 pt-5 pt-md-8\">\n" +
                "      <div class=\"container-fluid\">\n" +
                "        <div class=\"header-body\">\n" +
                "          <!-- Card stats -->\n" +
                "          <div class=\"row\">\n" +
                "            <div class=\"col-xl-3 col-lg-6\">\n" +
                "              <div class=\"card card-stats mb-4 mb-xl-0\">\n" +
                "                <div class=\"card-body\">\n" +
                "                  <div class=\"row\">\n" +
                "                    <div class=\"col\">\n" +
                "                      <h5 class=\"card-title text-uppercase text-muted mb-0\">Traffic</h5>\n" +
                "                      <span class=\"h2 font-weight-bold mb-0\">350,897</span>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-auto\">\n" +
                "                      <div class=\"icon icon-shape bg-danger text-white rounded-circle shadow\">\n" +
                "                        <i class=\"fas fa-chart-bar\"></i>\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <p class=\"mt-3 mb-0 text-muted text-sm\">\n" +
                "                    <span class=\"text-success mr-2\"><i class=\"fa fa-arrow-up\"></i> 3.48%</span>\n" +
                "                    <span class=\"text-nowrap\">Since last month</span>\n" +
                "                  </p>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"col-xl-3 col-lg-6\">\n" +
                "              <div class=\"card card-stats mb-4 mb-xl-0\">\n" +
                "                <div class=\"card-body\">\n" +
                "                  <div class=\"row\">\n" +
                "                    <div class=\"col\">\n" +
                "                      <h5 class=\"card-title text-uppercase text-muted mb-0\">New users</h5>\n" +
                "                      <span class=\"h2 font-weight-bold mb-0\">2,356</span>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-auto\">\n" +
                "                      <div class=\"icon icon-shape bg-warning text-white rounded-circle shadow\">\n" +
                "                        <i class=\"fas fa-chart-pie\"></i>\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <p class=\"mt-3 mb-0 text-muted text-sm\">\n" +
                "                    <span class=\"text-danger mr-2\"><i class=\"fas fa-arrow-down\"></i> 3.48%</span>\n" +
                "                    <span class=\"text-nowrap\">Since last week</span>\n" +
                "                  </p>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"col-xl-3 col-lg-6\">\n" +
                "              <div class=\"card card-stats mb-4 mb-xl-0\">\n" +
                "                <div class=\"card-body\">\n" +
                "                  <div class=\"row\">\n" +
                "                    <div class=\"col\">\n" +
                "                      <h5 class=\"card-title text-uppercase text-muted mb-0\">Sales</h5>\n" +
                "                      <span class=\"h2 font-weight-bold mb-0\">924</span>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-auto\">\n" +
                "                      <div class=\"icon icon-shape bg-yellow text-white rounded-circle shadow\">\n" +
                "                        <i class=\"fas fa-users\"></i>\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <p class=\"mt-3 mb-0 text-muted text-sm\">\n" +
                "                    <span class=\"text-warning mr-2\"><i class=\"fas fa-arrow-down\"></i> 1.10%</span>\n" +
                "                    <span class=\"text-nowrap\">Since yesterday</span>\n" +
                "                  </p>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"col-xl-3 col-lg-6\">\n" +
                "              <div class=\"card card-stats mb-4 mb-xl-0\">\n" +
                "                <div class=\"card-body\">\n" +
                "                  <div class=\"row\">\n" +
                "                    <div class=\"col\">\n" +
                "                      <h5 class=\"card-title text-uppercase text-muted mb-0\">Performance</h5>\n" +
                "                      <span class=\"h2 font-weight-bold mb-0\">49,65%</span>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-auto\">\n" +
                "                      <div class=\"icon icon-shape bg-info text-white rounded-circle shadow\">\n" +
                "                        <i class=\"fas fa-percent\"></i>\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                  <p class=\"mt-3 mb-0 text-muted text-sm\">\n" +
                "                    <span class=\"text-success mr-2\"><i class=\"fas fa-arrow-up\"></i> 12%</span>\n" +
                "                    <span class=\"text-nowrap\">Since last month</span>\n" +
                "                  </p>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <div class=\"container-fluid mt--7\">\n" +
                "      <div class=\"row\">\n" +
                "        <div class=\"col-xl-8 mb-5 mb-xl-0\">\n" +
                "          <div class=\"card bg-gradient-default shadow\">\n" +
                "            <div class=\"card-header bg-transparent\">\n" +
                "              <div class=\"row align-items-center\">\n" +
                "                <div class=\"col\">\n" +
                "                  <h6 class=\"text-uppercase text-light ls-1 mb-1\">Overview</h6>\n" +
                "                  <h2 class=\"text-white mb-0\">Sales value</h2>\n" +
                "                </div>\n" +
                "                <div class=\"col\">\n" +
                "                  <ul class=\"nav nav-pills justify-content-end\">\n" +
                "                    <li class=\"nav-item mr-2 mr-md-0\" data-toggle=\"chart\" data-target=\"#chart-sales\" data-update='{\"data\":{\"datasets\":[{\"data\":[0, 20, 10, 30, 15, 40, 20, 60, 60]}]}}' data-prefix=\"$\" data-suffix=\"k\">\n" +
                "                      <a href=\"#\" class=\"nav-link py-2 px-3 active\" data-toggle=\"tab\">\n" +
                "                        <span class=\"d-none d-md-block\">Month</span>\n" +
                "                        <span class=\"d-md-none\">M</span>\n" +
                "                      </a>\n" +
                "                    </li>\n" +
                "                    <li class=\"nav-item\" data-toggle=\"chart\" data-target=\"#chart-sales\" data-update='{\"data\":{\"datasets\":[{\"data\":[0, 20, 5, 25, 10, 30, 15, 40, 40]}]}}' data-prefix=\"$\" data-suffix=\"k\">\n" +
                "                      <a href=\"#\" class=\"nav-link py-2 px-3\" data-toggle=\"tab\">\n" +
                "                        <span class=\"d-none d-md-block\">Week</span>\n" +
                "                        <span class=\"d-md-none\">W</span>\n" +
                "                      </a>\n" +
                "                    </li>\n" +
                "                  </ul>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"card-body\">\n" +
                "              <!-- Chart -->\n" +
                "              <div class=\"chart\">\n" +
                "                <!-- Chart wrapper -->\n" +
                "                <canvas id=\"chart-sales\" class=\"chart-canvas\"></canvas>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "        <div class=\"col-xl-4\">\n" +
                "          <div class=\"card shadow\">\n" +
                "            <div class=\"card-header bg-transparent\">\n" +
                "              <div class=\"row align-items-center\">\n" +
                "                <div class=\"col\">\n" +
                "                  <h6 class=\"text-uppercase text-muted ls-1 mb-1\">Performance</h6>\n" +
                "                  <h2 class=\"mb-0\">Total orders</h2>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"card-body\">\n" +
                "              <!-- Chart -->\n" +
                "              <div class=\"chart\">\n" +
                "                <canvas id=\"chart-orders\" class=\"chart-canvas\"></canvas>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div class=\"row mt-5\">\n" +
                "        <div class=\"col-xl-8 mb-5 mb-xl-0\">\n" +
                "          <div class=\"card shadow\">\n" +
                "            <div class=\"card-header border-0\">\n" +
                "              <div class=\"row align-items-center\">\n" +
                "                <div class=\"col\">\n" +
                "                  <h3 class=\"mb-0\">Page visits</h3>\n" +
                "                </div>\n" +
                "                <div class=\"col text-right\">\n" +
                "                  <a href=\"#!\" class=\"btn btn-sm btn-primary\">See all</a>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"table-responsive\">\n" +
                "              <!-- Projects table -->\n" +
                "              <table class=\"table align-items-center table-flush\">\n" +
                "                <thead class=\"thead-light\">\n" +
                "                  <tr>\n" +
                "                    <th scope=\"col\">Page name</th>\n" +
                "                    <th scope=\"col\">Visitors</th>\n" +
                "                    <th scope=\"col\">Unique users</th>\n" +
                "                    <th scope=\"col\">Bounce rate</th>\n" +
                "                  </tr>\n" +
                "                </thead>\n" +
                "                <tbody>\n" +
                "                  <tr>\n" +
                "                    <th scope=\"row\">\n" +
                "                      /argon/\n" +
                "                    </th>\n" +
                "                    <td>\n" +
                "                      4,569\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      340\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      <i class=\"fas fa-arrow-up text-success mr-3\"></i> 46,53%\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <th scope=\"row\">\n" +
                "                      /argon/index.html\n" +
                "                    </th>\n" +
                "                    <td>\n" +
                "                      3,985\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      319\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      <i class=\"fas fa-arrow-down text-warning mr-3\"></i> 46,53%\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <th scope=\"row\">\n" +
                "                      /argon/charts.html\n" +
                "                    </th>\n" +
                "                    <td>\n" +
                "                      3,513\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      294\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      <i class=\"fas fa-arrow-down text-warning mr-3\"></i> 36,49%\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <th scope=\"row\">\n" +
                "                      /argon/tables.html\n" +
                "                    </th>\n" +
                "                    <td>\n" +
                "                      2,050\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      147\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      <i class=\"fas fa-arrow-up text-success mr-3\"></i> 50,87%\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <th scope=\"row\">\n" +
                "                      /argon/profile.html\n" +
                "                    </th>\n" +
                "                    <td>\n" +
                "                      1,795\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      190\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      <i class=\"fas fa-arrow-down text-danger mr-3\"></i> 46,53%\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                </tbody>\n" +
                "              </table>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "        <div class=\"col-xl-4\">\n" +
                "          <div class=\"card shadow\">\n" +
                "            <div class=\"card-header border-0\">\n" +
                "              <div class=\"row align-items-center\">\n" +
                "                <div class=\"col\">\n" +
                "                  <h3 class=\"mb-0\">Social traffic</h3>\n" +
                "                </div>\n" +
                "                <div class=\"col text-right\">\n" +
                "                  <a href=\"#!\" class=\"btn btn-sm btn-primary\">See all</a>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"table-responsive\">\n" +
                "              <!-- Projects table -->\n" +
                "              <table class=\"table align-items-center table-flush\">\n" +
                "                <thead class=\"thead-light\">\n" +
                "                  <tr>\n" +
                "                    <th scope=\"col\">Referral</th>\n" +
                "                    <th scope=\"col\">Visitors</th>\n" +
                "                    <th scope=\"col\"></th>\n" +
                "                  </tr>\n" +
                "                </thead>\n" +
                "                <tbody>\n" +
                "                  <tr>\n" +
                "                    <th scope=\"row\">\n" +
                "                      Facebook\n" +
                "                    </th>\n" +
                "                    <td>\n" +
                "                      1,480\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      <div class=\"d-flex align-items-center\">\n" +
                "                        <span class=\"mr-2\">60%</span>\n" +
                "                        <div>\n" +
                "                          <div class=\"progress\">\n" +
                "                            <div class=\"progress-bar bg-gradient-danger\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%;\"></div>\n" +
                "                          </div>\n" +
                "                        </div>\n" +
                "                      </div>\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <th scope=\"row\">\n" +
                "                      Facebook\n" +
                "                    </th>\n" +
                "                    <td>\n" +
                "                      5,480\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      <div class=\"d-flex align-items-center\">\n" +
                "                        <span class=\"mr-2\">70%</span>\n" +
                "                        <div>\n" +
                "                          <div class=\"progress\">\n" +
                "                            <div class=\"progress-bar bg-gradient-success\" role=\"progressbar\" aria-valuenow=\"70\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 70%;\"></div>\n" +
                "                          </div>\n" +
                "                        </div>\n" +
                "                      </div>\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <th scope=\"row\">\n" +
                "                      Google\n" +
                "                    </th>\n" +
                "                    <td>\n" +
                "                      4,807\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      <div class=\"d-flex align-items-center\">\n" +
                "                        <span class=\"mr-2\">80%</span>\n" +
                "                        <div>\n" +
                "                          <div class=\"progress\">\n" +
                "                            <div class=\"progress-bar bg-gradient-primary\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%;\"></div>\n" +
                "                          </div>\n" +
                "                        </div>\n" +
                "                      </div>\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <th scope=\"row\">\n" +
                "                      Instagram\n" +
                "                    </th>\n" +
                "                    <td>\n" +
                "                      3,678\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      <div class=\"d-flex align-items-center\">\n" +
                "                        <span class=\"mr-2\">75%</span>\n" +
                "                        <div>\n" +
                "                          <div class=\"progress\">\n" +
                "                            <div class=\"progress-bar bg-gradient-info\" role=\"progressbar\" aria-valuenow=\"75\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 75%;\"></div>\n" +
                "                          </div>\n" +
                "                        </div>\n" +
                "                      </div>\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <th scope=\"row\">\n" +
                "                      twitter\n" +
                "                    </th>\n" +
                "                    <td>\n" +
                "                      2,645\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                      <div class=\"d-flex align-items-center\">\n" +
                "                        <span class=\"mr-2\">30%</span>\n" +
                "                        <div>\n" +
                "                          <div class=\"progress\">\n" +
                "                            <div class=\"progress-bar bg-gradient-warning\" role=\"progressbar\" aria-valuenow=\"30\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 30%;\"></div>\n" +
                "                          </div>\n" +
                "                        </div>\n" +
                "                      </div>\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                </tbody>\n" +
                "              </table>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <!-- Footer -->\n" +
                "      <footer class=\"footer\">\n" +
                "        <div class=\"row align-items-center justify-content-xl-between\">\n" +
                "          <div class=\"col-xl-6\">\n" +
                "            <div class=\"copyright text-center text-xl-left text-muted\">\n" +
                "              &copy; 2018 <a href=\"https://www.creative-tim.com\" class=\"font-weight-bold ml-1\" target=\"_blank\">Creative Tim</a>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"col-xl-6\">\n" +
                "            <ul class=\"nav nav-footer justify-content-center justify-content-xl-end\">\n" +
                "              <li class=\"nav-item\">\n" +
                "                <a href=\"https://www.creative-tim.com\" class=\"nav-link\" target=\"_blank\">Creative Tim</a>\n" +
                "              </li>\n" +
                "              <li class=\"nav-item\">\n" +
                "                <a href=\"https://www.creative-tim.com/presentation\" class=\"nav-link\" target=\"_blank\">About Us</a>\n" +
                "              </li>\n" +
                "              <li class=\"nav-item\">\n" +
                "                <a href=\"http://blog.creative-tim.com\" class=\"nav-link\" target=\"_blank\">Blog</a>\n" +
                "              </li>\n" +
                "              <li class=\"nav-item\">\n" +
                "                <a href=\"https://github.com/creativetimofficial/argon-dashboard/blob/master/LICENSE.md\" class=\"nav-link\" target=\"_blank\">MIT License</a>\n" +
                "              </li>\n" +
                "            </ul>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </footer>\n" +
                "    </div>\n";
    }
}
