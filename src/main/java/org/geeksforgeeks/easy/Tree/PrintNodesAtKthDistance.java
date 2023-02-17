package org.geeksforgeeks.easy.Tree;

public class PrintNodesAtKthDistance {
    private static void nodeAtKDistance(Node node, int k) {
        if(node == null)
            return;
        if(k == 0)
            System.out.println(node.data);
        if(node!=null){
            nodeAtKDistance(node.left,k-1);
            nodeAtKDistance(node.right,k-1);
        }
    }
}
