package LeetCode剑指Offer;

public class Solution25树的子结构 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null || A == null) {
            return false;
        }
        if(A.val != B.val) {
            return isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }
        return checkSub(A.right, B.right) && checkSub(A.left, B.left);
    }

    public boolean checkSub(TreeNode A, TreeNode B) {
        if(B == null) {
            return true;
        }
        if(B != null && A == null) {
            return false;
        }
        if(A.val != B.val) {
            return false;
        }
        if(A.val == B.val) {
            return checkSub(A.left, B.left) && checkSub(A.right, B.right);
        }
        return false;
    }
}
