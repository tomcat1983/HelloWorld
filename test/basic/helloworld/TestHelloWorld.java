package basic.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHelloWorld {

	@Test
	public void test() {
		HelloWorld instance = new HelloWorld();
		instance.testFunction();
		assert(true);
//		fail("Not yet implemented!!");
	}

}
