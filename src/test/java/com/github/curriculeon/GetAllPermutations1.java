package com.github.curriculeon;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GetAllPermutations1 {


    // given
    private void test(String string, List<String> expected) {
        // when
        final Collection<String> actual = NextPermutation1.getAllPermutations(string);

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

    @Test
    public void test4() {
        test("abcdef", Arrays.asList());
    }

    @Test
    public void test5() {
        test("abcdefg", Arrays.asList());
    }

    @Test
    public void test6() {
        test("abcdefgh", Arrays.asList());
    }

    @Ignore
    @Test
    public void test7() {
        test("abcdefghij", Arrays.asList());
    }



}
