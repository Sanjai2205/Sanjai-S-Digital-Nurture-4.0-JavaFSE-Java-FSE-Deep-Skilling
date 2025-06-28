public class Main {
public static void main(String[] args) {
        System.out.println(" Running testAssertions...");
try {
            assertEquals("assertEquals", 5, 2 + 3);
            assertTrue("assertTrue", 5 > 3);
            assertFalse("assertFalse", 5 < 3);
            assertNull("assertNull", null);
            assertNotNull("assertNotNull", new Object());
            System.out.println("\n All assertions passed!");
        } catch (AssertionError e) {
            System.out.println("\n Assertion failed: " + e.getMessage());
        }
    }
    static void assertEquals(String name, Object expected, Object actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(name + ": expected " + expected + ", but got " + actual);
        }
        System.out.println(name + " passed");
    }

    static void assertTrue(String name, boolean condition) {
        if (!condition) {
            throw new AssertionError(name + ": condition was false");
        }
        System.out.println(name + " passed");
    }
    static void assertFalse(String name, boolean condition) {
        if (condition) {
            throw new AssertionError(name + ": condition was true");
        }
        System.out.println(name + " passed");
    }
    static void assertNull(String name, Object obj) {
        if (obj != null) {
            throw new AssertionError(name + ": expected null but got non-null");
        }
        System.out.println( name + " passed");
    }
    static void assertNotNull(String name, Object obj) {
        if (obj == null) {
            throw new AssertionError(name + ": expected non-null but got null");
        }
        System.out.println(name + " passed");
    }
}
