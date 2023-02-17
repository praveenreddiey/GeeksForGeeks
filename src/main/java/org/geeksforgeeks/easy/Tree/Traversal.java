package org.geeksforgeeks.easy.Tree;

public class Traversal {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(20);
        node.left.left = new Node(40);
        node.left.right = new Node(50);
        node.right = new Node(30);
        node.right.right = new Node(70);
        // LevelOrderTraversal.levelOrderTraversal(node);
        //System.out.println(SizeOfBinaryTree.sizeOfTree(node));
        //System.out.println(height(node));
        //System.out.println(MaxInTree.max(node));
        IterativeInorderTraversal.iterativeInorderTraversal(node);
    }
    public static void inorder(Node node){
        if(node!=null){
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }
    public static void preorder(Node node){
        if(node!=null){
            System.out.print(node.data+ " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    public static void postorder(Node node){
        if(node!=null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data+ " ");

        }
    }
}
class Node{
    Node left;
    Node right;
    int data;
    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", data=" + data +
                '}';
    }
}
