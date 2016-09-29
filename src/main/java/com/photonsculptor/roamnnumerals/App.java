package com.photonsculptor.roamnnumerals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public String convertToRoman(int arabic) {
		String roman = Stream.generate(() -> "I").limit(arabic).collect(Collectors.joining());
		return roman;		
    }
}
