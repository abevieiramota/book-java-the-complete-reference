package com.abevieiramota.ch18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testQueue() {
		Queue<String> queue = new PriorityQueue<>();
		queue.offer("Abelardo");
		queue.offer("Odraleba");
		queue.offer("Chisconildo");
		
		assertEquals("Abelardo", queue.peek());
		assertEquals("Abelardo", queue.poll());
		assertEquals("Odraleba", queue.poll());
		assertEquals("Chisconildo", queue.poll());
		assertNull(queue.poll());
	}
}
