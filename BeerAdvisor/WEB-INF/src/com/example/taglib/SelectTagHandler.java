package com.example.taglib;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class SelectTagHandler extends SimpleTagSupport {
	private List optionList;
	public void setOptionList(List value) {
		this.optionList = value;
	}

	private String name;
	public void setName(String value) {
		this.name = value;
	}

	private String size;
	public void setSize(String value) {
		this.size = value;
	}

	public void doTag() throws JspException, IOException {
		PageContext pageContext = (PageContext) getJspContext();
		JspWriter out = pageContext.getOut();

		// 시작 : HTML <select> 태그와 HTML에 있는 속성
		out.print("<select ");
		out.print(String.format(ATTR_TEMPLATE, "name", this.name));
		out.print(String.format(ATTR_TEMPLATE, "size", this.size));
		out.println('>');

		// optionList로 <option> 태그를 생성하는 부분
		for( Object option : this.optionList ){
			String optionTag = String.format(OPTION_TEMPLATE, option.toString());
			out.println(optionTag);
		}

		// 끝 : HTML </select> 태그
		out.print(" </select>");
	}	// 끝 : doTag() 메소드

	private static final String ATTR_TEMPLATE = "%s='%s' ";
	private static final String OPTION_TEMPLATE = "<option value='%1$s'> %1$s </option>";
}		// 끝 : SelectTagHandler