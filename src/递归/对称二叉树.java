package 递归;

/*
题目描述
请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */

public class 对称二叉树 {
    boolean isSymmetrical(TreeNode pRoot) {
        return pRoot == null ? true : judge(pRoot.left, pRoot.right);
    }

    boolean judge(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }else if(left == null || right ==null) {
            return false;
        }
        if(left.val != right.val) {
            return false;
        }else {
            return judge(left.left, right.right) && judge(left.right, right.left);
        }
    }
}
