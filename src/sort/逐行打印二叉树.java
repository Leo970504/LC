package sort;
/*
题目描述
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */

import java.util.ArrayList;

public class 逐行打印二叉树 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<TreeNode> temp = new ArrayList<>();
        if (pRoot == null) {
            return new ArrayList<>();
        }
        temp.add(pRoot);
        while (!temp.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int len = temp.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = temp.get(0);
                temp.remove(0);
                list.add(node.val);
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            result.add(list);
        }
        return result;
    }
}
