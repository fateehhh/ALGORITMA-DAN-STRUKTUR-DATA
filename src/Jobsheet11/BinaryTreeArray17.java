package Jobsheet11;

public class BinaryTreeArray17 {
    int[] data;
    int idxLast;

    public BinaryTreeArray17(){
        data = new int[10]; 
    }
    void populatedData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2 );
        }
    }
}
