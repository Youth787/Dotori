package com.dotori.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootTest
@EnableRedisHttpSession
	// @Import(TestRedisConfig.class) // TestRedisConfig를 로드하기 위한 어노테이션
class BackendApplicationTests {

	@Test
	void contextLoads() {
	}

}
