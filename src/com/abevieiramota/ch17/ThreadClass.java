package com.abevieiramota.ch17;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ThreadClass {

	@Test
	public void testUncaughtExceptionHandler() throws InterruptedException {

		class MeuUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

			public int i;

			public MeuUncaughtExceptionHandler() {
				this.i = 0;
			}

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				this.i++;
			}
		}

		Thread th01 = new Thread(new Runnable() {

			@Override
			public void run() {

				throw new RuntimeException();
			}
		});

		MeuUncaughtExceptionHandler ueh = new MeuUncaughtExceptionHandler();
		th01.setUncaughtExceptionHandler(ueh);

		th01.start();

		th01.join();

		assertEquals(1, ueh.i);
	}
}
