package com.abevieiramota.ch09;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestInterfacesHierarchy {

	@Test
	public void testPalestrante() {
		PalestranteHumano ph = new PalestranteHumano();
		IPalestrante iph = ph;
		IBichoQueFala bph = ph;
		
		assertEquals(PalestranteHumano.FALA_DO_HUMANO, ph.fala());
		assertEquals(PalestranteHumano.FALA_DO_HUMANO, iph.fala());
		assertEquals(PalestranteHumano.FALA_DO_HUMANO, bph.fala());
	}
	
	@Test
	public void testInterfaceHierarchy() {
		PalestranteQueFala pqf = new PalestranteQueFala();
		IPalestranteQueFala ipaf = pqf;
		IPalestrante p = pqf;
		
		assertEquals(PalestranteQueFala.FALA, pqf.fala());
		assertEquals(PalestranteQueFala.FALA, ipaf.fala());
		assertEquals(PalestranteQueFala.FALA, p.fala());
	}
	
	@Test
	public void testMultipleImplementations() {
		Grego g = new Grego();
		assertEquals("grego", g.fala());
		assertEquals("theta", g.grita());
	}
}
