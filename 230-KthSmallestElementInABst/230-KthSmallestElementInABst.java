// Last updated: 7/9/2026, 9:58:16 AM

class Solution {
    static int count;
    static int ans;

    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        ans = -1;
        inorder(root, k);
        return ans;
    }

    public static boolean inorder(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (inorder(root.left, k)) {
            return true;
        }
        count++;
        if (count == k) {
            ans = root.val;
            return true;
        }
        if (inorder(root.right, k)) {
            return true;
        }
        return false;
    }
}