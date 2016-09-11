/**
 * 
 */
package cn.aposoft.framework.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author LiuJian
 *
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
	public SecurityWebApplicationInitializer() {
		super(SecurityConfig.class);
	}
}
