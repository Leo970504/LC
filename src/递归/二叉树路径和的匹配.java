package 递归;

import java.util.ArrayList;
import java.util.Stack;

/*
题目描述
输入一颗二叉树的根节点和一个整数，
打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */

public class 二叉树路径和的匹配 {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    Stack<Integer> s = new Stack<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) {
            return new ArrayList<>();
        }
        find(root, target, 0);
        return list;
    }

    public void find(TreeNode root, int target, int sum) {
        if(root == null && sum == target) {
            list.add(new ArrayList(s));
            return;
        }
        if(root == null) {
            return;
        }

        s.push(root.val);
        find(root.left, target, sum + root.val);
        s.pop();

        if(root.left == null && root.right == null) {
            return;
        }

        s.push(root.val);
        find(root.right, target, sum + root.val);
        s.pop();
    }
}
