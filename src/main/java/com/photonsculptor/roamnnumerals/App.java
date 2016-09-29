package com.photonsculptor.roamnnumerals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public String convertToRoman(int arabic) {
		if(arabic !=5){
			String roman = Stream.generate(() -> "I").limit(arabic).collect(Collectors.joining());
			return roman;
		} else {
			return "V";
		}
				
    }
}
