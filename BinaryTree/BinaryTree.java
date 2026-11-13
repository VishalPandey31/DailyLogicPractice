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

        root.left=new Node(10);
        root.right=new Node(2);

        root.left.left=new Node(3);
        root.left.right=new Node(4);
 
        root.right.left=new Node(5);
        root.right.right=new Node(6);



        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);
        System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);



    }
}