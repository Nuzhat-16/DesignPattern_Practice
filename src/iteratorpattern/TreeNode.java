package iteratorpattern;

import java.util.ArrayList;
import java.util.List;

class TreeNode<T> {
    T value;
    List<TreeNode<T>> children;
    public TreeNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
    public void addChild(TreeNode<T> child) {
        this.children.add(child);
    }

    public T getValue() {
        return value;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }
}
