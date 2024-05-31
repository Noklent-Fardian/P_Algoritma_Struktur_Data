package Percobaan1;

public class BinaryTree20 {
    Node20 root;
    int size;


    public BinaryTree20(){
        root = null;
    }
    boolean isEmpty(){
        return root != null;
    }
    
    void add (int data){
        if (!isEmpty()){
            root = new Node20(data);
        } else {
            Node20 current = root;
            while (true){
                if (data < current.data){
                    if (current.left != null){
                        current = current.left;
                    } else {
                        current.left = new Node20(data);
                        break;
                    }
                } else if (data > current.data){
                    if (current.right != null){
                        current = current.right;
                    } else {
                        current.right = new Node20(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find (int data){
        boolean result = false;
        Node20 current = root;
        while (current != null){
            if (current.data == data){
                result = true;
                break;
            } else if (data < current.data){
                current = current.left;
            } else if (data > current.data){
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node20 node){
        if (node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node20 node){
        if (node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node20 node){
        if (node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node20 getSuccessor(Node20 del){
        Node20 successor = del.right;
        Node20 successorParent = del;
        while (successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty");
            return;
        }
        Node20 parent = root;
        Node20 current = root;
        boolean isLeftChild = false;
        while (current != null){
            if (current.data == data){
                break;
            } else if (data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null){
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null){
                if (current == root){
                    root = null;
                } else {
                    if (isLeftChild){
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null){ //if there is 1 child (right)
                if (current == root){
                    root = current.right;
                } else {
                    if (isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null){ //if there is 1 child (left)
                if (current == root){
                    root = current.left;
                } else {
                    if (isLeftChild){
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //if there are 2 children
                Node20 successor = getSuccessor(current);
                if (current == root){
                    root = successor;
                } else {
                    if (isLeftChild){
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}
