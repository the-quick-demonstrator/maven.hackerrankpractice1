package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class NextPermutation {


    public static String nextPermutation(String word) {
        List<String> allPermutations = getAllPermutations(word);
        int wordIndex = allPermutations.indexOf(word);
        int nextWordIndex = wordIndex + 1;
        String nextWord = allPermutations.get(nextWordIndex);
        System.out.println(nextWord);
        if(new HashSet<>(allPermutations).size() == 1) {
            nextWord = "no answer";
        }
        return nextWord;
    }

    public static List<String> getAllPermutations(String input) {
        List<String> result = new ArrayList<>();
        result.add(""); // Start with an empty string
        for (char currentChar : input.toCharArray()) {
            List<String> newPermutations = new ArrayList<>();
            for (String permutation : result) {
                for (int i = 0; i <= permutation.length(); i++) {
                    String newPerm = permutation.substring(0, i) + currentChar + permutation.substring(i);
                    newPermutations.add(newPerm);
                }
            }
            result = newPermutations;
        }
        Collections.sort(result);
        return result;
    }
}
