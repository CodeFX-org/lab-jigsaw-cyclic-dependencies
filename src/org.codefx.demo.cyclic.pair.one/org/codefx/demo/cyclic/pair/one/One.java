package org.codefx.demo.cyclic.pair.one;

import org.codefx.demo.cyclic.pair.two.Two;

public class One {

	public static void one() {
		System.out.println("One");
	}

	public static void twoone() {
		Two.two();
		One.one();
	}

}
