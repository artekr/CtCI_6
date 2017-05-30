package Ch3_StackAndQueue._2_StackMin;

/**
 * Created by hengwang on 2017-05-30.
 */
public class MinStackTest {
  public static void main(String[] args) {

    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    System.out.println(minStack.min());           // --> Returns -3.
    System.out.println(minStack.pop());           // --> Returns -3.
    System.out.println(minStack.min());           // --> Returns -2.
  }
}
