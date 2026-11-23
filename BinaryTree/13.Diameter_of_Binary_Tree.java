class A{
    public static void main(String arrgs[]){

        class Node{
            int data;
            Node left,right;



            Node(int data){
             this.data=data;
            }
        }


         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
    class Solution{
          int diameter = 0;
           int height ( Node root){

             if(root==null){
                return 0;
             }
             
             int left=height(root.left);
             int right=height(root.right);
            
             diameter = Math.max(diameter,left+right);

                return Math.max(left,right)+1;

           }
         
    }
    Solution s1=new Solution();
   
    s1.height(root);
        System.out.println(s1.diameter);
  
         
    
    }
}