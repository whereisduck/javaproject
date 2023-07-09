package tree;

import java.util.ArrayList;
import java.util.List;

public class FindKMax {
    private static int counter = 0;
    public static void main(String[] args) {
        Bst bst = new Bst();
        bst.add(6);
        bst.add(4);
        bst.add(2);
        bst.add(5);
        bst.add(9);
        bst.add(8);
        bst.add(12);
        //int kMax = findKthMax(bst.getRoot(), 3);
        int kMax = findKmaxWrapper(bst.getRoot(),3);
        System.out.println(kMax);



    }


        public static int findKthMax(Node root, int k) {

            // Write - Your - Code
            List<Integer> result = new ArrayList();
            result = Inorder(root, result);



            return result.get(result.size()-k);
        }

        public static List<Integer> Inorder(Node root, List<Integer> result){
            if(root == null) return result;

            Inorder(root.getLeftChild(), result);
            result.add(root.getData());
            Inorder(root.getRightChild(), result);

            return result;
        }

        public static Node findKmaxRecursive(Node root, int k){
        //Node current = null;
        if (root==null){
            return null;
        }
        Node current = findKmaxRecursive(root.getRightChild(), k);
        if (counter != k){
            counter ++;
            current = root;
            System.out.println(current.getData());
        }

        if (counter == k){
            System.out.println(current.getData());

            return current;

        }
        return findKmaxRecursive(root.getLeftChild(), k);

        }
        /*
    static int helper(Node root, int k, int counter) {
        // checking the base case
        if (root == null || counter >= k)
            return -1;

        // calling the helper function for the right subtree.
        helper(root.getRightChild(), k , counter);

        // incrementing the counter.
        counter = counter + 1;

        // checking if the counter's value is the same as k.
        if (counter == k)
            return root.getData();

        // calling the helper function for the left subtree.
        helper(root.getLeftChild(), k , counter);
    }

         */
        public static int findKmaxWrapper(Node root, int k){
        Node result = findKmaxRecursive(root, k);
        if (result != null){
            return result.getData();
        }
        return -1;

        }




}
