package org.codefx.demo.cyclic.triple.three;

import org.codefx.demo.cyclic.triple.two.Two;

public class Three {

	public static void three() {
		System.out.println("Three");
	}

	public static void twothree() {
		Two.two();
		Three.three();
	}

}
