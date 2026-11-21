import java.util.Stack;

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

        Node visitedNode=null;
        Node curr=root;
        Stack <Node> st=new Stack<>();


        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
             st.push(curr);
             curr=curr.left;
            }else{
                Node peekNode=st.peek();

                if(peekNode.right !=null && visitedNode !=peekNode.right){
                      curr=peekNode.right;
                }else{
                    System.out.println(peekNode.data);
                    visitedNode=st.pop();
                }
            }

        }


    }
}