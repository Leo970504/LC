package other;

public class 序列化二叉树 {
    int index = -1;
    String Serialize(TreeNode root) {
        if(root == null) {
            return "#";
        }else {
            return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
        }
    }

    TreeNode Deserialize(String str) {
        String[] s = str.split(",");
        int len = s.length;
        index++;
        if(index > len) return null;
        TreeNode node = null;
        if(!"#".equals(s[index])) {
            node = new TreeNode(Integer.parseInt(s[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
