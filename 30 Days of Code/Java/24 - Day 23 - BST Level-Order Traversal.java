import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    // Function to print level order traversal of a given binary tree
    static void levelOrder(Node root) {

        // create an empty queue and enqueue the root node
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        // to store the current node
        Node curr;

        // loop till queue is empty
        while (!queue.isEmpty()) {
            // process each node in the queue and enqueue their
            // non-empty left and right child
            curr = queue.poll();

            System.out.print(curr.data+" ");
            if (curr.left != null) {
                queue.add(curr.left);
            }

            if (curr.right != null) {
                queue.add(curr.right);
            }

        }


    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
