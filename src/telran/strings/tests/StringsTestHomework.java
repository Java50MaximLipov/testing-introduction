package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringsTestHomework {

	@Test
	void compareToTest() {
		String hello = "Hello";
		String world = "world";

		assertTrue(hello.compareTo(world) < 0);
		assertTrue(world.compareTo(hello) > 0);
		assertEquals(0, hello.compareTo("Hello"));
		assertTrue(world.compareTo("apple") > 0);
		assertTrue("apple".compareTo(world) < 0);
	}

	@Test
	void compareToIgnoreCaseTest() {
		String hello = "Hello";
		String world = "world";

		assertEquals(0, hello.compareToIgnoreCase("hello"));
		assertEquals(0, world.compareToIgnoreCase("WORLD"));

	}

	@Test
	void concatTest() {
		String java = "Java";
		String script = "Script";

		assertEquals("JavaScript", java.concat(script));
		assertFalse("Java Script".equals(java.concat(script)));
		assertFalse("JavaScript".equals(script.concat(java)));
	}

	@Test
	void startsWithTest() {
		String str = "Learning Java is Fun!";

		assertTrue(str.startsWith("Learn"));
		assertFalse(str.startsWith("Work"));
		assertFalse(str.startsWith("learn"));
		assertTrue(str.startsWith("Java", 9));
		assertFalse(str.startsWith("React", 9));
	}

	@Test
	void endsWithTest() {
		String str = "Learning Java is Fun!";

		assertTrue(str.endsWith("!"));
		assertFalse(str.endsWith("."));
	}

	@Test
	void equalsIgnoreCaseTest() {
		// TODO
		assertTrue("hello".equalsIgnoreCase("Hello"));
		assertTrue("WORLD".equalsIgnoreCase("world"));
		assertFalse("hello".equalsIgnoreCase("hallo"));
		assertFalse("apple".equalsIgnoreCase("orange"));
		assertFalse("Hello".equalsIgnoreCase("Helloo"));
		assertFalse("World".equalsIgnoreCase("Worl"));
	}

	@Test
	void indexOfTest() {
		String str = "Returns the index within this string of the first occurrence of the specified substring.";
		String strFromIndex = "Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.";

		assertEquals(12, str.indexOf("index"));
		assertEquals(-1, str.indexOf("java"));
		assertEquals(0, str.indexOf("Returns"));

		assertEquals(28, strFromIndex.indexOf("s", 10));
		assertEquals(115, strFromIndex.indexOf("index", strFromIndex.indexOf("index") + 1));
		assertEquals(-1, strFromIndex.indexOf("Returns", 5));
	}

	@Test
	void lastIndexOfTest() {
		String str = "Learning Java is Fun!";

		assertEquals(12, str.lastIndexOf('a'));
		assertEquals(16, str.lastIndexOf(' '));
		assertEquals(-1, str.lastIndexOf('z'));
		assertEquals(0, str.lastIndexOf('L'));

		assertEquals(12, str.lastIndexOf('a', 20));
		assertEquals(10, str.lastIndexOf('a', 10));
		assertEquals(3, str.lastIndexOf('r', 12));
		assertEquals(0, str.lastIndexOf('L', 10));
		assertEquals(-1, str.lastIndexOf(' ', 5));
	}

}
