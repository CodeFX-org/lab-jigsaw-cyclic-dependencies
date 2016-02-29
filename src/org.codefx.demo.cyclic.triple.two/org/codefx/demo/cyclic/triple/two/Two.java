package org.codefx.demo.cyclic.triple.two;

import org.codefx.demo.cyclic.triple.one.One;

public class Two {

	public static void two() {
		System.out.println("Two");
	}

	public static void onetwo() {
		One.one();
		Two.two();
	}

}
