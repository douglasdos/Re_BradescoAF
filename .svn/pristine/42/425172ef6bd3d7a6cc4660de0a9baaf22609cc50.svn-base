package br.com.plusoft.csi.espec.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.xml.DOMConfigurator;

import br.com.plusoft.fw.log.Log;

public class FilterEspec implements javax.servlet.Filter {

	private FilterConfig filterConfig = null ;

	static {
		if(System.getProperty("plusoft.afinidade.log4j") != null && !System.getProperty("plusoft.afinidade.log4j").trim().equals("")) {
			DOMConfigurator.configureAndWatch(System.getProperty("plusoft.espec.log4j"), 600000);
			Log.log(FilterEspec.class, Log.INFOPLUS, "-Log4J Configurado! : " + System.getProperty("plusoft.afinidade.log4j"));
		}
	}

	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain) throws IOException, ServletException {
		filterchain.doFilter(servletrequest, servletresponse);
	}

	public void init(FilterConfig filterconfig) {
		this.filterConfig = filterconfig;
	}

	public void destroy() {
		this.filterConfig = null;
	}
}