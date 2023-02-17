package org.geeksforgeeks.easy.Tree;

public class MaxInTree {
    public static int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(node.data,Math.max(max(node.left),max(node.right)));
    }

}
