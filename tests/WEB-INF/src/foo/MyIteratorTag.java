package foo;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class MyIteratorTag extends TagSupport {
	String[] movies = new String[] {"Spiderman", "Saved!", "Amelie"};
	int movieCounter;

	public int doStartTag() throws JspException {
		movieCounter = 0;
		pageContext.setAttribute("movie", movies[movieCounter]);
		movieCounter++;
		return EVAL_BODY_INCLUDE;
	}
	public int doAfterBody() throws JspException {
		if(movieCounter < movies.length) {
			pageContext.setAttribute("movie", movies[movieCounter]);
			movieCounter++;
			return EVAL_BODY_AGAIN;
		} else {
			return SKIP_BODY;
		}
	}
	public int doEndTag() throws JspException{
		return EVAL_PAGE;
	}
}