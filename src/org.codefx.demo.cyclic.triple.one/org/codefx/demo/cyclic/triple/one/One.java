package org.codefx.demo.cyclic.triple.one;

import org.codefx.demo.cyclic.triple.three.Three;

public class One {

	public static void one() {
		System.out.println("One");
	}

	public static void threeone() {
		Three.three();
		One.one();
	}

}
