package org.hcl.test.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit1 {
	@Test
	  public  void tc0() {
		System.out.println("method1");
	}
	@Test
	  public  void tc1() {
		  System.out.println("method2");
	}
	@Test
	  public void tc3() {
	System.out.println("method3");

	}
	@Test
	  public void tc4() {
	System.out.println("method4");
	}
	@Ignore
	  @Test
	  public void tc2() {
	System.out.println("method5");

	}

}
