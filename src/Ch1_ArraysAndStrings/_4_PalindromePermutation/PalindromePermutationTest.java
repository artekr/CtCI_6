package Ch1_ArraysAndStrings._4_PalindromePermutation;

/**
 * Created by hengwang on 2017-05-24.
 */
public class PalindromePermutationTest {

  public static void main(String[] args) {

    String s1 = "TactCoa";
    String s2 = "Tac4t co@A @4";
    String s3 = "Tac4t co@A @4s";

    PalindromePermutation Test = new PalindromePermutation();
    System.out.println(Test.isPermutationOfPalindrome_HashMap(s1)); // Expected: true

    System.out.println(Test.isPermutationOfPalindrome_HashMap(s2)); // Expected: true

    System.out.println(Test.isPermutationOfPalindrome_HashMap(s3)); // Expected: false

  }
}
