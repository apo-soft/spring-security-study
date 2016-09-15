/**
 * 
 */
package cn.aposoft.framework.security;

import org.junit.Test;
import org.springframework.security.core.token.DefaultToken;

/**
 * @author LiuJian
 *
 */
public class DefaultTokenTest {

	@Test
	public void testDefaultToken() {
		DefaultToken token = new DefaultToken("kkdkdk", System.currentTimeMillis(), "kkk");
		System.out.println(token.hashCode());
	}
}
