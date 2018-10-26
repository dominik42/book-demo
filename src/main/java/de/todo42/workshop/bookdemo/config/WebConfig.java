package de.todo42.workshop.bookdemo.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
	
//	@Bean
//    ServletRegistrationBean h2servletRegistration(){
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new org.h2.server.web.WebServlet(), "/h2-console");
//        registrationBean.addUrlMappings("/console/*");
//        return registrationBean;
//    }
	
	
}
