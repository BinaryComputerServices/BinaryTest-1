package test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LotteryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals(5,5);
		Assert.assertTrue(true);
		Assert.assertEquals('a', 'a');
		Assert.assertEquals('b', 'b');
	}
	
	public void doSomething(){
		assertFalse(5>0);
	}

}
