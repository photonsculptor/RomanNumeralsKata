package com.photonsculptor.roamnnumerals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public String convertToRoman(int arabic) {
		String roman = "";
		
		if(arabic >= 10) {
			int numXs = arabic / 10;
			roman = romanLetters(numXs, "X");
			arabic = arabic % 10;
		} 
		if (arabic >= 5) {
			roman = roman + "V";
		}
		int numIs = arabic % 5;
		roman = roman + romanLetters(numIs, "I");
		
		return roman;
				
    }

	private String romanLetters(int arabic, String letter) {
		return Stream.generate(() -> letter).limit(arabic).collect(Collectors.joining());
	}
}
