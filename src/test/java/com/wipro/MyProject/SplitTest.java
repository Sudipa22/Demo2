package com.wipro.MyProject;

import org.junit.Assert;
import org.junit.Test;


class SplitTest {

	@Test
	void test() {
		Split s=new Split();
		int y=s.lengthString("wipro digital");
		Assert.assertEquals(13, y);
		
		
	}
	@Test
	void test12() {
		Split s=new Split();
		int y=s.lengthString("hello");
		Assert.assertEquals(13, y);
		
		
	}


}
