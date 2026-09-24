public class MaximumDepth {

    // Definition for a binary tree node
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }

    // Write your solution here
    static int maxDepth(TreeNode root) {
        // TODO: implement
        // Time complexity : O(n)
        // Space complexity : O(n)
        
        
        if(root==null){
            return 0;
        }
        int l = maxDepth(root.left);
        int m = maxDepth(root.right);
        return Math.max(m,l)+1;
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

        int result = maxDepth(root);

        System.out.println("Maximum depth: " + result);
    }
}