package com.github.curriculeon;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class NextPermutationTest {

    // given
    private void test(String string, List<String> expected) {
        // when
        final List<String> actual = NextPermutation1.getAllPermutations(string);

        // then
        Assert.assertEquals(expected.size(), actual.size());
        for(String expectedString : expected) {
            Assert.assertTrue(actual.contains(expectedString));
        }
    }

    public void test1() {
        test("aaa", Arrays.asList("aaa"));
    }
    public void test2() {
        test("aaa", Arrays.asList("aaa"));
    }

}
