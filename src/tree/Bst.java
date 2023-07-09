package tree;

public class Bst {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean isEmpty(){
        if (root==null){
            return true;
        } else
        return false;
    }
/*
    public boolean addNode(int value){
        if (isEmpty()){
            root = new Node(value);
            return true;
        }

        Node currentNode = root;
        while(currentNode !=null){
            Node leftChild = currentNode.getLeftChild();
            Node rightChild = currentNode.getRightChild();
            if (currentNode.getData() > value){
                if(leftChild==null){
                    leftChild = new Node(value);
                    currentNode.setLeftChild(leftChild);
                    return true;

                }else
                    currentNode = leftChild;
            }

            if (currentNode.getData() <= value){
                if(rightChild==null){
                    rightChild=new Node(value);
                    currentNode.setRightChild(rightChild);
                    return true;
                }else
                    currentNode = rightChild;
            }
        }


        return false;

    }

 */

    public Node recursiveInsert(Node currentNode, int value){
        if(currentNode==null){
            return currentNode = new Node(value);
        }
        if(currentNode.getData() > value){
            currentNode.setLeftChild(recursiveInsert(currentNode.getLeftChild(), value));
        }else if (currentNode.getData() < value) {
           currentNode.setRightChild( recursiveInsert(currentNode.getRightChild(), value));

        }else return currentNode;
        return currentNode;
    }
    public boolean add(int value) {

        root = recursiveInsert(this.root, value);
        return true;
    }


    public Node searchNode(int value){
        if(isEmpty()){
            System.out.println("is empty tree");
            return null;
        }
        Node currentNode = this.root;
        while(currentNode!= null){
            if(currentNode.getData() == value) return currentNode;
            if (currentNode.getData() > value)
                currentNode = currentNode.getLeftChild();
            else currentNode = currentNode.getRightChild();

        }

        System.out.println(value + " Not Found in the Tree");

        return null;

    }

    public void printTree(Node current){
        if (current == null){ return ;}
        System.out.print(current.getData()+ ",");
        printTree(current.getLeftChild());
        printTree(current.getRightChild());
    }

    public boolean delete(int value){
        if (this.root == null){
            System.out.println("the tree is empty");
            return false;
        }
        Node currentNode = this.root;
        Node parent = null;
        while(currentNode !=null && currentNode.getData() != value){
            parent = currentNode;
            if (currentNode.getData() > value){
                currentNode = currentNode.getLeftChild();
            }else
                currentNode = currentNode.getRightChild();

        }
        if (currentNode == null){
            System.out.println("cant find " + value);
            return false;}
        else if (currentNode.getLeftChild()==null && currentNode.getRightChild() == null){
            if(this.root.getData() == currentNode.getData()){
                setRoot(null);
                return true;
            } else {currentNode = (Node)null; return true;}
            /*
                else if(currentNode.getData() < parent.getData()){
                    parent.setLeftChild(null);
                    return true;
                }
                else{
                    parent.setRightChild(null);
                    return true;
                }

             */

        } else if(currentNode.getRightChild()==null){
            if(this.root.getData() == currentNode.getData()){
                setRoot(currentNode.getLeftChild());
                return true;
            }
            else if(currentNode.getData()< parent.getData()){
                parent.setLeftChild(currentNode.getLeftChild());
                return true;
            } else {
                parent.setRightChild(currentNode.getLeftChild());
                return true;
            }
        }else if(currentNode.getLeftChild() == null){
            if (this.root.getData() == currentNode.getData()){
                setRoot(currentNode.getRightChild());
                return true;
            } else if(currentNode.getData() < parent.getData()){
                parent.setLeftChild(currentNode.getRightChild());
                return true;

            }else{ parent.setRightChild(currentNode.getRightChild());
                return true;

        }
        }else {
            Node leayNode = findLeastNode(currentNode.getRightChild());
            int temp = leayNode.getLeftChild().getData();
            currentNode.setData(temp);
            leayNode.setLeftChild(null);
            return true;
            }

    }



    private Node findLeastNode(Node rightChild) {
        Node temp = null;
        while (rightChild.getLeftChild() != null){
            temp = rightChild;
            rightChild = rightChild.getLeftChild();
        }
        return temp;
    }


}
