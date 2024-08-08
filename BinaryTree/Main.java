package BinaryTree;

public class Main {
	
	public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(6);
        tree.insert(4);
        tree.insert(7);
        tree.insert(2);
        tree.insert(5);
        tree.insert(1);
        tree.insert(3);
        tree.insert(9);
        tree.insert(8);

        System.out.println("In-order traversal:");
        tree.inOrder();

        System.out.println("\nPre-order traversal:");
        tree.preOrder();

        System.out.println("\nPost-order traversal:");
        tree.postOrder();
        
        Node predecessor = tree.findPredecessor(1); // Valor de exemplo
        if (predecessor != null) {
            System.out.println("O antecessor é: " + predecessor.getValue());
        } else {
            System.out.println("Não há antecessor.");
        }
    }

}
