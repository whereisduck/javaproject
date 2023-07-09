package tree;

public class Main {
    public static void main(String[] args) {
        doSomething();
        Bst bst = new Bst();
        //System.out.println(bst.isEmpty());
        //bst.searchNode(0);
        /*
        bst.addNode(2);
        //bst.printTree(bst.getRoot());
        bst.addNode(3);
        bst.addNode(4);
        bst.addNode(5);
        bst.addNode(1);

         */

        bst.add(6);
        bst.add(4);
        bst.add(2);
        bst.add(5);
        bst.add(9);
        bst.add(8);
        bst.add(12);

        //bst.printTree(bst.getRoot());
        //bst.searchNode(0);
       // bst.printTree(bst.searchNode(3));
        //System.out.println(bst.getRoot().getData());
        //bst.delete(4);
        System.out.println(bst.getRoot().getData());
        bst.printTree(bst.getRoot());
        System.out.println();
        preOrder(bst.getRoot());
        System.out.println();
        inTraverse(bst.getRoot());
        System.out.println();
        postTraverse(bst.getRoot());




    }
    public static void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.getData() + ", ");
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
    }
    public static void inTraverse(Node root) {

        if (root == null) return;

        inTraverse(root.getLeftChild());
        System.out.print(root.getData() + ", ");
        inTraverse(root.getRightChild());

    }
    public static void postTraverse(Node root) {

        if (root == null) return;

        postTraverse(root.getLeftChild());
        postTraverse(root.getRightChild());
        System.out.print(root.getData() + ", ");

    }



    public static void doSomething() {
        Node result = new Node();
        if (result == null) {
            System.out.println("true");
        }else
            System.out.println("is empty");
        // success
    }
}









