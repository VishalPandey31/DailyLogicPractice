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

           int height ( Node root){

             if(root==null){
                return 0;
             }
             
             int left=height(root.left);
             int right=height(root.right);

             if(left==-1 || right==-1){
             return -1;
             }
             if(left-right<=1 && right-left<=1){
                return Math.max(left,right)+1;
             }else{
                return -1;
             }

           }
         
    }
    Solution s1=new Solution();
    
    if(s1.height(root)==-1){
        System.out.println("Not Balanced");
    }else{
          System.out.println(" Balanced"); 
    }
    }
}