package Ch1_ArraysAndStrings._1_IsUnique;

import java.util.HashSet;

/**
 * Created by hengwang on 2017-05-24.
 *
 * Is Unique: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 *
 * You should first ask your interviewer if the string is an ASCII string or a Unicode string.
 * Asking this question will show an eye for detail and a solid foundation in computer science.
 */
public class CheckStringUniqueCharacters {

  public boolean isUnique_HashSet(String s) {
    // Create a HashMap, put a Character in s as the key and the counter of the Character as the value
    HashSet<Character> set = new HashSet<>();

    // Iterating the String characters and updating the hashmap
    for (Character c: s.toCharArray()) {
      if (set.contains(c)) {
        return false;
      } else {
        set.add(c);
      }
    }
    return true;
  }

  // Brute Force
  public boolean isUnique_BruteForce(String s) {
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
          return false;
        }
      }
    }
    return true;
  }


  /**
   * Assume for simplicity the character set is ASCII.
   * Clarify your assumptions with your interviewer weather it is a 128-character alphabet, or extended ASCII with 256 characters.
   */
  public boolean isUnique_BooleanArray(String s) {
    if (s.length() > 128) {
      return false;
    }

    boolean[] char_set = new boolean[128];
    for (int i = 0; i < s.length(); i++) {
      // IMPORTANT:Java allows auto-casting from a smaller to a higher type.
      // A char is simply an unsigned 16-bit number, so since it's basically a subset of the int type,
      // the JVM can cast it without any ambiguity.
      int val = s.charAt(i);
      if (char_set[val]) { //Already found this char in string
        return false;
      }
      char_set[val] = true;
    }
    return true;
  }

  // Reduce our space usage by a  ctor of eight by using a bit vector.
  // Assume that the string only uses the lowercase letters a through z.
  // This will allow us to use just a single int

  // 1 << val:  Mark the relative position to 'a' to 1

  public boolean isUnique_BitVector(String s) {
    int checker = 0;
    for (int i = 0; i < s.length(); i++) {
      int val = s.charAt(i) - 'a';
      if ((checker & (1 << val)) > 0) {
        return false;
      }
      // Remember all the appeared characters and mark them to '1'
      checker |= (1 << val);
    }
    return true;
  }

}
