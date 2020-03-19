package other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//从上往下打印出二叉树的每个节点，同层节点从左至右打印。
//宽度优先搜索BFS
public class 打印二叉树 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node == null) {
                continue;
            }
            list.add(node.val);
            queue.add(node.left);
            queue.add(node.right);
        }
        return list;
    }
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
