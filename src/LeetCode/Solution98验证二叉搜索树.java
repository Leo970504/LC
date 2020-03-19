package LeetCode;

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution98验证二叉搜索树 {

    ArrayList<Integer> res = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        treeToArray(root);
        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i) >= res.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private void treeToArray(TreeNode root) {
        if (root != null) {
            treeToArray(root.left);
            res.add(root.val);
            treeToArray(root.right);
        }
    }
}
