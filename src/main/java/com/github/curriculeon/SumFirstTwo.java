//[1,2,3,4]
// get the sum = 3
//[2,3,4] >>> trim first element
//[3,3,4] >>> set sum to first element
package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumFirstTwo {
    public static int[] sum(int... array) {
        List<Integer> list = new ArrayList<>();
        if(array.length > 1) {
            int firstValue = array[0];
            int secondValue = array[1];
            int sum = firstValue + secondValue;
            int[] newArray = Arrays.copyOfRange(array, 1, array.length);
            newArray[0] = sum;
            int arraySum = IntStream.of(sum(newArray)).sum();
            list.add(arraySum);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
