package Algo.test;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BasicTest {

	@Test
	public void test() {
		Basic.basicString();
		assertNotNull(Basic.getMessage());
	}

}
