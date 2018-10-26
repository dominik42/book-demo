package de.todo42.workshop.bookdemo.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppConfigTest {

	@Autowired
	private AppConfig appConfig;
	
	@Test
	public void testConfig() {
		assertNotNull(appConfig);
		assertEquals("a@b.cd", appConfig.getEmail());
	}
}
