package Ch1_ArraysAndStrings._1_IsUnique;

/**
 * Created by hengwang on 2017-05-24.
 */
public class CheckStringUniqueCharactersTest {

  public static void main(String[] args) {

    String s1 = "abcdefg";
    String s2 = "abcdafg";
    String s3 = "afcdafg";

    CheckStringUniqueCharacters Test = new CheckStringUniqueCharacters();

    System.out.println(Test.isUnique_HashSet(s1));
    System.out.println(Test.isUnique_HashSet(s2));
    System.out.println(Test.isUnique_HashSet(s3));

    System.out.println(Test.isUnique_BruteForce(s1));
    System.out.println(Test.isUnique_BruteForce(s2));
    System.out.println(Test.isUnique_BruteForce(s3));

    System.out.println(Test.isUnique_BooleanArray(s1));
    System.out.println(Test.isUnique_BooleanArray(s2));
    System.out.println(Test.isUnique_BooleanArray(s3));

    System.out.println(Test.isUnique_BitVector(s1));
    System.out.println(Test.isUnique_BitVector(s2));
    System.out.println(Test.isUnique_BitVector(s3));

  }
}
