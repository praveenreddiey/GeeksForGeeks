package org.geeksforgeeks.easy.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void levelOrderTraversal(Node node){
        Queue<Node> queue=  new LinkedList<>();
        queue.add(node);
        while(queue.isEmpty() == false){
            Node tempNode = queue.poll();
            System.out.print(tempNode.data+" ");

            /*Enqueue left child */
            if(tempNode.left != null){
                queue.add(tempNode.left);
            }
            /*Enqueue right child */
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }

    }
}
