package Ch1_ArraysAndStrings._4_PalindromePermutation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hengwang on 2017-05-24.
 *
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 *
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 *
 */
public class PalindromePermutation {

  /**
   * Using a HashMap to store all the characters and its number of appearance
   * @param s
   * @return
   */
  public boolean isPermutationOfPalindrome_HashMap(String s) {

    if (s == "") {
      return true;
    }

    // Put each character into a HashMap, character as key, number of appearance as value
    HashMap<Character, Integer> map = new HashMap<>();
    for (Character c: s.toLowerCase().toCharArray()) {
      if (map.containsKey(c)) {
        map.put(c, map.get(c)+1);
      } else {
        map.put(c, 1);
      }
    }

    // Iterate through the HashMap, number of appearance of each character should be even, or just once (character in the middle)
    // And there should be allowed only one character appears once.
    int oneCount = 0;
    for (Map.Entry e: map.entrySet()) {
      int val = (int)e.getValue();
      if (val % 2 != 0) {
        if (val != 1) {
          return false;
        } else {
          oneCount++;
        }
      }
    }
    // If more than one character appears once.
    return oneCount <= 1;
  }




}
