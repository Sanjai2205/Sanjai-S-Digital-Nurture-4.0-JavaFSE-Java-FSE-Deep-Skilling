public class AAAPattern {

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.setUp();
        test.testAddition();
        test.tearDown();

        test.setUp();
        test.testAnotherAddition();
        test.tearDown();
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public void clearMemory() {
        System.out.println("Memory cleared.");
    }
}

class CalculatorTest {
    Calculator calculator;
    public void setUp() {
        System.out.println("Setting up test environment...");
        calculator = new Calculator();  
    }
    public void tearDown() {
        calculator.clearMemory();  
        System.out.println("Test completed.\n");
    }
    public void testAddition() {
        System.out.println("Running testAddition...");
        int result = calculator.add(2, 3);
        if (result == 5) {
            System.out.println("testAddition passed.");
        } else {
            System.out.println("testAddition failed: expected 5, got " + result);
        }
    }
    public void testAnotherAddition() {
        System.out.println("Running testAnotherAddition...");
        int result = calculator.add(10, 20);
        if (result == 30) {
            System.out.println("testAnotherAddition passed.");
        } else {
            System.out.println("testAnotherAddition failed: expected 30, got " + result);
        }
    }
}
