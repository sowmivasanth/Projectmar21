package org.hcl.test.login;

import org.junit.Test;

public class Assert {
@Test
public void tc0() {
	String s="Abcd";
	System.out.println(s);
	org.junit.Assert.assertEquals(s, "cdefr");
	System.out.println("AssertFal");
}
}