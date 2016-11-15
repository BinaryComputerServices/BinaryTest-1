package test;
import static org.junit.Assert.*;
import junit.framework.Assert;

import main.Lottery;

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
		Assert.assertEquals(new Lottery().getDrawer(),"");
	}

	@Test
	public void test2() {
		Assert.assertEquals(1,1);
	}
}
