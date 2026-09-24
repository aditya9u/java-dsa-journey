public class BinaryTreeDiameter {

        private static int diameterMax = 0;

        static class TreeNode {
            int value;
            TreeNode left;
            TreeNode right;
    
            TreeNode(int value) {
                this.value = value;
            }
        }
    
        static int diameter(TreeNode root) {
            diameterMax = 0;
            height(root);
            return diameterMax;
        }

        private static int height(TreeNode root) {
            if(root==null) return 0;
            int lh = height(root.left);
            int rh = height(root.right);

            int currentDia = lh + rh + 1;

            diameterMax = Math.max(currentDia,diameterMax);

            return Math.max(lh,rh)+1;
        }

    
        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
    
            System.out.println(diameter(root)); // Expected: 4
        }
}
