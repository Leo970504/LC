package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Solution113路径总和II {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> inner = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null) return new ArrayList<>();
        sum = sum - root.val;
        inner.add(root.val);
        if(root.left == null && root.right == null) {
            if(sum == 0) {
                res.add(new ArrayList(inner));
            }
        }
        if(root.left != null) pathSum(root.left, sum);
        if(root.right != null) pathSum(root.right, sum);
        inner.remove(inner.size() - 1);
        return res;
    }
}
