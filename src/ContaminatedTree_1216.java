import java.util.HashSet;
import java.util.Set;

public class ContaminatedTree_1216 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private Set<Integer> values;

    public ContaminatedTree_1216(TreeNode root){
        values = new HashSet<>();
        recoverTree(root, 0);
    }

    public void recoverTree(TreeNode node, int value){
        if(node == null){
            return;
        }

        node.val = value;
        values.add(value);
        recoverTree(node.left, 2*value + 1);
        recoverTree(node.right, 2 * value + 2);
    }

    public boolean find(int target){
        return values.contains(target);
    }
}
