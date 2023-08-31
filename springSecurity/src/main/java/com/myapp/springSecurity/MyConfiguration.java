package com.myapp.springSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyConfiguration extends WebSecurityConfigurerAdapter {

	//@Override
	/*protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	 auth.inMemoryAuthentication().withUser("sitara").password("$2a$10$5blV7krNg0B3UrYUFK4iBOUr.FfXVSbzWX8mDIcllInCi/R/yc3VG").roles("trainer");
			
		}
		
	//@Bean
	//public PasswordEncoder getpassword() {
		//return NoOpPasswordEncoder.getInstance();
	//}
	@Bean
	public PasswordEncoder getpassword() {
		return new BCryptPasswordEncoder(10);
	}*/
	@Override
	/*protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("chetana").password("123")
		.roles("manager").and().withUser("abishek").password("ask")
		.roles("trainer").and().withUser("rakshitha").password("111")
		.roles("student");
	}*/
	/*@Bean
	public PasswordEncoder getpswd() {
		return NoOpPasswordEncoder.getInstance();
	
	}*/
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("chetana").password("$2a$10$3QC4tZ15hSvJVYKOdFOijuJRH0awLOWT077WkI5lZsID/c.mNQyFy")
		.roles("manager").and().withUser("abishek").password("$2a$12$stMKXAQiDm3Yc3mnyJR/ben1HxicJ8QHEsWHf4AWLd7WGlzspWQmu")
		.roles("trainer").and().withUser("rakshitha").password("$2a$11$myE5qqmxzvNntUqRBTZnHOaBiSmXMPDSR7Uly2JU.kE11ICUK036y")
		.roles("student");
	}
	@Bean
	public PasswordEncoder getencryptpswd1() {
		return new BCryptPasswordEncoder(10);
	}
	
	public PasswordEncoder getencryptpswd2() {
		return new BCryptPasswordEncoder(12);
	}
	
	public PasswordEncoder getencryptpswd3() {
		return new BCryptPasswordEncoder(11);
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/manager").hasRole("manager");
		http.authorizeRequests().antMatchers("/trainer").hasAnyRole("trainer,manager");
		http.authorizeRequests().antMatchers("/student").permitAll().and().formLogin();
	}
	}
	
	

