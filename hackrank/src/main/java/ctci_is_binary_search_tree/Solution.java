package ctci_is_binary_search_tree;

/**
 * Created by ychai on 5/17/17.
 *
 * https://www.hackerrank.com/challenges/ctci-is-binary-search-tree?h_r=next-challenge&h_v=zen
 */
public class Solution {
    static public void main(String[] args) {

    }

    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {
        if (root == null) {
            return true;
        }

        return allNodeSmallerThan(root.left, root.data) && allNodeBiggerThan(root.right, root.data)
                && checkBST(root.left) && checkBST(root.right);
    }

    boolean allNodeSmallerThan(Node root, int value) {
        if (root == null) {
            return true;
        }

        return root.data < value && allNodeSmallerThan(root.left, value)
                && allNodeSmallerThan(root.right, value);
    }

    boolean allNodeBiggerThan(Node root, int value) {
        if (root == null) {
            return true;
        }

        return root.data > value && allNodeBiggerThan(root.left, value)
                && allNodeBiggerThan(root.right, value);
    }
}
