package de.todo42.workshop.bookdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.authorizeRequests().antMatchers("/**").permitAll().and()
        			.authorizeRequests().antMatchers("/h2/**").permitAll();
        			
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                    .password("password")
                    .roles("USER")
            .and()
                .withUser("manager")
                    .password("password")
                    .credentialsExpired(true)
                    .accountExpired(true)
                    .accountLocked(true)
                    .authorities("WRITE_PRIVILEGES", "READ_PRIVILEGES")
                    .roles("MANAGER");
    }
    
}
