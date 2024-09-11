package iteratorpattern;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

class DFSIterator<T> implements Iterator<TreeNode<T>> {
    private Stack<TreeNode<T>> stack;

    public DFSIterator(TreeNode<T> root) {
        stack = new Stack<>();
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public TreeNode<T> next() {
        TreeNode<T> currentNode = stack.pop();
        List<TreeNode<T>> children = currentNode.getChildren();

        for (int i = children.size() - 1; i >= 0; i--) {
            stack.push(children.get(i));
        }
        return currentNode;
    }
}
