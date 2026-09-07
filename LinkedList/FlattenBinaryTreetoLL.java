package LinkedList;

public class FlattenBinaryTreetoLL {
    static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
    // public static void flatten(TreeNode root) {
    //     while(root != null) {
    //         if(root.left != null) {
    //             TreeNode  rightSubtree = root.right;

    //             root.right = root.left;
    //             root.left = null;

    //             TreeNode current = root.right;
    //             while(current.right != null) {
    //                 current = current.right;
    //             }

    //             current.right = rightSubtree;
    //         }

    //         root = root.right;
    //     }
    // }

    static TreeNode prev = null;

     //  Method -> Morris Style idea
     public static void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;

        prev = root;
     }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        
        a.left = b; a.right = e;
        b.left = c; b.right = d;
        e.left = null; e.right = f;

        flatten(a);
        TreeNode current = a;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.right;
        }
    }
}
