import java.util.*;

class A{
    public static void main(String args[]){

      class Node{
            int data;
            Node left,right;


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

    Stack<Node> st = new Stack<>();

        Node curr=root;

        while(true){

            if(curr!=null){
              st.push(curr);
              curr=curr.left;
            }else{ 
                if(st.isEmpty()){
              break;
            }
            curr=st.pop();

            System.out.println(curr.data);
            curr=curr.right;
        }
        }

    

    }
}