package com.fp.codingdojo.calculator;

import java.util.Arrays;

public class StringCalculator {

	public static void main(String[] args) {
		sum(new String[]{""});
		sum(new String[]{"1"});
		sum(new String[]{"1,2"});
		sum(new String[]{"4"});
		sum(new String[]{"5,7"});
		sum(new String[]{"5,17"});
		sum(new String[]{"5,6,7"});
		sum(new String[]{"5,6,7"});
		sum(new String[]{"5,6,7,8,9,10"});
		sum(new String[]{"5,6\n7,8\n9,10"});
	}

	// TODO: 28/12/2022 Change string[] to string (one string as a parameter)
	public static String sum(String[] args) {
		System.out.println("input: " + args[0]);

		if (args[0].equals("")) {
			System.out.println("output: 0");
			return String.valueOf(0);
		}

		String[] numbers = args[0].split(",");

		Integer result = Arrays.stream(numbers)
				.map(s -> s.split("\n"))
				.flatMap(strings -> Arrays.stream(strings))
				.mapToInt(value -> Integer.parseInt(value))
				.sum();

			System.out.println("output " + result);
			return String.valueOf(result);
	}
}
