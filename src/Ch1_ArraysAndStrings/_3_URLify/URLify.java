package Ch1_ArraysAndStrings._3_URLify;

/**
 * Created by hengwang on 2017-05-24.
 *
 * Write a method to replace all spaces in a string with '%20'
 * ** You may assume that the string has sufficient space at the end to hold the additional characters, **
 * and that you are given the "true" length of the string.
 * (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
 *
 * EXAMPLE
 * Input: "Mr John Smith ", 13
 * Output: "Mr%20John%20Smith"
 *
 * Note: We are using character arrays, because Java strings are immutable.
 *       If we used strings directly, the function would have to return a new copy of the string.
 */
public class URLify {

  public void replaceAllSpacesInString(char[] str, int trueLength) {

    int spaceCounts = 0;

    for (int i = 0; i < trueLength; i++) {
      if (str[i] == ' ') {
        spaceCounts++;
      }
    }

    int newLength = trueLength + 2 * spaceCounts;
    if (trueLength < str.length) str[trueLength] = '\0';
    for (int i = trueLength - 1; i >= 0; i--) {
      if (str[i] == ' ') {
        str[newLength - 1] = '0';
        str[newLength - 2] = '2';
        str[newLength - 3] = '%';
        newLength -= 3;
      } else {
        str[newLength - 1] = str[i];
        newLength--;
      }
    }
  }
}

/**
 * 1. Count the total spaces in a string in one iteration, say the count is spaceCount
 * 2. Calculate the new length of a string by newLength = length + 2 * spaceCount;
 *    (we need two more places for each space since %20 has 3 characters,
 *    one character will occupy the blank space and for rest two we need extra space)
 * 3. Do another iteration in reverse direction
 * 4. If you encounter the space, for next 3 spaces put 0,2,%.
 * 5. If you encounter the character, copy it
 */