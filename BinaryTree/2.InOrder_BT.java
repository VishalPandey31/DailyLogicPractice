class A{
    
public static void main(String args[]){

    class Node{
        

        int data;
        Node left;
        Node right;

        Node(int data){
         this.data=data;
        }

    }


    Node root = new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);

                               //1
                        // 2            3
                    //  4    5      6       7

      class Traversal{

                      static void  inorder(Node root){
                         
                        if(root==null){
                              return;
                        }
                         
                        inorder(root.left);
                        System.out.println(root.data);
                        inorder(root.right);

                        }
      }


        Traversal t = new Traversal();

        t.inorder(root);

}



}