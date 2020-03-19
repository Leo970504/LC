package sort;

import java.util.ArrayList;

public class 中序遍历 {
    ArrayList<TreeNode> list = new ArrayList<>();
    void treeToArray(TreeNode pRoot) {
        if(pRoot != null) {
            treeToArray(pRoot.left);
            list.add(pRoot);
            treeToArray(pRoot.right);
        }
    }
}
