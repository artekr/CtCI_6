package Ch4_TreeAndGraph._2_MinimalTree;

import Ch4_TreeAndGraph.TreeNode;

/**
 * Created by hengwang on 2017-06-04.
 */
public class MinimalTreeTest {

  public static void main(String[] args) {

    int[] nodeArray = {2, 4, 5, 7, 10, 11, 13};

    MinimalTree Test = new MinimalTree();
    TreeNode root = Test.createMinimalBST(nodeArray);
    System.out.println("root : " + root.val);
    TreeNode.printBinaryTree(root); // Expected: 2, 4, 5, 7, 10, 11, 13
  }
}
