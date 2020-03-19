package 递归;

//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
//关于子树和子结构
//https://www.nowcoder.com/questionTerminal/6e196c44c7004d15b1610b9afca8bd88?answerType=1&f=discussion
public class 判断是否是二叉树子结构 {

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null) {
            return false;
        }
        return judge(root1, root2) ||
                judge(root1.left, root2) ||
                judge(root1.right, root2);
    }

    public boolean judge(TreeNode root1, TreeNode root2) {
        if(root2 == null) {
            return true;
        }
        if(root1 == null) {
            return false;
        }
        if(root1.val != root2.val) {
            return judge(root1.left, root2) || judge(root1.right, root2);
        }
        return judge(root1.left, root2.left) && judge(root1.right, root2.right);
    }
}
