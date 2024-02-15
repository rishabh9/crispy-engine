package dev.crispyengine.elevator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
class ElevatorApplicationTests {

	@Test
	void contextLoads() {
		// Remove me.
	}

}
