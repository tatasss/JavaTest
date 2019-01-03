package fr.tempConverter.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ClickCounterFilter implements Filter{

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("ClickCounterFilter - doFilter");
		ServletContext sc = arg0.getServletContext();
		int counter = (int) sc.getAttribute("counter");
		counter++;
		sc.setAttribute("counter", counter);
		System.out.println("Counter :" +sc.getAttribute("counter"));
		arg2.doFilter(arg0, arg1);
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		int counter=0;
		ServletContext sc = filterConfig.getServletContext();
		sc.setAttribute("counter", counter);
		Filter.super.init(filterConfig);
	}
	

}
