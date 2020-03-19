package sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class 广度优先遍历 {
    public void breadthFirst(TreeNode root) {
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            //分层打印
            for(int i=0; i<size; i++) {
                TreeNode node = queue.get(0);
                queue.remove(0);
                System.out.print(node.val + " ");
                System.out.println( node.val + " ");
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            System.out.println();
        }
    }
}
