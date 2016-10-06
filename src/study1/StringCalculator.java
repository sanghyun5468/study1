package study1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	
	public int add(String text){
		if (isBlank(text)){
			return 0;
		}
		return sum(toInts(split(text)));
	}

	private int toPositive(String value){
		int number = Integer.parseInt(value);
		if(number < 0){
			throw new RuntimeException();
		}
		return number;
	}
	
	private String[] split(String text){
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if(m.find()){
			String customDelimeter = m.group(1);
			return m.group(2).split(customDelimeter);
		}
		return text.split(",|:");
	}
	
	private boolean isBlank(String text){
		return text == null || text.trim().isEmpty();
	}
	
	private int[] toInts(String[] values){
		int valuesLength = values.length;
		int[] numbers = new int[valuesLength];
		for(int i = 0 ; i < valuesLength; i++){
			numbers[i] = toPositive(values[i]);
		}
		return numbers;
	}
	
	private int sum(int[] numbers){
		int sum = 0;
		for(int value : numbers){
			sum += value;
		}
		return sum;
	}

}
