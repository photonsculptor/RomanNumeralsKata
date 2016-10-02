package com.photonsculptor.roamnnumerals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	
	public class Number {
		public int arabicNum;
		public String romanNum;
		
		Number(int arabicNum, String romanNum) {
			this.arabicNum = arabicNum;
			this.romanNum = romanNum;
		}
	}

	public String convertToRoman(int arabic) {
		StringBuilder roman = new StringBuilder();
		
		arabic = appendRomanNumeral(arabic, new Number(1000, "M"), roman);
		arabic = appendRomanNumeral(arabic, new Number(900, "CM"), roman);
		arabic = appendRomanNumeral(arabic, new Number(500, "D"), roman);
		arabic = appendRomanNumeral(arabic, new Number(400, "CD"), roman);
		arabic = appendRomanNumeral(arabic, new Number(100, "C"), roman);
		arabic = appendRomanNumeral(arabic, new Number(90, "XC"), roman);
		arabic = appendRomanNumeral(arabic, new Number(50, "L"), roman);
		arabic = appendRomanNumeral(arabic, new Number(40, "XL"), roman);
		arabic = appendRomanNumeral(arabic, new Number(10, "X"), roman);
		arabic = appendRomanNumeral(arabic, new Number(9, "IX"), roman);
		arabic = appendRomanNumeral(arabic, new Number(5, "V"), roman);
		arabic = appendRomanNumeral(arabic, new Number(4, "IV"), roman);
		arabic = appendRomanNumeral(arabic, new Number(1, "I"), roman);

		
		return roman.toString();
				
    }

	private int appendRomanNumeral(int arabic, Number numToAppend, StringBuilder roman) {
		if(arabic >= numToAppend.arabicNum) {
			int numRepeats = arabic / numToAppend.arabicNum;
			roman.append(romanLetters(numRepeats, numToAppend.romanNum));
			return arabic % numToAppend.arabicNum;
		}	
		else {
			return arabic;
		}
	}

	private String romanLetters(int arabic, String letter) {
		return Stream.generate(() -> letter).limit(arabic).collect(Collectors.joining());
	}

	
	
	public int convertToArabic(String string) {
		
		return 1;
	}
}
