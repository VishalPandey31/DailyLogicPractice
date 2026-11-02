class A{
 public static void main(String args[]){

     int arr[]={4, 5, 6, 7, 0, 1, 2};
     
     int target =0;
     int low=0;
     int high=arr.length-1;
     

     while(low<=high){
           
        int mid=(low+high)/2;

        if(arr[mid]==target){
            System.out.println(mid);
            return;
        }

        //Left
      if(arr[low]<=arr[mid]){

             if(target<arr[mid] && arr[low]<=target){
             high=mid-1;
        }else{
            low=mid+1;
        }
      }

      //right 
      else{
      

             if(target>arr[mid] && arr[high]>=target){
              low=mid+1;
        }else{
          high=mid-1;
        }
    
      }
        
        
     }
     System.out.println(-1);

 }
}