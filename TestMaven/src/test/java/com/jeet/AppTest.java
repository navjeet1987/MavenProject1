package com.jeet;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void Stringtest() {
		App junit = new App();
		String x =junit.Sample();
		assertEquals("sample string",x);
		//fail("Not yet implemented");
	}

}
