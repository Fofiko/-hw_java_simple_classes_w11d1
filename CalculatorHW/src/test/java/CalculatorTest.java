import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator();}

    @Test
    public void canAdd(){
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void canDivide(){
        assertEquals(4, calculator.divide(12, 3));
    }



}
