package test;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BasicTest {

	@Test
	public void test() {
		Basic.basicString();
		assertNotNull(Basic.getMessage());
	}

}
