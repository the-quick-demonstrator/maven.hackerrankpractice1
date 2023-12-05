package com.github.curriculeon;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.Arrays.fill;

public class NextPermutation2 {


    public static String nextPermutation(String word) {
        return null;
    }

    public static Collection<String> getAllPermutations(final String input) {
        final Set<String> collection = new HashSet<>();
        final int numberOfPermutations = IntStream
                .rangeClosed(1, input.length())
                .reduce(1, (x, y) -> x * y);
        while (collection.size() < numberOfPermutations) {
            final String hopefullyUniqueString = shuffle(input);
            collection.add(hopefullyUniqueString);
        }
        return collection;
    }

    private static String shuffle(String input) {
        final StringBuilder result = new StringBuilder();
        final String[] array = input.split("");
        final List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(result::append);
        return result.toString();
    }
}