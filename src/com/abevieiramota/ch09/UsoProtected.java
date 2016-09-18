package com.abevieiramota.ch09;

import com.abevieiramota.ch09.prot.TenhoProtected;

/**
 * Anything declared public can be accessed from anywhere. Anything declared
 * private cannot be seen outside of its class. When a member does not have an
 * explicit access specification, it is visible to subclasses as well as to
 * other classes in the same package. This is the default access. If you want to
 * allow an element to be seen outside your current package, but only to classes
 * that subclass your class directly, then declare that element protected.
 *
 */
public class UsoProtected extends TenhoProtected {

	public int getProtected() {

		return this.a;
	}

}
