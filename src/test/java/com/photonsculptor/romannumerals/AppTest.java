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
    
    @Test
    public void whenSixteenEnteredXVIReturned() {
    	String result = app.convertToRoman(16);
    	assertEquals(result, "XVI");
    }

    @Test
    public void whenTwentyeightEnteredXXVIIIReturned() {
    	String result = app.convertToRoman(28);
    	assertEquals(result, "XXVIII");
    }
    
    @Test
    public void whenFourEnteredIVReturned() {
    	String result = app.convertToRoman(4);
    	assertEquals(result, "IV");
    }
    
    @Test
    public void when200EnteredCCReturned() {
    	String result = app.convertToRoman(200);
    	assertEquals(result, "CC");
    }
    
    @Test
    public void when47EnteredXLVIIReturned() {
    	String result = app.convertToRoman(47);
    	assertEquals(result, "XLVII");
    }
    
    @Test
    public void when9EnteredIXReturned() {
    	String result = app.convertToRoman(9);
    	assertEquals(result, "IX");
    }
    
    @Test
    public void when400EnteredCDReturned() {
    	String result = app.convertToRoman(400);
    	assertEquals(result, "CD");
    }
  

}