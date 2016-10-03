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
  
    @Test
    public void when900EnteredCMReturned() {
    	String result = app.convertToRoman(900);
    	assertEquals(result, "CM");
    }
    
    @Test
    public void when1000EnteredMReturned() {
    	String result = app.convertToRoman(1000);
    	assertEquals(result, "M");
    }
    
    @Test
    public void when1066EnteredMLXVIReturned() {
    	String result = app.convertToRoman(1066);
    	assertEquals(result, "MLXVI");
    }
    
    @Test
    public void when1989EnteredMCMLXXXIXReturned() {
    	String result = app.convertToRoman(1989);
    	assertEquals(result, "MCMLXXXIX");
    }
    
    @Test
    public void whenIIEntered2Returned() {
    	int result = app.convertToArabic("II");
    	assertEquals(result, 2);
    }
    
    @Test
    public void whenVEntered5Returned() {
    	int result = app.convertToArabic("V");
    	assertEquals(result, 5);
    }
    
    @Test
    public void whenIVEntered4Returned() {
    	int result = app.convertToArabic("IV");
    	assertEquals(result, 4);
    }
    
    @Test
    public void whenIIIEntered3Returned() {
    	int result = app.convertToArabic("III");
    	assertEquals(result, 3);
    }
    
    @Test
    public void whenIXEntered9Returned() {
    	int result = app.convertToArabic("IX");
    	assertEquals(result, 9);
    }
    
    @Test
    public void whenMLXVIEntered1066Returned() {
    	int result = app.convertToArabic("MLXVI");
    	assertEquals(result, 1066);
    }
    
    @Test
    public void whenMCMLXXXIXEntered1989Returned() {
    	int result = app.convertToArabic("MCMLXXXIX");
    	assertEquals(result, 1989);
    }
}