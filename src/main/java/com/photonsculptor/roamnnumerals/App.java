package com.photonsculptor.roamnnumerals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public String convertToRoman(int arabic) {
		if(arabic >= 10) {
			int numXs = arabic / 10;
			return romanLetters(numXs, "X");
		} else if (arabic == 5) {
			return "V";
		} else {
			return romanLetters(arabic, "I");
		}
				
    }

	private String romanLetters(int arabic, String letter) {
		return Stream.generate(() -> letter).limit(arabic).collect(Collectors.joining());
	}
}
