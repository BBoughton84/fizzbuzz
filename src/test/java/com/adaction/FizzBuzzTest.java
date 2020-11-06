package com.adaction;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FizzBuzzTest
{
    @Test
    public void testFizzBuzzWorksWith0Input() throws Exception {
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzz(0));
        assertEquals("", output.trim());
    }

    @Test
    public void testFizzBuzzWorksTo20() throws Exception{
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzz(20));
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz", output.trim());
    }

    @Test
    public void testFizzBuzzWorksTo40() throws Exception{
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzz(40));
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz fizz 22 23 fizz buzz 26 fizz 28 29 fizzbuzz 31 32 fizz 34 buzz fizz 37 38 fizz buzz", output.trim());
    }

    @Test
    public void testFizzBuzzDoesNotContainIncorrectWords() throws Exception{
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzz(20));
        assertNotEquals("This text does not match", output.trim());
    }
}
