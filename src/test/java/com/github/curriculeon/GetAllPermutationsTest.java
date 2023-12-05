package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GetAllPermutationsTest {


    // given
    private void test(String string, List<String> expected) {
        // when
        final List<String> actual = NextPermutation1.getAllPermutations(string);

        // then
//        Assert.assertEquals(expected.size(), actual.size());
        System.out.println(actual.toString());
    }

    @Test
    public void test1() {
        test("abc", Arrays.asList());
    }

    @Test
    public void test2() {
        test("abcd", Arrays.asList());
    }

    @Test
    public void test3() {
        test("abcde", Arrays.asList());
    }

}
