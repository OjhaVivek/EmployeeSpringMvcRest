package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fname_005fmodelAttribute_005fmethod_005fid_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fname_005fmodelAttribute_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fname_005fmodelAttribute_005fmethod_005fid_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fclass_005fnobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta content=\"en-us\" http-equiv=\"Content-Language\" />\r\n");
      out.write("<meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\" />\r\n");
      out.write("<title>Enter Employee Details&nbsp; Employee</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction closeSelf(formVariable) {\r\n");
      out.write("\t\tvar id = formVariable.employeeId.value;\r\n");
      out.write("\t\tvar name = formVariable.employeeName.value;\r\n");
      out.write("\t\tvar salary = formVariable.salary.value;\r\n");
      out.write("\t\tif (name == null || name == \"\" || salary == null || salary == \"\"\r\n");
      out.write("\t\t\t\t|| salary != parseInt(salary, 10) || salary < 0) {\r\n");
      out.write("\t\t\talert(\"All Values are mandatory. Salary Should be positive integer\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tvar form = document.getElementById('employeeAddForm');\r\n");
      out.write("\t\t\tform.submit();\r\n");
      out.write("\t\t\t//alert(\"Data Updated\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".auto-style1 {\r\n");
      out.write("\tmargin-left: 48px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".auto-style2 {\r\n");
      out.write("\tfont-size: xx-large;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".auto-style3 {\r\n");
      out.write("\tmargin-left: 44px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"myFunction()\">\r\n");
      out.write(" <script>\r\n");
      out.write("\t function myFunction() {\r\n");
      out.write("\t\t\t\tvar id = window.opener.document.getElementById(\"employeeIdTemp\");\r\n");
      out.write("\t\t\t\tvar name = window.opener.document.getElementById(\"employeeNameTemp\");\r\n");
      out.write("\t\t\t\tvar salary = window.opener.document.getElementById(\"salaryTemp\");\r\n");
      out.write("\t\t\t\tvar outputFrm = document.forms['employeeAddForm'];\r\n");
      out.write("\r\n");
      out.write("\t\t\t\toutputFrm.elements['employeeId'].defaultValue = id.value;\r\n");
      out.write("\t\t\t\toutputFrm.elements['employeeName'].defaultValue = name.value;\r\n");
      out.write("\t\t\t\toutputFrm.elements['salary'].defaultValue = salary.value;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\toutputFrm.elements['employeeId'].readOnly = true;\r\n");
      out.write("\r\n");
      out.write(" }\r\n");
      out.write(" </script>\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fname_005fmodelAttribute_005fmethod_005fid_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/view/addEmployee.jsp(64,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("saveEmployee");
    // /WEB-INF/view/addEmployee.jsp(64,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("POST");
    // /WEB-INF/view/addEmployee.jsp(64,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setId("employeeAddForm");
    // /WEB-INF/view/addEmployee.jsp(64,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setName("employeeAddForm");
    // /WEB-INF/view/addEmployee.jsp(64,1) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setModelAttribute("employeeForm");
    // /WEB-INF/view/addEmployee.jsp(64,1) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "style", new String("height: 207px; width: 384px"));
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<label id=\"Label1\"><span class=\"auto-style2\">Enter\r\n");
          out.write("\t\t\t\tEmployee Details</span><br /> <br /> Employee\r\n");
          out.write("\t\t\tId&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("<br /> <br /> Employee Name: </label>\r\n");
          out.write("\t\t");
          if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t<br />\r\n");
          out.write("\t\t<br />\r\n");
          out.write("\t\t<label id=\"Label2\">Employee\r\n");
          out.write("\t\t\tSalary:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t</label>\r\n");
          out.write("\t\t");
          if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t<br />\r\n");
          out.write("\t\t<br />\r\n");
          out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t<input class=\"auto-style3\" name=\"Add\" style=\"width: 91px\"\r\n");
          out.write("\t\t\ttype=\"button\" value=\"Save\"\r\n");
          out.write("\t\t\tonclick=\"closeSelf(document.getElementById('employeeAddForm'));\" />\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fname_005fmodelAttribute_005fmethod_005fid_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/addEmployee.jsp(70,3) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "name", new String("employeeId"));
    // /WEB-INF/view/addEmployee.jsp(70,3) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setId("employeeId");
    // /WEB-INF/view/addEmployee.jsp(70,3) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("employeeId");
    // /WEB-INF/view/addEmployee.jsp(70,3) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "style", new String("width: 182px"));
    // /WEB-INF/view/addEmployee.jsp(70,3) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", new String("text"));
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/addEmployee.jsp(72,2) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "class", new String("auto-style1"));
    // /WEB-INF/view/addEmployee.jsp(72,2) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "name", new String("employeeName"));
    // /WEB-INF/view/addEmployee.jsp(72,2) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setId("employeeName");
    // /WEB-INF/view/addEmployee.jsp(72,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("employeeName");
    // /WEB-INF/view/addEmployee.jsp(72,2) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "style", new String("width: 182px"));
    // /WEB-INF/view/addEmployee.jsp(72,2) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "type", new String("text"));
    int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
      if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/addEmployee.jsp(79,2) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "name", new String("salary"));
    // /WEB-INF/view/addEmployee.jsp(79,2) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setId("salary");
    // /WEB-INF/view/addEmployee.jsp(79,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setPath("salary");
    // /WEB-INF/view/addEmployee.jsp(79,2) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "style", new String("width: 182px"));
    // /WEB-INF/view/addEmployee.jsp(79,2) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "type", new String("text"));
    int[] _jspx_push_body_count_form_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f2 = _jspx_th_form_005finput_005f2.doStartTag();
      if (_jspx_th_form_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fname_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }
}
