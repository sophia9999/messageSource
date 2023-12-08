package com.example.inhye;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

@SpringBootTest
class InhyeApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(Locale.getDefault());
	}

}
