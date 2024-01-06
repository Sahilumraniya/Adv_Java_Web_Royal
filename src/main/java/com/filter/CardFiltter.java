package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/CardServlet")
public class CardFiltter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		Boolean error = false;
		String aError,bError;
		String regx = "[0-9]+";
		
		//validation
		if(a.trim()=="") {
			error = true;
			aError= "A is Required";
			request.setAttribute("aError", aError);
		}else if(!a.trim().matches(regx)) {
			error = true;
			aError= "A must be number";
			request.setAttribute("aError", aError);
		}
		
		if(b.trim()=="") {
			error = true;
			bError= "B is Required";
			request.setAttribute("bError", bError);
		}else if(!b.trim().matches(regx)) {
			error = true;
			bError= "B must be number";
			request.setAttribute("bError", bError);
		}
		RequestDispatcher rd;
		if(error) {
			System.out.println("Error");
			rd = request.getRequestDispatcher("InputCard.jsp");
			rd.forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
