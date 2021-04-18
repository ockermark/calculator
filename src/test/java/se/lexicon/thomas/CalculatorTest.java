package se.lexicon.thomas;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testadd()
    {

        char sign = '+' ;
        double num1 = 3 ;
        double num2 = 4 ;
        double expected = 7 ;
        double result = Calculator.execute(sign,num1,num2);

        assertTrue(expected == result);
    }

    @Test
    public void testsubttract()
    {

        char sign = '-' ;
        double num1 = 3 ;
        double num2 = 4 ;
        double expected = -1 ;
        double result = Calculator.execute(sign,num1,num2);

        assertTrue(expected == result);
    }

    @Test
    public void testmultiply()
    {

        char sign = '*' ;
        double num1 = 3 ;
        double num2 = 4 ;
        double expected = 12 ;
        double result = Calculator.execute(sign,num1,num2);

        assertTrue(expected == result);
    }

    @Test
    public void testdivide()
    {

        char sign = '/' ;
        double num1 = 3 ;
        double num2 = 4 ;
        double expected = 0.75 ;
        double result = Calculator.execute(sign,num1,num2);

        assertTrue(expected == result);
    }

}
