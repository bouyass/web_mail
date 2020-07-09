package com.lyes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@Order(1)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Qualifier("userDetailsServiceImpl")
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean 
	public NoOpPasswordEncoder bCryptPasswordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests()
			.antMatchers("/resources/**","/registration").permitAll()
			.anyRequest().authenticated()
		.and()
			.formLogin()
			.loginPage("/login")
			.usernameParameter("email")
			.defaultSuccessUrl("/welcome")
			.failureUrl("/error")
			.permitAll()
		.and()
			.logout()
			.logoutSuccessUrl("/login?logout=true")
			.invalidateHttpSession(true)
			.permitAll()
		.and()
			.csrf()
			.disable();
	}
	
	@Bean 
	public AuthenticationManager customAuthenticationManagerBuilder() throws Exception{
		return authenticationManager();
	}
	
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
	return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
	@Autowired 
	public void ConfigureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());;
	}
	
	
}
