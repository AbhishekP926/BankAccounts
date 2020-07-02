/**
 * 
 */
package com.example.mortgage.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @author 34798
 *
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	private static String REALM="MY_TEST_REALM";
    
	  @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("bill").password("{noop}abc123").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("tom").password("{noop}abc123").roles("USER");
    }
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {
  
     http.headers().frameOptions().disable();
      http.csrf().disable()
        .authorizeRequests()
        .antMatchers("/itcinfotech/**").hasRole("ADMIN")
        .and().httpBasic().realmName(REALM)
        .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);//We don't need sessions to be created.
    }
     
//    @Bean
//    public MyBasicAuthenticationEntryPoint getBasicAuthEntryPoint(){
//        return new MyBasicAuthenticationEntryPoint();
//    }
//     
    /* To allow Pre-flight [OPTIONS] request from browser */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
    }
	
//	@Autowired
//	private AuthenticationEntryPoint authEntryPoint;
	
/*
 * @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
 * throws Exception { auth .inMemoryAuthentication()
 * .withUser("userId").password("{noop}passwd").roles("") ;
 * 
 * }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { http
 * .authorizeRequests().antMatchers("/").permitAll()
 * .antMatchers(HttpMethod.POST,"itcinfotech/online/mortgage/createMortgage").
 * permitAll() .antMatchers("/securityNone").permitAll()
 * .anyRequest().authenticated() .and() .httpBasic() .realmName("Realm");
 * 
 * }
 */
		/*
		 * @Override protected void configure(HttpSecurity http) throws Exception {
		 * http.authorizeRequests() .anyRequest().authenticated() .and().httpBasic()
		 * .and().logout(); }
		 */

//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("john123").password("password").roles("USER");
//	}
}
