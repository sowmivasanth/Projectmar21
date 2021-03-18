package org.hcl.test.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit0 {
	@Test
  public  void tc01() {
	System.out.println("method11");
}
	@Test
  public  void tc11() {
	  System.out.println("method21");
}
	@Test
  public void tc13() {
		String s="class";
System.out.println("s");
Assert.assertEquals("s","class");
System.out.println("Assert false");

}
	@Test
  public void tc14() {
System.out.println("method41");
}
  @Test
  public void tc12() {
System.out.println("method51");

}
}
