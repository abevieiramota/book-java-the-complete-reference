package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HashCodeFail {
	

	private static class Pessoa {
		public interface HashCoder {
			int hash(Pessoa pessoa);
		}
		
		int id;
		String cpf;
		HashCoder hashCoder;
		
		public Pessoa(HashCoder hashCoder) {
			this.hashCoder = hashCoder;
		}

		@Override
		public int hashCode() {
			return this.hashCoder.hash(this);
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Pessoa)) {
				return false;
			}

			Pessoa outra = (Pessoa) obj;

			return this.id == outra.id;
		}
	}
	
	@Test
	public void fail() {
		Pessoa pessoa1 = new Pessoa((p) -> Objects.hash(p.id, p.cpf));
		// same id
		pessoa1.id = 1;
		pessoa1.cpf = "123";
		
		Pessoa pessoa2 = new Pessoa((p) -> Objects.hash(p.id, p.cpf));
		// same id
		pessoa2.id = 1;
		pessoa2.cpf = "1234";
		
		Map<Pessoa, String> nomes = new HashMap<Pessoa, String>();
		
		nomes.put(pessoa1, "Abelardo");
		
		nomes.put(pessoa2, "Josino");
		
		assertEquals(2, nomes.size());
		
		// hash por id
		Pessoa pessoa3 = new Pessoa((p) -> Objects.hash(p.id));
		// same id
		pessoa1.id = 1;
		pessoa1.cpf = "123";
		
		Pessoa pessoa4 = new Pessoa((p) -> Objects.hash(p.id));
		// same id
		pessoa2.id = 1;
		pessoa2.cpf = "1234";
		
		Map<Pessoa, String> nomes2 = new HashMap<Pessoa, String>();
		
		nomes2.put(pessoa3, "Abelardo");
		
		nomes2.put(pessoa4, "Josino");
		
		assertEquals(1, nomes2.size());
		assertEquals("Josino", nomes2.get(pessoa3));
		assertEquals("Josino", nomes2.get(pessoa4));
	}

}
