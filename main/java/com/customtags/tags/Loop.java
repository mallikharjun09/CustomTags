package com.customtags.tags;

import java.io.IOException;

import jakarta.servlet.jsp.JspContext;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class Loop extends SimpleTagSupport{
	int max,min=0,step=1;
	String msg,color="black";
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void doTag() throws IOException {
		JspWriter out = this.getJspContext().getOut();
		if(msg.equals("nums")) {
			for(int i=min;i<max;i=i+step) {
				   out.println("<font color='"+color+"'>"+i+" </font><br/>");
		    }	
		}
		else {
		  for(int i=min;i<max;i=i+step) {
		     out.println("<font color='"+color+"'>"+msg+" </font><br/>");
		  }
		}
	}
}
