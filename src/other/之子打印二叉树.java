package other;

import java.util.ArrayList;
/*
题目描述
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class 之子打印二叉树 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot == null) {
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        int depth = 1;
        queue.add(pRoot);
        while(!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode temp = queue.get(0);
                queue.remove(0);
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
                if(depth % 2 == 1) list.add(temp.val);
                if(depth % 2 == 0) list.add(0, temp.val);
            }
            result.add(list);
            depth++;
        }
        return result;
    }
}
