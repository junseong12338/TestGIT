/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-02-29 08:35:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editor_005ftest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1706859636881L));
    _jspx_dependants.put("jar:file:/C:/Users/admin/Desktop/EF_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Game_Donation_Board/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/admin/Desktop/EF_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Game_Donation_Board/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <title>Insert title here</title>\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- 부트스트랩 3.4.1 -->\r\n");
      out.write("    <!-- Latest compiled and minified CSS -->\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional theme -->\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js\"\r\n");
      out.write("      integrity=\"sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js\"></script>\r\n");
      out.write("    <script src=\" https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.18/lang/summernote-ko-KR.min.js\"></script>\r\n");
      out.write("    <script src=\"../../../resources/js/summernote-lite.js\"></script>\r\n");
      out.write("    <script src=\"../../../resources/js/summernote-ko-KR.js\"></script>\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../../resources/css/summernote-lite.css\" />\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("      $(document).ready(function () {\r\n");
      out.write("        // 썸머노트 설정\r\n");
      out.write("        var setting = {};\r\n");
      out.write("\r\n");
      out.write("        $(\"#summernote\").summernote({\r\n");
      out.write("          height: 700, // 에디터 높이\r\n");
      out.write("          minHeight: null, // 최소 높이\r\n");
      out.write("          maxHeight: null, // 최대 높이\r\n");
      out.write("          focus: true, // 에디터 로딩후 포커스를 맞출지 여부\r\n");
      out.write("          lang: \"ko-KR\", // 한글 설정\r\n");
      out.write("          placeholder: \"최대 2048자까지 쓸 수 있습니다\", //placeholder 설정\r\n");
      out.write("          //콜백함수\r\n");
      out.write("          callbacks: {\r\n");
      out.write("            onImageUpload: function (files, editor, welEditable) {\r\n");
      out.write("              //파일 다중 업로드\r\n");
      out.write("              for (var i = files.length - 1; i >= 0; i--) {\r\n");
      out.write("                uploadSummernoteImageFile(files[i], this);\r\n");
      out.write("              }\r\n");
      out.write("            },\r\n");
      out.write("\r\n");
      out.write("            onMediaDelete: function ($target, editor, $editable) {\r\n");
      out.write("              var deletedImageUrl = $target.attr(\"src\").split(\"/\").pop();\r\n");
      out.write("              deleteSummernoteImageFile(deletedImageUrl);\r\n");
      out.write("            },\r\n");
      out.write("          },\r\n");
      out.write("        });\r\n");
      out.write("        // 이미지,파일 업로드 함수\r\n");
      out.write("        function uploadSummernoteImageFile(file, el) {\r\n");
      out.write("          data = new FormData();\r\n");
      out.write("          data.append(\"file\", file);\r\n");
      out.write("\r\n");
      out.write("          $.ajax({\r\n");
      out.write("            data: data,\r\n");
      out.write("            type: \"POST\",\r\n");
      out.write("            url: \"uploadSummernoteImageFile\",\r\n");
      out.write("            contentType: false,\r\n");
      out.write("            enctype: \"multipart/form-data\",\r\n");
      out.write("            processData: false,\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("              console.log(data.url);\r\n");
      out.write("              $(el).summernote(\"editor.insertImage\", data.url);\r\n");
      out.write("            },\r\n");
      out.write("          });\r\n");
      out.write("        }\r\n");
      out.write("        // 이미지,파일 삭제 함수\r\n");
      out.write("        function deleteSummernoteImageFile(imageName) {\r\n");
      out.write("          data = new FormData();\r\n");
      out.write("          data.append(\"file\", imageName);\r\n");
      out.write("          $.ajax({\r\n");
      out.write("            data: data,\r\n");
      out.write("            type: \"POST\",\r\n");
      out.write("            url: \"deleteSummernoteImageFile\",\r\n");
      out.write("            contentType: false,\r\n");
      out.write("            enctype: \"multipart/form-data\",\r\n");
      out.write("            processData: false,\r\n");
      out.write("          });\r\n");
      out.write("        }\r\n");
      out.write("      });\r\n");
      out.write("      //작성완료 함수\r\n");
      out.write("      function send(f) {\r\n");
      out.write("        let content = f.editordata.value;\r\n");
      out.write("\r\n");
      out.write("        if (content == \"\") {\r\n");
      out.write("          alert(\"내용을 입력해주세요\");\r\n");
      out.write("          return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        f.action = \"summernote_send\";\r\n");
      out.write("        f.submit();\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <form method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("      <textarea id=\"summernote\" name=\"editordata\"></textarea>\r\n");
      out.write("      <input type=\"button\" value=\"작성 완료\" onclick=\"send(this.form)\" />\r\n");
      out.write("    </form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
