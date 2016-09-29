package com.photonsculptor.romannumerals;

import org.junit.Before;
import org.junit.Test;

import com.photonsculptor.roamnnumerals.App;

import static org.junit.Assert.assertEquals;

public class AppTest {
    private App app;

    @Before
    public void setUp() {
        this.app = new App();
    }

    @Test
    public void whenOneEnteredIReturned() {
    	String result = app.convertToRoman(1);
    	assertEquals(result, "I");
    }
    
    @Test
    public void whenTwoEnteredIIReturned() {
    	String result = app.convertToRoman(2);
    	assertEquals(result, "II");
    }
    
    @Test
    public void whenThreeEnteredIIIReturned() {
    	String result = app.convertToRoman(3);
    	assertEquals(result, "III");
    }
}