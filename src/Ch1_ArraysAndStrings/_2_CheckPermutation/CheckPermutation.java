package Ch1_ArraysAndStrings._2_CheckPermutation;

import java.util.Arrays;

/**
 * Created by hengwang on 2017-05-24.
 *
 * Given two strings,write a method to decide if one is a permutation of the other.
 * For example, "abc" have the following permutations: "abc", "acb", "bac", "bca", "cab" and "cba".
 */
public class CheckPermutation {

  /**
   * Sort two strings and compare
   * @param s1
   * @param s2
   * @return
   */
  public boolean checkPermutation_TwoSortedArrays(String s1, String s2) {
    // Length should be the same
    if (s1.length() != s1.length()) {
      return false;
    }

    // Put s1 to a char[] and sort it
    char[] list1 = s1.toCharArray();
    Arrays.sort(list1);

    // Put s2 to a char[] and sort it
    char[] list2 = s2.toCharArray();
    Arrays.sort(list2);

    // Compare the two sorted char array
    /*
    for (int i = 0; i < s1.length(); i++) {
      if (list1[i] != list2[i]) {
        return false;
      }
    }

    return true;
    */

    // Comvert the sorted char array to String first
    String sortedS1 = new String(list1);
    String sortedS2 = new String(list2);

    return sortedS1.equals(sortedS2);
  }

  /**
   * Add the value of all characters in ASCII of the string and compare
   * @param s1
   * @param s2
   * @return
   */
  public boolean checkPermutation_CharSum(String s1, String s2) {
    // Length should be the same
    if (s1.length() != s1.length()) {
      return false;
    }

    // Calculate the sum of all the characters as the value of as ASCII in string.
    int sum1 = 0;
    for (char c: s1.toCharArray()) {
      sum1 += c;
    }
    int sum2 = 0;
    for (char c: s2.toCharArray()) {
      sum2 += c;
    }

    // If the two sums are equal, means they have identical number of characters
    if (sum1 == sum2) {
      return true;
    }

    return false;
  }

  /**
   * Compare the number of each character in two strings
   * @param s1
   * @param s2
   * @return
   */
  public boolean checkPermutation_NumberOfChars(String s1, String s2) {
    // Length should be the same
    if (s1.length() != s1.length()) {
      return false;
    }

    int[] letters = new int[128]; // Assumption, string only contains standard ASCII.
    for (char c: s1.toCharArray()) {
      // Here char automatically conver to int
      letters[c]++;
    }

    for (int i = 0; i < s2.length(); i++) {
      int c = s2.charAt(i);
      letters[c]--;
      if (letters[c] < 0) {
        return false;
      }
    }
    return true;
  }

}
