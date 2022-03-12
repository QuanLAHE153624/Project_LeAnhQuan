package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"goto-here\">\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"ftco-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">                   \n");
      out.write("\n");
      out.write("                    <div class=\"main\">\n");
      out.write("                        <div class=\"grid wide\">\n");
      out.write("                            <div class=\"productInfo\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-lg-6 mb-5 ftco-animate\">\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"image-popup\">\n");
      out.write("                                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-fluid\" alt=\"Colorlib Template\"></a>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-lg-6 product-details pl-md-5 ftco-animate\">\n");
      out.write("                                        <h3 style=\"color: #88ac44;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                                        <div class=\"rating d-flex\">\n");
      out.write("                                            <p class=\"text-left mr-4\">\n");
      out.write("                                                <a href=\"#\" class=\"mr-2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <span style=\"color: #bbb;\">Available</span></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </p>\n");
      out.write("                                            <p class=\"text-left mr-4\">\n");
      out.write("                                                <a href=\"#\" class=\"mr-2\" style=\"color: #88ac44;\">100 <span style=\"color: #bbb;\">Rating</span></a>\n");
      out.write("                                            </p>\n");
      out.write("                                            <p class=\"text-left\">\n");
      out.write("                                                <a href=\"#\" class=\"mr-2\" style=\"color: #88ac44;\">500 <span style=\"color: #bbb;\">Sold</span></a>\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"price\"><span>$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></p>\n");
      out.write("                                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                                        <form name=\"f\" action=\"addtocart\"  method=\"post\">\n");
      out.write("                                            <input type=\"hidden\" name=\"id\" value=\"\">\n");
      out.write("                                            <div class=\"row mt-4\">\n");
      out.write("\n");
      out.write("                                                <div class=\"w-100\"></div>\n");
      out.write("                                                <div class=\"input-group col-md-6 d-flex mb-3\">\n");
      out.write("                                                    <span class=\"input-group-btn mr-2\">\n");
      out.write("                                                        <button type=\"button\" class=\"quantity-left-minus btn\"  data-type=\"minus\" data-field=\"\" \n");
      out.write("                                                                onClick=\"var result = document.getElementById('quantity');\n");
      out.write("                                                                        var quantity = result.value;\n");
      out.write("                                                                        if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" >= quantity && quantity > 0) {\n");
      out.write("                                                                            result.value--;\n");
      out.write("                                                                            return false;\n");
      out.write("\n");
      out.write("                                                                        }\">\n");
      out.write("                                                            <i class=\"ion-ios-remove\"></i>\n");
      out.write("                                                        </button>\n");
      out.write("                                                    </span>\n");
      out.write("\n");
      out.write("                                                    <input type=\"text\" id=\"quantity\" name=\"num\" class=\"form-control input-number\" value=\"1\"  >\n");
      out.write("\n");
      out.write("                                                    <span class=\"input-group-btn ml-2\">\n");
      out.write("                                                        <button type=\"button\" class=\"quantity-right-plus btn\"  data-type=\"plus\"\n");
      out.write("                                                                data-field=\"\" onClick=\"\n");
      out.write("                                                                   var result = document.getElementById('quantity');\n");
      out.write("                                                                        var quantity = result.value;\n");
      out.write("                                                                        if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" > quantity) {\n");
      out.write("                                                                            result.value++;\n");
      out.write("                                                                            return false;\n");
      out.write("\n");
      out.write("                                                                        }\">\n");
      out.write("                                                            <i class=\"ion-ios-add\"></i>\n");
      out.write("                                                        </button>\n");
      out.write("                                                    </span>\n");
      out.write("                                                </div> \n");
      out.write("\n");
      out.write("                                                <div class=\"w-100\"></div>\n");
      out.write("                                                <div class=\"col-md-12\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                </section>\n");
      out.write("\n");
      out.write("                                <section class=\"ftco-section\">\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <div class=\"row justify-content-center mb-3 pb-3\">\n");
      out.write("                                            <div class=\"col-md-12 heading-section text-center ftco-animate\">\n");
      out.write("                                                <span class=\"subheading\">Products</span>\n");
      out.write("                                                <h2 class=\"mb-4\">Related Products</h2>\n");
      out.write("                                                <p>Far far away, behind the word mountains, far from the countries Chinese</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>   \t\t\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- loader -->\n");
      out.write("                            <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <script src=\"js/jquery.min.js\"></script>\n");
      out.write("                            <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("                            <script src=\"js/popper.min.js\"></script>\n");
      out.write("                            <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("                            <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("                            <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("                            <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("                            <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("                            <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("                            <script src=\"js/aos.js\"></script>\n");
      out.write("                            <script src=\"js/jquery.animateNumber.min.js\"></script>\n");
      out.write("                            <script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("                            <script src=\"js/scrollax.min.js\"></script>\n");
      out.write("                            <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("                            <script src=\"js/google-map.js\"></script>\n");
      out.write("                            <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                                                    function buy(id) {\n");
      out.write("                                                                        var m = document.f.num.value;\n");
      out.write("                                                                        document.f.action = \"addtocart?pid=\" + id;\n");
      out.write("                                                                        document.f.submit();\n");
      out.write("\n");
      out.write("                                                                    }\n");
      out.write("\n");
      out.write("                            </script>\n");
      out.write("\n");
      out.write("                            </body>\n");
      out.write("                            </html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.quantity <= 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<p style=\"color: #88ac44;\">UnAvailable</p>");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.quantity > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<p style=\"color: #88ac44;\">Available</p>");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.quantity <= 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a href=\"home\" class=\"btn btn-black py-3 px-5\" >Add to Cart</a>");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.quantity > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<input  class=\"btn btn-black py-3 px-5\" type=\"submit\" onclick=\"buy('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("')\" value=\"Add to Cart\"/>");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
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
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"col-md-6 col-lg-3 ftco-animate\">\n");
          out.write("                                                <div class=\"product\">\n");
          out.write("\n");
          out.write("                                                    <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-prod\">\n");
          out.write("                                                        <img class=\"img-fluid\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Colorlib Template\">                         \n");
          out.write("                                                        <div class=\"overlay\"></div>\n");
          out.write("                                                    </a>\n");
          out.write("                                                    <div class=\"text py-3 pb-4 px-3 text-center\">\n");
          out.write("                                                        <h3><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                        <div class=\"d-flex\">\n");
          out.write("                                                            <div class=\"pricing\">\n");
          out.write("                                                                <p class=\"price\"><span>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></p>\n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("\n");
          out.write("                                                        <div class=\"bottom-area d-flex px-3\">\n");
          out.write("                                                            <div class=\"m-auto d-flex\">                                \n");
          out.write("                                                                <a onclick=\"buy('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\"  class=\"add-to-cart d-flex justify-content-center align-items-center text-center\">\n");
          out.write("                                                                    <span><i class=\"ion-ios-cart\"></i></span>\n");
          out.write("                                                                </a>                       \n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div> \n");
          out.write("\n");
          out.write("                                        ");
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
