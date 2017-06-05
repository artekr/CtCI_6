package Ch4_TreeAndGraph;

/**
 * Created by hengwang on 2017-05-31.
 *
 */

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  public static void printBinaryTree(TreeNode root) {
    if (root != null) {
      printBinaryTree(root.left);
      System.out.println(root.val);
      printBinaryTree(root.right);
    }
  }

}
