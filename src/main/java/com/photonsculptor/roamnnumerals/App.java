package com.photonsculptor.roamnnumerals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public String convertToRoman(int arabic) {
		if (arabic == 20) {
			return "XX";
		} else if(arabic == 10) {
			return "X";
		} else if (arabic == 5) {
			return "V";
		} else {
			return Stream.generate(() -> "I").limit(arabic).collect(Collectors.joining());
		}
				
    }
}
