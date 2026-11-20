import java.util.*;

class A{
    public static void main(String args[]){

        class Node{
            int data;
            Node left ,right;



            Node(int data){
                 this.data=data;
            }
        }

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        root.right.left=new Node(6);
        root.right.right=new Node(7);



     Stack<Node> st1 = new Stack<>();
     Stack<Node> st2 = new Stack<>();

     st1.push(root);
     while(!st1.isEmpty()){

        Node curr=st1.pop();
        st2.push(curr);

        if(curr.left!=null){
            st1.push(curr.left);
        }

        if(curr.right!=null){
             st1.push(curr.right);
        }

        
     }
     while(!st2.isEmpty()){
   System.out.println(st2.pop().data);
        }

    }

}