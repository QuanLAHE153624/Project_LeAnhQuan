package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Chinese-Foods&Drinks</title>\n");
      out.write("        <link rel=\"icon\" href=\"images/logo.jpg\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"goto-here\">\n");
      out.write("       <div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"ftco-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row no-gutters ftco-services\">\n");
      out.write("                    <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n");
      out.write("                        <div class=\"media block-6 services mb-md-0 mb-4\">\n");
      out.write("                            <div class=\"icon bg-color-1 active d-flex justify-content-center align-items-center mb-2\">\n");
      out.write("                                <span class=\"flaticon-shipped\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h3 class=\"heading\">Free Shipping</h3>\n");
      out.write("                                <span>On order over $100</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>      \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n");
      out.write("                        <div class=\"media block-6 services mb-md-0 mb-4\">\n");
      out.write("                            <div class=\"icon bg-color-2 d-flex justify-content-center align-items-center mb-2\">\n");
      out.write("                                <span class=\"flaticon-diet\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h3 class=\"heading\">Always Delicious</h3>\n");
      out.write("                                <span>Product well package</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>    \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n");
      out.write("                        <div class=\"media block-6 services mb-md-0 mb-4\">\n");
      out.write("                            <div class=\"icon bg-color-3 d-flex justify-content-center align-items-center mb-2\">\n");
      out.write("                                <span class=\"flaticon-award\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h3 class=\"heading\">Superior Quality</h3>\n");
      out.write("                                <span>Quality Products</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>      \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 text-center d-flex align-self-stretch ftco-animate\">\n");
      out.write("                        <div class=\"media block-6 services mb-md-0 mb-4\">\n");
      out.write("                            <div class=\"icon bg-color-4 d-flex justify-content-center align-items-center mb-2\">\n");
      out.write("                                <span class=\"flaticon-customer-service\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h3 class=\"heading\">Support</h3>\n");
      out.write("                                <span>24/7 Support</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>      \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"ftco-section ftco-category ftco-no-pt\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 order-md-last align-items-stretch d-flex\">\n");
      out.write("                                <div class=\"category-wrap-2 ftco-animate img align-self-stretch d-flex\" style=\"background-image: url(images/category.jpg);\">\n");
      out.write("                                    <div class=\"text text-center\">\n");
      out.write("                                        <h2>Foods&Drinks</h2>\n");
      out.write("                                        <p>Product trend for teenage</p>\n");
      out.write("                                        <p><a href=\"list\" class=\"btn btn-primary\">Shop now</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"category-wrap ftco-animate img mb-4 d-flex align-items-end\" style=\"background-image: url(images/category-1.jpg);\">\n");
      out.write("                                    <div class=\"text px-3 py-1\">\n");
      out.write("                                        <h2 class=\"mb-0\"><a href=\"category?cid=2\">Snacks</a></h2>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"category-wrap ftco-animate img d-flex align-items-end\" style=\"background-image: url(images/category-2.jpg);\">\n");
      out.write("                                    <div class=\"text px-3 py-1\">\n");
      out.write("                                        <h2 class=\"mb-0\"><a href=\"category?cid=1\">Spicy sticks</a></h2>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"category-wrap ftco-animate img mb-4 d-flex align-items-end\" style=\"background-image: url(images/category-3.jpg);\">\n");
      out.write("                            <div class=\"text px-3 py-1\">\n");
      out.write("                                <h2 class=\"mb-0\"><a href=\"category?cid=3\">Drinks</a></h2>\n");
      out.write("                            </div>\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"category-wrap ftco-animate img d-flex align-items-end\" style=\"background-image: url(images/category-4.jpg);\">\n");
      out.write("                            <div class=\"text px-3 py-1\">\n");
      out.write("                                <h2 class=\"mb-0\"><a href=\"category?cid=4\">Instant food</a></h2>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"ftco-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center mb-3 pb-3\">\n");
      out.write("                    <div class=\"col-md-12 heading-section text-center ftco-animate\">\n");
      out.write("                        <span class=\"subheading\">Featured Products</span>\n");
      out.write("                        <h2 class=\"mb-4\">Our Products</h2>\n");
      out.write("                        <p>Far far away, behind the word mountains, far from the countries Chinese</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>   \t\t\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                      ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </div>              \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"ftco-section img\" style=\"background-image: url(images/bg_3.jpg)\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-end\">\n");
      out.write("                    <div class=\"col-md-6 heading-section ftco-animate deal-of-the-day ftco-animate\">\n");
      out.write("                        <span class=\"subheading\">Best Price For You</span>\n");
      out.write("                        <h2 class=\"mb-4\">Deal of the day</h2>\n");
      out.write("                        <p>Far far away, behind the word mountains, far from the countries Chinese</p>\n");
      out.write("                        <h3><a href=\"detail?pid=7\">Rio drinks</a></h3>\n");
      out.write("                        <span class=\"price\"><a href=\"detail?pid=7\">$250 now $170 only</a></span>                  \n");
      out.write("                    </div>\n");
      out.write("                </div>   \t\t\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"ftco-section testimony-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center mb-5 pb-3\">\n");
      out.write("                    <div class=\"col-md-7 heading-section ftco-animate text-center\">\n");
      out.write("                        <span class=\"subheading\">Testimony</span>\n");
      out.write("                        <h2 class=\"mb-4\">Our satisfied customer says</h2>\n");
      out.write("                        <p>Far far away, behind the word mountains, far from the countries Chinese, there live the blind texts. Separated they live in</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row ftco-animate\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"carousel-testimony owl-carousel\">\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"testimony-wrap p-4 pb-5\">\n");
      out.write("                                    <div class=\"user-img mb-5\" style=\"background-image: url(images/person_1.jpg)\">\n");
      out.write("                                        <span class=\"quote d-flex align-items-center justify-content-center\">\n");
      out.write("                                            <i class=\"icon-quote-left\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"text text-center\">\n");
      out.write("                                        <p class=\"mb-5 pl-4 line\">Far far away, behind the word mountains, far from the countries Chinese, there live the blind texts.</p>\n");
      out.write("                                        <p class=\"name\">Jack Ma</p>\n");
      out.write("                                        <span class=\"position\">Marketing Manager</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"testimony-wrap p-4 pb-5\">\n");
      out.write("                                    <div class=\"user-img mb-5\" style=\"background-image: url(images/person_2.jpg)\">\n");
      out.write("                                        <span class=\"quote d-flex align-items-center justify-content-center\">\n");
      out.write("                                            <i class=\"icon-quote-left\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"text text-center\">\n");
      out.write("                                        <p class=\"mb-5 pl-4 line\">Far far away, behind the word mountains, far from the countries Chinese, there live the blind texts.</p>\n");
      out.write("                                        <p class=\"name\">Lê Anh Quân</p>\n");
      out.write("                                        <span class=\"position\">Interface Designer</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"testimony-wrap p-4 pb-5\">\n");
      out.write("                                    <div class=\"user-img mb-5\" style=\"background-image: url(images/person_3.jpg)\">\n");
      out.write("                                        <span class=\"quote d-flex align-items-center justify-content-center\">\n");
      out.write("                                            <i class=\"icon-quote-left\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"text text-center\">\n");
      out.write("                                        <p class=\"mb-5 pl-4 line\">Far far away, behind the word mountains, far from the countries Chinese, there live the blind texts.</p>\n");
      out.write("                                        <p class=\"name\">Bill Gates</p>\n");
      out.write("                                        <span class=\"position\">UI Designer</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"testimony-wrap p-4 pb-5\">\n");
      out.write("                                    <div class=\"user-img mb-5\" style=\"background-image: url(images/person_5.jpg)\">\n");
      out.write("                                        <span class=\"quote d-flex align-items-center justify-content-center\">\n");
      out.write("                                            <i class=\"icon-quote-left\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"text text-center\">\n");
      out.write("                                        <p class=\"mb-5 pl-4 line\">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>\n");
      out.write("                                        <p class=\"name\">Jeff Bezos</p>\n");
      out.write("                                        <span class=\"position\">Web Developer</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"testimony-wrap p-4 pb-5\">\n");
      out.write("                                    <div class=\"user-img mb-5\" style=\"background-image: url(images/person_4.jpg)\">\n");
      out.write("                                        <span class=\"quote d-flex align-items-center justify-content-center\">\n");
      out.write("                                            <i class=\"icon-quote-left\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"text text-center\">\n");
      out.write("                                        <p class=\"mb-5 pl-4 line\">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>\n");
      out.write("                                        <p class=\"name\">Mark</p>\n");
      out.write("                                        <span class=\"position\">System Analyst</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <section class=\"ftco-section ftco-partner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm ftco-animate\">\n");
      out.write("                        <a href=\"#\" class=\"partner\"><img src=\"images/partner-1.png\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm ftco-animate\">\n");
      out.write("                        <a href=\"#\" class=\"partner\"><img src=\"images/partner-2.png\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm ftco-animate\">\n");
      out.write("                        <a href=\"#\" class=\"partner\"><img src=\"images/partner-3.png\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm ftco-animate\">\n");
      out.write("                        <a href=\"#\" class=\"partner\"><img src=\"images/partner-4.png\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm ftco-animate\">\n");
      out.write("                        <a href=\"#\" class=\"partner\"><img src=\"images/partner-5.png\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- loader -->\n");
      out.write("        <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"js/aos.js\"></script>\n");
      out.write("        <script src=\"js/jquery.animateNumber.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("        <script src=\"js/scrollax.min.js\"></script>\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("        <script src=\"js/google-map.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("a");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"col-md-6 col-lg-3 ftco-animate\">\n");
          out.write("                            <div class=\"product\">\n");
          out.write("                                <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-prod\">\n");
          out.write("                                    <img class=\"img-fluid\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Colorlib Template\">                         \n");
          out.write("                                    <div class=\"overlay\"></div>\n");
          out.write("                                </a>\n");
          out.write("                                <div class=\"text py-3 pb-4 px-3 text-center\">\n");
          out.write("                                    <h3><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                    <div class=\"d-flex\">\n");
          out.write("                                        <div class=\"pricing\">\n");
          out.write("                                            <p class=\"price\"><span>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></p>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"bottom-area d-flex px-3\">\n");
          out.write("                                        <div class=\"m-auto d-flex\">\n");
          out.write("                                            <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n");
          out.write("                                                <span><i class=\"ion-ios-cart\"></i></span>\n");
          out.write("                                            </a>                       \n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div> \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
