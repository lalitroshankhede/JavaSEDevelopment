package com.DateandTimeExample;

import java.time.Clock;

public class ClockEx {

	public static void main(String[] args) {
		Clock c = Clock.systemDefaultZone();
		System.out.println(c.getZone());
	}
}
