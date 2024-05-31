package Jobsheet11;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
    BinaryTreeArray17 bta = new BinaryTreeArray17();
    int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
    int idxLast = 6;
    bta.populatedData(data, idxLast);
    System.out.print("\nInOrder Traversal: ");
    bta.traverseInOrder(0);
    System.out.println("\n");
    }
}
