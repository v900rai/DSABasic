package AdvancedDataStructureInJava;

public class  SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, they are the same
        if (p == null && q == null) {
            return true;
        }
        // If one of the nodes is null and the other is not, they are not the same
        if (p == null || q == null) {
            return false;
        }
        // If the values of the nodes are different, they are not the same
        if (p.val != q.val) {
            return false;
        }
        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        SameTree checker = new SameTree();

        // Example trees
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        boolean result = checker.isSameTree(tree1, tree2);
        System.out.println(result); // Output: true
    }
}
