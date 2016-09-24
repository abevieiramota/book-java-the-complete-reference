package com.abevieiramota.ch10;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaBuiltinsTest {

	// unchecked

	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		int a = 10 / 0;
	}

	@Test()
	public void testDivideByZeroDouble() {
		double a = 10 / 0.0;
		// TODO: como comparar double?
		assertEquals(Double.POSITIVE_INFINITY, a, 0.0);
	}

	@Test(expected = ArithmeticException.class)
	public void testBigDecimalDivideDizimaPeriodica() {
		BigDecimal um = new BigDecimal(1);
		BigDecimal tres = new BigDecimal(3);
		um.divide(tres);
	}

	@Test
	public void testBigDecimalDivideDizimaPeriodicaRound() {
		BigDecimal um = new BigDecimal(1);
		BigDecimal tres = new BigDecimal(3);
		assertEquals(0.3, um.divide(tres, 1, BigDecimal.ROUND_DOWN).doubleValue(), 0.0);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testArrayIndexOutOfBoundException() {
		int length = 10;
		int[] arr = new int[length];
		arr[length] = 123;
	}

	@Test(expected = ArrayStoreException.class)
	public void testArrayStoreException() {
		Object[] arr = new String[1];
		arr[0] = 10;
	}

	@Test(expected = ClassCastException.class)
	public void testClassCastException() {
		Object dez = new Integer(10);
		String oi = (String) dez;
	}

	enum Oi {
		OI;
		public void doClone() throws CloneNotSupportedException {
			super.clone();
		}
	}

	@Test(expected = EnumConstantNotPresentException.class)
	public void testEnumConstantNotPresentException() {
		// FIXME: duno
		throw new EnumConstantNotPresentException(Oi.class, "teste");
	}

	/**
	 * Thrown to indicate that a method has been passed an illegal or
	 * inappropriate argument.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		Oi.valueOf("teste");
	}

	@Test(expected = IllegalMonitorStateException.class)
	public void testIllegalMonitorStateException() {
		// TODO: depois de ver multithreading
		throw new IllegalMonitorStateException();
	}

	/**
	 * Signals that a method has been invoked at an illegal or inappropriate
	 * time. In other words, the Java environment or Java application is not in
	 * an appropriate state for the requested operation.
	 */
	class Bicho {
		boolean isVivo = false;

		public void nasce() {
			this.isVivo = true;
		}

		public void morre() {
			if (!this.isVivo) {
				throw new IllegalStateException("só se mata o que tá vivo!");
			}
			this.isVivo = false;
		}

	}

	@Test(expected = IllegalStateException.class)
	public void testIllegalStateException() {
		Bicho bicho = new Bicho();
		bicho.morre();
	}

	@Test(expected = IllegalThreadStateException.class)
	public void testIllegalThreadStateException() {
		// TODO: depois de ver multithreading
		throw new IllegalThreadStateException();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
		String oi = "Oi galera";
		oi.charAt(100);
	}

	@Test(expected = NegativeArraySizeException.class)
	public void testNegativeArraySizeException() {
		Object[] arr = new Object[-2];
	}

	/**
	 * Thrown when an application attempts to use {@code null} in a case where
	 * an object is required.
	 */
	@Test(expected = NullPointerException.class)
	public void testNullPointerException() {
		String oi = null;
		oi.charAt(100);
	}

	/**
	 * Thrown to indicate that the application has attempted to convert a string
	 * to one of the numeric types, but that the string does not have the
	 * appropriate format.
	 */
	@Test(expected = NumberFormatException.class)
	public void testNumberFormatException() {
		Integer.valueOf("juro que sou Integer!");
	}

	@Test(expected = SecurityException.class)
	public void testSecurityException() {
		// TODO: quando vir security
		throw new SecurityException();
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testStringIndexOutOfBoundsException() {
		String oi = "Oi galera";
		oi.charAt(100);
	}

	@Test(expected = TypeNotPresentException.class)
	public void testTypeNotPresentException() {
		// FIXME: como replicar?
		throw new TypeNotPresentException("Oi", null);
	}

	/**
	 * Thrown to indicate that the requested operation is not supported.
	 */
	@Test(expected = UnsupportedOperationException.class)
	public void testUnsupportedOperationException() {
		java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
		sqlDate.toInstant();
	}

	// checked

	/**
	 * Thrown when an application tries to load in a class through its string
	 * name using:
	 * <ul>
	 * <li>The <code>forName</code> method in class <code>Class</code>.
	 * <li>The <code>findSystemClass</code> method in class
	 * <code>ClassLoader</code> .
	 * <li>The <code>loadClass</code> method in class <code>ClassLoader</code>.
	 * </ul>
	 * <p>
	 * but no definition for the class with the specified name could be found.
	 * @throws ClassNotFoundException 
	 **/
	@Test(expected = ClassNotFoundException.class)
	public void testClassNotFoundException() throws ClassNotFoundException {
		Class.forName("Oi, eu não existo!");
	}
	
	@Test(expected = CloneNotSupportedException.class)
	public void testCloneNotSupportedException() throws CloneNotSupportedException {
		Oi.OI.doClone();
	}
	
	@Test(expected = IllegalAccessException.class)
	public void testIllegalAccessException() throws InstantiationException, IllegalAccessException {
		Class.class.newInstance();
	}
	
	class SemConstrutorDefault {
		private SemConstrutorDefault() {
		}
	}
	@Test(expected = InstantiationException.class)
	public void testInstantiationException() throws InstantiationException, IllegalAccessException {
		SemConstrutorDefault.class.newInstance();
	}
	
	@Test(expected = InterruptedException.class)
	public void testInterruptedException() throws InterruptedException {
		// TODO: quando vir multithreading
		throw new InterruptedException();
	}
	
	@Test(expected = NoSuchFieldException.class)
	public void testNoSuchFieldException() throws NoSuchFieldException {
		JavaBuiltinsTest obj = new JavaBuiltinsTest();
		obj.getClass().getField("ahussuhahuas");
	}
	
	@Test(expected = NoSuchMethodException.class)
	public void testNoSuchMethodException() throws NoSuchMethodException {
		JavaBuiltinsTest obj = new JavaBuiltinsTest();
		obj.getClass().getMethod("ahussuhahuas");
	}
	
	@Test(expected = ReflectiveOperationException.class)
	public void testReflectiveOperationException() throws ReflectiveOperationException {
		// TODO: quando vir reflection
		throw new ReflectiveOperationException();
	}

}
