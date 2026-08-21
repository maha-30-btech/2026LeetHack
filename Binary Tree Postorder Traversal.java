import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisitedNode = null;

        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode peekNode = stack.peek();
                if (peekNode.right != null && lastVisitedNode != peekNode.right) {
                    curr = peekNode.right;
                } else {
                    result.add(peekNode.val);
                    lastVisitedNode = stack.pop();
                }
            }
        }

        return result;
    }
}
