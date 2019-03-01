package foo;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class Classic2 extends TagSupport {
	JspWriter out;

	public int doStartTag() throws JspException {
		out = pageContext.getOut();
		try {
			out.println("in doStartTag()");
		} catch (IOException ex) {
			throw new JspException("IOException- " + ex.toString());
		}
		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		try {
			out.println("in doEndTag()");
		} catch (IOException ex) {
			throw new JspException("IOException- " + ex.toString());
		}
		return EVAL_PAGE;

	}
}