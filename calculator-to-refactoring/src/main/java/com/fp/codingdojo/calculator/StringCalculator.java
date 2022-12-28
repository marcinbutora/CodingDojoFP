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

    public static String sum(String[] args) {
        String inputString = args[0];
        System.out.println("input: " + inputString);
        String result2 = inputString.equals("")
                ? "0"
                : sum(inputString);

        System.out.println("output " + result2);
        return result2;
    }

    private static String sum(String inputString) {
        final String DELIMITERS = "\n";
        String[] numbers = inputString.split(",");

        Integer resultSum = Arrays.stream(numbers)
                .map(s -> s.split(DELIMITERS))
                .flatMap(Arrays::stream)
                .mapToInt(Integer::parseInt)
                .sum();

        return String.valueOf(resultSum);
    }
}
