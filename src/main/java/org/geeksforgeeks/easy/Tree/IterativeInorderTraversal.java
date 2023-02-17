package org.geeksforgeeks.easy.Tree;

public class IterativeInorderTraversal {

    public static void iterativeInorderTraversal(Node node){
        if(node!=null){
            iterativeInorderTraversal(node.left);
            System.out.println(node.data);
            iterativeInorderTraversal(node.right);
        }
    }
}
