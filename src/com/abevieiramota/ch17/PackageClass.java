package com.abevieiramota.ch17;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PackageClass {

	@Test
	public void testPackage() {
		
		Package[] packages = Package.getPackages();
		
		for(Package p: packages) {
			System.out.println(p.getName() + " " + p.getImplementationTitle() + " " + p.getImplementationVendor() + " " + p.getImplementationVersion());
		}
	}
}
