package Ch1_ArraysAndStrings._3_URLify;

/**
 * Created by hengwang on 2017-05-24.
 */
public class URLifyTest {

  public static void main(String[] args) {

    // Given condition:
    // ** You may assume that the string has sufficient space at the end to hold the additional characters, **
    String s1 = "Mr John Smith    ";
    char[] str1 = s1.toCharArray();
    int trueLength1 = 13;

    String s2 = "I am Harry Potter      ";
    char[] str2 = s2.toCharArray();
    int trueLength2 = 17;

    System.out.println("Str1 Before: " + String.valueOf(str1));
    System.out.println("Str2 Before: " + String.valueOf(str2));

    URLify Test = new URLify();
    Test.replaceAllSpacesInString(str1, trueLength1);
    Test.replaceAllSpacesInString(str2, trueLength2);

    System.out.println("Str2 After: " + String.valueOf(str1));
    System.out.println("Str2 After: " + String.valueOf(str2));
  }
}
