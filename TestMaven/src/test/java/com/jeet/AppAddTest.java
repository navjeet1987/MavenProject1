package com.jeet;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppAddTest {

	@Test
	public void Addtest() {
		App junit = new App();
		int c= junit.add(2, 3);
		assertEquals(5,c);
		
	}

}
