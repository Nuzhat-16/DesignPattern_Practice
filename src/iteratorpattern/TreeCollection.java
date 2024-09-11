package iteratorpattern;

import java.util.Iterator;

class TreeCollection<T> {
    private TreeNode<T> root;

    public TreeCollection(TreeNode<T> root) {
        this.root = root;
    }

    public Iterator<TreeNode<T>> getBFSIterator() {
        return new BFSIterator<>(root);
    }

    public Iterator<TreeNode<T>> getDFSIterator() {
        return new DFSIterator<>(root);
    }
}

