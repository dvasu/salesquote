package org.apache.jsp.WEB_002dINF.views.salesorders;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/tags/form/create.tagx");
    _jspx_dependants.add("/WEB-INF/tags/util/panel.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/select.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/reference.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/input.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/dependency.tagx");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<div version=\"2.0\">");
      if (_jspx_meth_form_005fcreate_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_form_005fdependency_005f0(_jspx_page_context))
        return;
      out.write("</div>");
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

  private boolean _jspx_meth_form_005fcreate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:create
    org.apache.jsp.tag.web.form.create_tagx _jspx_th_form_005fcreate_005f0 = new org.apache.jsp.tag.web.form.create_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_form_005fcreate_005f0);
    _jspx_th_form_005fcreate_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/salesorders/create.jspx(5,181) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_form_005fcreate_005f0.setZ("Vc8koviZZgXrAi/m+2kLvZkEL2M=");
    // /WEB-INF/views/salesorders/create.jspx(5,181) name = render type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_form_005fcreate_005f0.setRender((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty dependencies}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/salesorders/create.jspx(5,181) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_form_005fcreate_005f0.setPath("/salesorders");
    // /WEB-INF/views/salesorders/create.jspx(5,181) name = modelAttribute type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_form_005fcreate_005f0.setModelAttribute("salesOrder");
    // /WEB-INF/views/salesorders/create.jspx(5,181) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_form_005fcreate_005f0.setId("fc_com_ingenuity_salesquote_domain_SalesOrder");
    _jspx_th_form_005fcreate_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_form_005fcreate_005f0, null));
    _jspx_th_form_005fcreate_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_form_005fcreate_005f0);
    return false;
  }

  private boolean _jspx_meth_field_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:select
    org.apache.jsp.tag.web.form.fields.select_tagx _jspx_th_field_005fselect_005f0 = new org.apache.jsp.tag.web.form.fields.select_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_field_005fselect_005f0);
    _jspx_th_field_005fselect_005f0.setJspContext(_jspx_page_context);
    _jspx_th_field_005fselect_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/salesorders/create.jspx(6,167) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fselect_005f0.setZ("ttOzBykTHB1hjGBYjqh/h100w7k=");
    // /WEB-INF/views/salesorders/create.jspx(6,167) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fselect_005f0.setPath("/skus");
    // /WEB-INF/views/salesorders/create.jspx(6,167) name = items type = java.util.Collection reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fselect_005f0.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skus}", java.util.Collection.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/salesorders/create.jspx(6,167) name = itemValue type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fselect_005f0.setItemValue("id");
    // /WEB-INF/views/salesorders/create.jspx(6,167) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fselect_005f0.setId("c_com_ingenuity_salesquote_domain_SalesOrder_sku");
    // /WEB-INF/views/salesorders/create.jspx(6,167) name = field type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fselect_005f0.setField("sku");
    _jspx_th_field_005fselect_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_field_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_field_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:input
    org.apache.jsp.tag.web.form.fields.input_tagx _jspx_th_field_005finput_005f0 = new org.apache.jsp.tag.web.form.fields.input_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_field_005finput_005f0);
    _jspx_th_field_005finput_005f0.setJspContext(_jspx_page_context);
    _jspx_th_field_005finput_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/salesorders/create.jspx(7,130) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005finput_005f0.setZ("WwJOl7Fhl+o9KcFmrNedhJiW2C8=");
    // /WEB-INF/views/salesorders/create.jspx(7,130) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005finput_005f0.setId("c_com_ingenuity_salesquote_domain_SalesOrder_quanity");
    // /WEB-INF/views/salesorders/create.jspx(7,130) name = field type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005finput_005f0.setField("quanity");
    _jspx_th_field_005finput_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_field_005finput_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005fdependency_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:dependency
    org.apache.jsp.tag.web.form.dependency_tagx _jspx_th_form_005fdependency_005f0 = new org.apache.jsp.tag.web.form.dependency_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_form_005fdependency_005f0);
    _jspx_th_form_005fdependency_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/salesorders/create.jspx(9,172) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_form_005fdependency_005f0.setZ("5MgZORyZvymyHHtqVBCCwPpCnGI=");
    // /WEB-INF/views/salesorders/create.jspx(9,172) name = render type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_form_005fdependency_005f0.setRender((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty dependencies}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/salesorders/create.jspx(9,172) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_form_005fdependency_005f0.setId("d_com_ingenuity_salesquote_domain_SalesOrder");
    // /WEB-INF/views/salesorders/create.jspx(9,172) name = dependencies type = java.util.Collection reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_form_005fdependency_005f0.setDependencies((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dependencies}", java.util.Collection.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_form_005fdependency_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_form_005fdependency_005f0);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_field_005fselect_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_005finput_005f0(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
