package iteratorpattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TreeNode<String> root = new TreeNode<>("Root");
        TreeNode<String> child1 = new TreeNode<>("Child 1");
        TreeNode<String> child2 = new TreeNode<>("Child 2");
        TreeNode<String> child3 = new TreeNode<>("Child 3");
        TreeNode<String> grandChild1 = new TreeNode<>("Grandchild 1");
        TreeNode<String> grandChild2 = new TreeNode<>("Grandchild 2");

        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(child3);
        child3.addChild(grandChild1);
        child3.addChild(grandChild2);

        TreeCollection<String> tree = new TreeCollection<>(root);

        System.out.println("BFS Traversal:");
        Iterator<TreeNode<String>> bfsIterator = tree.getBFSIterator();
        while (bfsIterator.hasNext()) {
            System.out.println(bfsIterator.next().getValue());
        }

        System.out.println("\nDFS Traversal:");
        Iterator<TreeNode<String>> dfsIterator = tree.getDFSIterator();
        while (dfsIterator.hasNext()) {
            System.out.println(dfsIterator.next().getValue());
        }
    }
}
