class A{
    public static void main(String args[]){
        
        int arr[]={2,3,4,7,11};  //--------->means ki 1,2,3,4,5,6,7,,8,9,10,11  to isme se konse elements arr mein hai 2,3,4,7,11
        int MissingIndex=5; //--------> so, now 1,5,6,8,9,10 yeh values arr  mein nhi hai to isme se 5th index ki value return krni hai
                          //-------> Jo ki hai 9--> index(5)
           int low=0;
           int high=arr.length-1;;
           int ans=-1;
           while(low<=high){
           
            int mid=(low+high)/2;
            ans=arr[mid]-(mid+1);  //---------->2,3,4,7,11 --->mid=4 ---> hume dekhna hai 0,1,2,3,4 index par values aa rhi hai ya nhi , jaise 1,2,3,4,5 yaha 1 ke place par 2 hai --> 2 ke place par 3 hai --->3 ke place par 4 hai ---> 4 ke place par 7 hai and---->5th ke place par 11 hai  to  (1,1,1,3,4) yeh sabka value hai jaise 2-1-->3-2---> 7-4---> 11-7
              if(ans<MissingIndex){
                   low=mid+1;
              }else{
                high=mid-1;
              }

            
           }
           System.out.println(low+MissingIndex);
           
    }     

}