package Ch3_StackAndQueue._2_StackMin;

import java.util.Stack;

/**
 * Created by hengwang on 2017-05-30.
 *
 * Use int as the data
 */
public class MinStack {

  int min;
  Stack<Integer> stack;

  public MinStack() {
    min = Integer.MAX_VALUE;
    stack = new Stack<>();
  }

  /**
   * Push the min first if it is grater or equal than the data
   * @param data
   */
  public void push(int data) {
    if (data <= min) {
      stack.push(min);
      min = data;
    }
    stack.push(data);
  }

  /**
   * If it is the min, pop one more
   * @return
   */
  public int pop() {
    int val = stack.pop();
    if (val == min) {
      // Pop one more as it is the min
      min = stack.pop();
    }
    return val;
  }

  /**
   *
   * @return
   */
  public int min() {
    return min;
  }

}
