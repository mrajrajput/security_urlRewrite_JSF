package com.rajputLife;

//import javax.faces.webapp.FacesServlet;
//import org.ocpsoft.rewrite.servlet.RewriteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration
//@ComponentScan({"com.auth0.samples.bootfaces"})

@SpringBootApplication
public class Application { //extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public ServletRegistrationBean servletRegistrationBean() {
//		FacesServlet servlet = new FacesServlet();
//		return new ServletRegistrationBean(new FacesServlet(), "*.jsf");
//	}
//
////	@Bean
////	public ServletRegistrationBean servletRegistrationBean() {
////		ServletRegistrationBean servletRegistration = new ServletRegistrationBean(new FacesServlet());
////		servletRegistration.addUrlMappings("*.xhtml");
////		servletRegistration.setLoadOnStartup(1);
////		return servletRegistration;
////	}
//
//	@Bean
//	public FilterRegistrationBean rewriteFilter() {
//		FilterRegistrationBean rwFilter = new FilterRegistrationBean(new RewriteFilter());
//		rwFilter.setDispatcherTypes(EnumSet.of(DispatcherType.FORWARD, DispatcherType.REQUEST,
//				DispatcherType.ASYNC, DispatcherType.ERROR));
//		rwFilter.addUrlPatterns("/*");
//		return rwFilter;
//	}
}
