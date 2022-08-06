package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css/index.css");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>All PC - PC cho mọi người</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" \n");
      out.write("        integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            ");
      out.write("body{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write(".dautrang{\r\n");
      out.write("\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    background-color:coral; \r\n");
      out.write("}\r\n");
      out.write(".logo{\r\n");
      out.write("    width: 15%;\r\n");
      out.write("}\r\n");
      out.write(".phai{\r\n");
      out.write("    width: 85%;\r\n");
      out.write("}\r\n");
      out.write(".search{\r\n");
      out.write("    display: flex;           \r\n");
      out.write("    margin-left: 10%;\r\n");
      out.write("    margin-right: 20%;\r\n");
      out.write("    margin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write(".logout{\r\n");
      out.write("    float: right;\r\n");
      out.write("    margin-right: 3%;\r\n");
      out.write("}\r\n");
      out.write("#main-menu{\r\n");
      out.write("    display:flex ;\r\n");
      out.write("    list-style: none;\r\n");
      out.write("}\r\n");
      out.write("#main-menu li{\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("#main-menu li a{\r\n");
      out.write("    color: blue;\r\n");
      out.write("    display: block;\r\n");
      out.write("    padding: 0px 20px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("#main-menu li:hover>a{\r\n");
      out.write("    color: buttontext;\r\n");
      out.write("}\r\n");
      out.write("#main-menu li ul.sub-menu{\r\n");
      out.write("    display: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    background: coral;\r\n");
      out.write("    padding: 0px 0px;\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    width: 200px;\r\n");
      out.write("}\r\n");
      out.write("#main-menu li:hover ul.sub-menu{\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("#main-menu li ul.sub-menu a{\r\n");
      out.write("    color: cornflowerblue;\r\n");
      out.write("}\r\n");
      out.write("#main-menu ul.sub-menu li:hover>a{\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write(".logout a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write(".giohang{\r\n");
      out.write("    margin-left: 40%;\r\n");
      out.write("}\r\n");
      out.write(".giohang img{\r\n");
      out.write("    width: 20%;\r\n");
      out.write("}\r\n");
      out.write(".logo img{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write(".manu{\r\n");
      out.write("\r\n");
      out.write("    height: auto;\r\n");
      out.write("    margin-top: 23px;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write(".giohang a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".manu a{\r\n");
      out.write("   text-decoration: none;\r\n");
      out.write("\r\n");
      out.write("    margin-left: 40px;\r\n");
      out.write("    margin-right: 40px;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write(".product{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    border-radius: 6px ;\r\n");
      out.write("    box-shadow:0px 0px 10px black;\r\n");
      out.write("    max-width: 90%;\r\n");
      out.write("    margin: 20px 20px;\r\n");
      out.write("\r\n");
      out.write("    height: 480px;\r\n");
      out.write("}\r\n");
      out.write(".product img{\r\n");
      out.write("    width: 90%;\r\n");
      out.write("    margin-left: 2%;\r\n");
      out.write("    margin-right: 2%;\r\n");
      out.write("}\r\n");
      out.write(".product p{\r\n");
      out.write("    color: chocolate;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("}\r\n");
      out.write(".upd{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    margin-left: 5%;\r\n");
      out.write("    margin-right: 5%;\r\n");
      out.write("}\r\n");
      out.write(".product a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".abc{\r\n");
      out.write("    font-size: 22px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".thea{\r\n");
      out.write("    height: 350px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".thea a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ab{\r\n");
      out.write("    width: 80px;\r\n");
      out.write("    margin:auto;\r\n");
      out.write("    background-color: darkgoldenrod;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write(".info{\r\n");
      out.write("    margin-left: 3%;\r\n");
      out.write("}\r\n");
      out.write(".infohead{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write(".info p4{\r\n");
      out.write("    width: 47%;\r\n");
      out.write("}\r\n");
      out.write(".infohead img{\r\n");
      out.write("\r\n");
      out.write("    width: 45%;\r\n");
      out.write("}\r\n");
      out.write(".info p3{\r\n");
      out.write("    padding-top: 100px;\r\n");
      out.write("    width: 52%;\r\n");
      out.write("    text-align: center;\r\n");
      out.write(" \r\n");
      out.write("    font-size: 25px;\r\n");
      out.write("    color: blue;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".info p{\r\n");
      out.write("    margin-top: 30px;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    font-size: 25px;\r\n");
      out.write("    color: red;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".infoc{\r\n");
      out.write("    clear: both;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("    padding-top: 50px;\r\n");
      out.write("}\r\n");
      out.write(".infoc a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".info p6{\r\n");
      out.write("    font-size: 25px;\r\n");
      out.write("    color: red;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".info p1{\r\n");
      out.write("    padding-top: 5px;\r\n");
      out.write("    margin-bottom: 25px;\r\n");
      out.write("    float:left;\r\n");
      out.write("    width: 12%;\r\n");
      out.write("    color: red;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".info p2{\r\n");
      out.write("    padding-top: 5px;\r\n");
      out.write("    padding-bottom: 5px;\r\n");
      out.write("    padding-left: 20px;\r\n");
      out.write("    margin-right: 5%;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    float: right;\r\n");
      out.write("    width: 83%;\r\n");
      out.write("    box-shadow:0px 0px 10px #92999f;\r\n");
      out.write("    border-radius: 30px;\r\n");
      out.write("}\r\n");
      out.write(".newa{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write(".newp p1{\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    color: red;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".newp p2{\r\n");
      out.write("    padding-top: 5px;\r\n");
      out.write("    padding-bottom: 5px;\r\n");
      out.write("    padding-left: 20px;\r\n");
      out.write("    margin-right: 5%;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    float: right;\r\n");
      out.write("    width: 78%;\r\n");
      out.write("    box-shadow:0px 0px 10px #92999f;\r\n");
      out.write("    border-radius: 30px;\r\n");
      out.write("}\r\n");
      out.write(".newp input{\r\n");
      out.write("    width: 97%;\r\n");
      out.write("}\r\n");
      out.write(".news{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".news input{\r\n");
      out.write("    width: 8%;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            table{\r\n");
      out.write("                border-collapse: collapse\r\n");
      out.write("            }\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("            .content{\r\n");
      out.write("                margin: auto;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                float: left;\r\n");
      out.write("                padding-left: 30px;\r\n");
      out.write("                height: auto;\r\n");
      out.write("                background-color: white;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination {\r\n");
      out.write("                 display: inline-block;\r\n");
      out.write("              }\r\n");
      out.write("             .pagination a {\r\n");
      out.write("                color: black;\r\n");
      out.write("                font-size: 22px;\r\n");
      out.write("                float: left;\r\n");
      out.write("                padding: 8px 16px;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("              }\r\n");
      out.write("            .pagination a.active {\r\n");
      out.write("                background-color: #4CAF50;\r\n");
      out.write("                color: white;\r\n");
      out.write("              }\r\n");
      out.write("            .pagination a:hover:not(.active) {\r\n");
      out.write("                background-color: chocolate;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("  font-family: Open Sans;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("section {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  background: #333;\r\n");
      out.write("  height: 50vh;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  font-size: 22px;\r\n");
      out.write("  font-weight: 700;\r\n");
      out.write("  text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed{\r\n");
      out.write("\tbackground: #666;\r\n");
      out.write("\tbox-shadow: 0 1px 1px 0 rgba(0, 0, 0, 0.12);\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tfont: bold 16px sans-serif;\r\n");
      out.write("\tpadding: 55px 50px;\r\n");
      out.write("        margin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-left,\r\n");
      out.write(".footer-distributed .footer-center,\r\n");
      out.write(".footer-distributed .footer-right{\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Footer left */\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-left{\r\n");
      out.write("\twidth: 40%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The company logo */\r\n");
      out.write("\r\n");
      out.write(".footer-distributed h3{\r\n");
      out.write("\tcolor:  #ffffff;\r\n");
      out.write("\tfont: normal 36px 'Open Sans', cursive;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed h3 span{\r\n");
      out.write("\tcolor:  lightseagreen;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Footer links */\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-links{\r\n");
      out.write("\tcolor:  #ffffff;\r\n");
      out.write("\tmargin: 20px 0 12px;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-links a{\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("\tline-height: 1.8;\r\n");
      out.write("  font-weight:400;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor:  inherit;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-company-name{\r\n");
      out.write("\tcolor:  #222;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Footer Center */\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-center{\r\n");
      out.write("\twidth: 35%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-center i{\r\n");
      out.write("\tbackground-color:  #33383b;\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("\twidth: 38px;\r\n");
      out.write("\theight: 38px;\r\n");
      out.write("\tborder-radius: 50%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tline-height: 42px;\r\n");
      out.write("\tmargin: 10px 15px;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-center i.fa-envelope{\r\n");
      out.write("\tfont-size: 17px;\r\n");
      out.write("\tline-height: 38px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-center p{\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("  font-weight:400;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-center p span{\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tfont-size:14px;\r\n");
      out.write("\tline-height:2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-center p a{\r\n");
      out.write("\tcolor:  lightseagreen;\r\n");
      out.write("\ttext-decoration: none;;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-links a:before {\r\n");
      out.write("  content: \"|\";\r\n");
      out.write("  font-weight:300;\r\n");
      out.write("  font-size: 20px;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  padding-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-links .link-1:before {\r\n");
      out.write("  content: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Footer Right */\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-right{\r\n");
      out.write("\twidth: 20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-company-about{\r\n");
      out.write("\tline-height: 20px;\r\n");
      out.write("\tcolor:  #92999f;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-company-about span{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor:  #ffffff;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-icons{\r\n");
      out.write("\tmargin-top: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-distributed .footer-icons a{\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 35px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tbackground-color:  #33383b;\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tline-height: 35px;\r\n");
      out.write("\r\n");
      out.write("\tmargin-right: 3px;\r\n");
      out.write("\tmargin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* If you don't want the footer to be responsive, remove these media queries */\r\n");
      out.write("\r\n");
      out.write("@media (max-width: 880px) {\r\n");
      out.write("\r\n");
      out.write("\t.footer-distributed{\r\n");
      out.write("\t\tfont: bold 14px sans-serif;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.footer-distributed .footer-left,\r\n");
      out.write("\t.footer-distributed .footer-center,\r\n");
      out.write("\t.footer-distributed .footer-right{\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\tmargin-bottom: 40px;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.footer-distributed .footer-center i{\r\n");
      out.write("\t\tmargin-left: 0;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".footer-center img{\r\n");
      out.write("    width: 50px;\r\n");
      out.write("}\r\n");
      out.write(".footer-icons img{\r\n");
      out.write("    width: 30px;\r\n");
      out.write("}");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"dautrang\">\n");
      out.write("        \n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <a href=\"home\"><img src=\"images/logo1.jpg\"></a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"phai\">\n");
      out.write("            <div class=\"logout\">\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        <div class=\"search\">\n");
      out.write("            <div>\n");
      out.write("            <form action=\"search\" method=\"get\">\n");
      out.write("                <input type=\"text\" placeholder=\"Search in system\" name=\"key\">\n");
      out.write("                <button onclick=\"this.form.submit()\">Search</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div class=\"giohang\">\n");
      out.write("            <a href=\"show\" ><img src=\"images/giohang.png\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div id=\"mySidebar\" class=\"manu\">\n");
      out.write("            <a href=\"home\">Home</a>\n");
      out.write("            <a href=\"#\">About</a>\n");
      out.write("            <a href=\"home?id=2\">LapTop</a>\n");
      out.write("            <a href=\"home?id=1\">PC</a>\n");
      out.write("            <a href=\"home?id=3\">Linh kiện</a>\n");
      out.write("            <a href=\"home?id=4\">Gaming Gear</a>\n");
      out.write("            <a href=\"home?id=5\">Phụ kiện</a>\n");
      out.write("            <a href=\"#\">Contact</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("        \n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"pagination\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div></br>\n");
      out.write("            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("            function doDelete(id) {\n");
      out.write("                if (confirm(\"Are you sure to delete product with id='\" + id + \"'?\")) {\n");
      out.write("                    window.location = \"delete?id=\" + id;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("          <footer class=\"footer-distributed\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer-left\">\n");
      out.write("\n");
      out.write("\t\t\t\t<h3>Company<span>logo</span></h3>\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"footer-links\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"link-1\">Home</a>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"#\">Blog</a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"#\">Pricing</a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"#\">About</a>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"#\">Faq</a>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"#\">Contact</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"footer-company-name\">Company Name © 2015</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer-center\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-map-marker\"><img src=\"images/diachi.png\"></i>\n");
      out.write("\t\t\t\t\t<p><span>444 S. Cedros Ave</span> Solana Beach, California</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-phone\"><img src=\"images/dienthoai.png\"></i>\n");
      out.write("\t\t\t\t\t<p>+1.555.555.5555</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-envelope\"><img src=\"images/mail.png\"></i>\n");
      out.write("\t\t\t\t\t<p><a href=\"mailto:Daoall@gmail.com\">Daoall@gmail.com</a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer-right\">\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"footer-company-about\">\n");
      out.write("\t\t\t\t\t<span>PC cho mọi nhà</span>\n");
      out.write("\t\t\t\t\tLorem ipsum dolor sit amet, consectateur adispicing elit. Fusce euismod convallis velit, eu auctor lacus vehicula sit amet.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"footer-icons\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"https://www.facebook.com/daoon.dz/\"><i class=\"fa fa-facebook\"><img src=\"images/face.png\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"><img src=\"images/twiter.png\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-linkedin\"><img src=\"images/in.png\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-github\"><img src=\"images/meo.png\"></i></a>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</footer>\n");
      out.write("\n");
      out.write("          <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" \n");
      out.write("          integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("          <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" \n");
      out.write("          integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("          <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" \n");
      out.write("          integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <ul id=\"main-menu\">\n");
        out.write("                        <li><a href=\"login.jsp\"> Login</a></li>\n");
        out.write("                        <li><a href=\"register.jsp\" > Register</a></li>\n");
        out.write("                    </ul>\n");
        out.write("                ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <ul id=\"main-menu\">                   \n");
        out.write("                        <li><a href=\"\"> Profile</a>\n");
        out.write("                            <ul class=\"sub-menu\">\n");
        out.write("                                <li><a href=\"profile\">Edit Profile</a></li>\n");
        out.write("                                <li><a href=\"changepass\">Change password</a></li>\n");
        out.write("                                ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </ul>\n");
        out.write("                        </li>\n");
        out.write("                        <li><a href=\"logout\" > Logout</a></li>\n");
        out.write("                    </ul>\n");
        out.write("                ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.use==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><a href=\"thongke\">Thống kê</a></li>\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("k");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.key}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("page");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.page}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setBegin(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.num}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <a class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i==page?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"home?page=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                ");
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
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_0);
    }
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.use==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <a href=\"new.jsp\">Add new</a></br>\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("p");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \n");
          out.write("                            \n");
          out.write("                            <div class=\"col-12 col-md-6 col-lg-3\">\n");
          out.write("                            <div class=\"product\">\n");
          out.write("                                <div class=\"thea\">\n");
          out.write("                                    <a href=\"infomation?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&catID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></a></br>\n");
          out.write("                                    <a href=\"infomation?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&catID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></br>\n");
          out.write("                                </div>\n");
          out.write("                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" đ</p></br>\n");
          out.write("                                ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                <a href=\"infomation?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&catID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"ab\">Buy Now</a>  \n");
          out.write("                            </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.use==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"upd\">\n");
        out.write("                                    <a href=\"#\" onclick=\"doDelete(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(")\">Delete</a>\n");
        out.write("                                    <a href=\"update?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Update</a>\n");
        out.write("                                </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }
}
