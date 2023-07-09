package tree;

public class FindAncestors {

    public static void main(String[] args) {
        Bst bst = new Bst();
        bst.add(6);
        bst.add(4);
        bst.add(2);
        bst.add(5);
        bst.add(9);
        bst.add(8);
        bst.add(12);
        String result = helper(bst.getRoot(), 8);
        System.out.println(result);
    }


    public static String helper(Node node, int k){
        String result = "";
        Node temp = node;
        while(temp != null ){
            result = result + temp.getData() + ",";
            if (temp.getData()==k){
                return result;
            }else if (temp.getData() > k){
                temp = temp.getLeftChild();

            }else {
                temp = temp.getRightChild();
            }

        }
        return "not found";
    }

    public static String findAllAn(Node root, int target){

        String result = "";
        while (root != null){
            result += root.getData();
            if (target  > root.getData()){
                root = root.getRightChild();
            }else if (target < root.getData()){
                root = root.getLeftChild();
            }else return result;
        }
        return result;



    }

}
