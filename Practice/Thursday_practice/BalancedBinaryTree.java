public class BalancedBinaryTree {

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }

    static boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }
    
    private static int height(TreeNode root) {
        // Write your solution here
        if(root==null) return 0;
        int lh = height(root.left);
        if(lh==-1)return -1;
        int rh = height(root.right);
        if(rh==-1)return -1;

        if(Math.abs(lh-rh)>1) return -1;

        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              /
             4

            Expected output: 3
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        boolean result = isBalanced(root);

        System.out.println("Maximum depth: " + result);
    }
    
}
