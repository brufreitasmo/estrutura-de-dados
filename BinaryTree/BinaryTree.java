package BinaryTree;

public class BinaryTree {
	
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.getValue()) {
            root.setLeft(insertRec(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insertRec(root.getRight(), value));
        }

        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.getLeft());
            System.out.print(root.getValue() + " ");
            inOrderRec(root.getRight());
        }
    }


    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.getValue() + " ");
            preOrderRec(root.getLeft());
            preOrderRec(root.getRight());
        }
    }


    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.getLeft());
            postOrderRec(root.getRight());
            System.out.print(root.getValue() + " ");
        }
    }
    
    private Node findNode(Node root, int value) {
        if (root == null) return null;
        if (value < root.getValue()) return findNode(root.getLeft(), value);
        if (value > root.getValue()) return findNode(root.getRight(), value);
        return root;
    }

    public Node findPredecessor(int value) {
        Node node = findNode(root, value);
        if (node == null) return null; 

        if (node.getLeft() != null) {
            Node predecessor = node.getLeft();
            while (predecessor.getRight() != null) {
                predecessor = predecessor.getRight();
            }
            return predecessor;
        }

        Node predecessor = null;
        Node current = root;
        while (current != null) {
            if (value < current.getValue()) {
                current = current.getLeft();
            } else if (value > current.getValue()) {
                predecessor = current;
                current = current.getRight();
            } else {
                break;
            }
        }

        return predecessor;
    }

}
