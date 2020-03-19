package other;

import java.util.ArrayList;

/*
题目描述
给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class 二叉搜索树第k个节点 {

    ArrayList<TreeNode> list = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k) {
        treeToArray(pRoot);
        if(k >=1 && k <= list.size()) {
            return list.get(k - 1);
        }
        return null;
    }
    //中序便利
    void treeToArray(TreeNode pRoot) {
        if(pRoot != null) {
            treeToArray(pRoot.left);
            list.add(pRoot);
            treeToArray(pRoot.right);
        }
    }

}
