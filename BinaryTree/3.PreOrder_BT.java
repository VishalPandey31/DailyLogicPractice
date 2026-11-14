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


        
            Node root=new Node(1);

            root.left=new Node(2);
            root.right=new Node(3);                

          root.left.left=new Node(4);
          root.left.right=new Node(5);

                                               //1--------->root
                //  Left--------> //2                   3------------>right
                            //4           5 

            class Traversal{

                static void postorder (Node root){

                    if(root==null){

                        return;
                    }
             
              System.out.println(root.data);
              postorder(root.left);
            postorder(root.right);



                }
                
            }
            Traversal val=new Traversal();
            val.postorder(root);
    }

}