## Problem Statement
* In this assignment, you'll be working on a function that generates the next lexicographical permutation of a given string.
* Your task is to implement the `nextPermutation` method in Java, which takes a string as input and returns the next lexicographically greater permutation of that string.
### Method Signature

```java
public static String nextPermutation(String word)
```

### Example
* If the input string is "abcd", the output should be "abdc" since it represents the next lexicographically greater permutation.
Guidelines
* Your implementation should be in Java.
* Use the method signature provided above; do not change the method name or parameters.
* Consider all characters in the input string to be unique.
* You can assume the input string consists of only lowercase alphabetic characters.
* Your function should return an empty string if there's no next permutation possible for the given input.
### How to Run
* You can test your implementation using a Java program. Here's an example of how you might use the nextPermutation method:

```java
public class Main {
    public static void main(String[] args) {
        String input = "abcd";
        String result = nextPermutation(input);
        System.out.println("Next permutation: " + result);
    }
}
```

* Replace `nextPermutation` with the actual name of your method.
* Then, compile and run the `Main` class to check if your function produces the correct output for different input strings.


### Sample Cases

1. **Test Case 1: Basic Case**
    - Input: "abcd"
    - Expected Output: "abdc"
    - Pattern: Testing a basic case where the input string has a next lexicographically greater permutation. Expects the method to return the correct next permutation.

2. **Test Case 2: String with the Largest Lexicographic Order**
    - Input: "dcba"
    - Expected Output: ""
    - Pattern: Verifying behavior when the input string is already at the largest lexicographic order. Expects an empty string as there's no greater permutation possible.

3. **Test Case 3: Random Input**
    - Input: "egcba"
    - Expected Output: "geabc"
    - Pattern: Evaluating a random input string to ensure the method generates the correct next lexicographical permutation.

4. **Test Case 4: String with Repeating Characters**
    - Input: "aabb"
    - Expected Output: "abab"
    - Pattern: Testing a string with repeating characters to verify if the method handles such cases and produces the correct next permutation.

5. **Test Case 5: Empty String**
    - Input: ""
    - Expected Output: ""
    - Pattern: Testing an empty string input to ensure the method handles edge cases appropriately and returns an empty string as expected.



```java
public class NextPermutationTest {
   @Test
   public void testNextPermutation() {
      // Test case 1: Basic case
      final String input1 = "abcd";
      final String expected1 = "abdc";
      assertEquals(expected1, NextPermutation.nextPermutation(input1));

      // Test case 2: String with the largest lexicographic order
      final String input2 = "dcba";
      final String expected2 = ""; // Since there's no larger permutation possible
      assertEquals(expected2, NextPermutation.nextPermutation(input2));

      // Test case 3: Random input
      final String input3 = "egcba";
      final String expected3 = "geabc";
      assertEquals(expected3, NextPermutation.nextPermutation(input3));

      // Test case 4: String with repeating characters
      final String input4 = "aabb";
      final String expected4 = "abab";
      assertEquals(expected4, NextPermutation.nextPermutation(input4));

      // Test case 5: Empty string
      final String input5 = "";
      final String expected5 = "";
      assertEquals(expected5, NextPermutation.nextPermutation(input5));
   }
}
```
