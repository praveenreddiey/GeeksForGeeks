package org.geeksforgeeks.easy.Tree;

public class SizeOfBinaryTree {

    public static int sizeOfTree(Node root){
        if(root == null)
            return 0;

        return 1+sizeOfTree(root.left)+sizeOfTree(root.right);



    }
}
