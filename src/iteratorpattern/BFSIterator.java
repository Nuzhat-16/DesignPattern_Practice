package iteratorpattern;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class BFSIterator<T> implements Iterator<TreeNode<T>> {
    private Queue<TreeNode<T>> queue;

    public BFSIterator(TreeNode<T> root) {
        queue = new LinkedList<>();
        queue.add(root);
    }
    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
    @Override
    public TreeNode<T> next() {
        TreeNode<T> currentNode = queue.poll();
        queue.addAll(currentNode.getChildren());
        return currentNode;
    }
}

