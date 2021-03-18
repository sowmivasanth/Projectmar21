package org.hcl.test.login;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Junit0.class,Junit1.class})
public class SuiteClass {
	public static void main(String[] args) {
		Result r=JUnitCore.runClasses(SuiteClass.class);
		int count = r.getFailureCount();
		System.out.println("Failure count  :"+count);
		int count2 = r.getIgnoreCount();
		System.out.println("IgnoreCount   :"+count2);
		int count3 = r.getRunCount();
		System.out.println("Run count: "+count3);
		long time = r.getRunTime();
		System.out.println("RunTime:" +time);
		List<Failure> failures = r.getFailures();
		for(Failure f:failures) {
			System.out.println(f.toString());
		}
	}
	}


