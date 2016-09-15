/**
 * 
 */
package cn.aposoft.framework.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 
 * 
 * @author LiuJian
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("Config spring security...");
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
	}

	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		// http.authorizeRequests()//
		// .anyRequest().authenticated()//
		// .antMatchers("/login").permitAll()//
		// .and()//
		// .formLogin().loginPage("/login.jsp")//
		// .permitAll();
	}
}
