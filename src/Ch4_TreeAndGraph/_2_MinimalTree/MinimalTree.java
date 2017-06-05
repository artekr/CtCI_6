package Ch4_TreeAndGraph._2_MinimalTree;

import Ch4_TreeAndGraph.TreeNode;

/**
 * Created by hengwang on 2017-06-04.
 */
public class MinimalTree {

  public TreeNode createMinimalBST(int array[]) {
    return buildMinimalBST(array, 0, array.length - 1);
  }

  /**
   * 1. Insert into the tree the middle element of the array.
   * 2. Insert (into the left subtree) the left subarray elements.
   * 3. Insert (into the right subtree) the right subarray elements.
   * 4. Recurse.
   *
   * @param array
   * @param start
   * @param end
   * @return The root Tree Node
   */
  private TreeNode buildMinimalBST(int array[], int start, int end) {

    if (end < start) {
      return null;
    }

    int mid = (start + end) / 2;
    TreeNode root = new TreeNode(array[mid]);
    root.left = buildMinimalBST(array, start, mid - 1);
    root.right = buildMinimalBST(array, mid + 1, end);

    return root;
  }

}
