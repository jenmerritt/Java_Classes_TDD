import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        Calculator calculator = new Calculator();
    }

    @Test
    public void can_add_two_integers() {
        assertEquals(7, calculator.add(5, 2).intValue());
    }

    @Test
    public void can_subtract_two_integers(){
        assertEquals(10, calculator.subtract(20,10).intValue());
    }

    @Test
    public void can_multiply_two_integers(){
        assertEquals(100, calculator.multiply(25,4).intValue());
    }

    @Test
    public void can_divide_two_double_floats(){
        assertEquals(2.0, calculator.divide(8.0, 4.0), 0.01);
    }


}
