package Ch1_ArraysAndStrings._2_CheckPermutation;

/**
 * Created by hengwang on 2017-05-24.
 */
public class CheckPermutationTest {
  public static void main(String[] args) {

    String s1 = "abcde";
    String s2 = "cdeba";
    String s3 = "cdebf";
    String s4 = "cdebfa";

    CheckPermutation Test = new CheckPermutation();

    System.out.println(Test.checkPermutation_TwoSortedArrays(s1, s2)); // true
    System.out.println(Test.checkPermutation_TwoSortedArrays(s2, s3)); // false

    System.out.println(Test.checkPermutation_CharSum(s1, s2)); // true
    System.out.println(Test.checkPermutation_CharSum(s3, s4)); // false

    System.out.println(Test.checkPermutation_NumberOfChars(s1, s2)); // true
    System.out.println(Test.checkPermutation_NumberOfChars(s1, s4)); // false

  }
}
