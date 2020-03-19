package 递归;

import java.util.ArrayList;

/*
题目描述
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

思路：
中序遍历二叉树，然后用一个ArrayList类保存遍历的结果，这样在ArratList中节点就按顺序保存了，然后再来修改指针
 */

public class 二叉搜索树转化双向链表 {
    public class Solution {
        public TreeNode Convert(TreeNode pRootOfTree) {
            ArrayList<TreeNode> list = new ArrayList<>();
            if(pRootOfTree == null) {
                return null;
            }
            treeToArray(pRootOfTree, list);
            int i = 0;
            while(i < list.size()) {
                list.get(i).left = i < 1 ? null : list.get(i-1);
                list.get(i).right = i == list.size() -1  ? null : list.get(i+1);
                i++;
            }
            return list.get(0);
        }

        public void treeToArray(TreeNode root, ArrayList<TreeNode> list) {
            if(root.left != null) {
                treeToArray(root.left, list);
            }
            list.add(root);
            if(root.right != null) {
                treeToArray(root.right, list);
            }
        }

    }
}
