package org.geeksforgeeks.easy.Tree;

public class Height {
    public static int height(Node node){
        if(node == null)
            return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
}
