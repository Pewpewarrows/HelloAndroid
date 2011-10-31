package com.pewpewarrows.helloandroid;

/**
 * "C" is short-hand for a Constants class
 * 
 * This should only contain properties of type "public static final", excluding
 * the constructor. In addition, those values should only be related to the 
 * project in general.
 */
public final class C {
	public static final boolean DEBUG = true;
	
	/**
	 * Intentially private. Java has no native way to describe a class that
	 * should never be instantiated.
	 * 
	 * The error is thrown in the event that someone attempts to be sneaky and
	 * use reflection.
	 */
	private C() {
		throw new UnsupportedOperationException();
	}
}
