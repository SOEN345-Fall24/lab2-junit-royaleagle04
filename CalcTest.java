import org.junit.Test;
import  static org.junit.Assert.*;

public class CalcTest
{
    @Test public void testFunction_A1(){
        Example test1 = new Example(2,3);
        assertEquals("Calc, FunctionA incorrect", 5, test1.Function_A(3));

    }

    @Test public void testFunction_A2(){
        Example test1 = new Example(5,3);
        assertEquals("Calc, FunctionA incorrect", -15, test1.Function_A(-10));

    }

    @Test public void testFunction_B2(){
        Example test1 = new Example(2,2);
        assertEquals("Calc, FunctionB incorrect", 7, test1.Function_B(5));

    }

    @Test public void testFunction_B1(){
        Example test1 = new Example(2,2);
        assertEquals("Calc, FunctionB incorrect", 6, test1.Function_B(8));

    }
}