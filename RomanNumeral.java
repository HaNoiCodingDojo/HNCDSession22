package test;

public class RomanNumeral {

	public static String convert0to3(int number) {
		if (number >= 1)
			return "I" + convert0to3(number - 1);
		return "";
	}
	
	public static String convert100or200or300( int number) {
		if (number >= 100)
			return "C" + convert100or200or300(number - 100);
		return "";		
	}
	
	public static String convert10or20or30(int number) {
		if (number >= 10)
			return "X" + convert10or20or30(number - 10);
		return "";
	}

	public static String convert(int number) {
		
		if (1 <= number && number <= 3)
			return convert0to3(number);
		if (number == 10 || number == 20 || number == 30)
			return convert10or20or30(number);
		if (number == 100 || number == 200 || number == 300)
			return convert100or200or300(number);
		
		if (number == 5) 
			return "V";
		if (number == 50)
			return "L";
		
		if (5 < number && number < 9)
			return convert(5) + convert(number - 5);
		if (10 < number && number < 40)
			return convert(10) + convert(number - 10);
		if (50 < number && number < 90)
			return convert(50) + convert(number - 50);
		
		if (number == 4 || number == 9)
			return convert(1) + convert(number + 1);

		if ((40 <= number && number <= 49) || (90 <= number && number <= 99)) {
			int tens = number / 10;
			int ones = number % 10;
			return convert(10) + convert(tens * 10 + 10) + convert(ones);
		}

		return "";
	}
}
