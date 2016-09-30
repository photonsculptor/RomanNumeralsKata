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
    
    @Test
    public void whenFiveEnteredVReturned() {
    	String result = app.convertToRoman(5);
    	assertEquals(result, "V");
    }
    
    @Test
    public void whenTenEnteredXReturned() {
    	String result = app.convertToRoman(10);
    	assertEquals(result, "X");
    }
    
    @Test
    public void whenTwentyEnteredXXReturned() {
    	String result = app.convertToRoman(20);
    	assertEquals(result, "XX");
    }
    
    @Test
    public void whenEightEnteredVIIIReturned() {
    	String result = app.convertToRoman(8);
    	assertEquals(result, "VIII");
    }
    

}