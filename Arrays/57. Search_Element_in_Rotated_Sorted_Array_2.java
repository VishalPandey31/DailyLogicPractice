class A{
 public static void main(String args[]){

     int arr[]={3, 3, 1, 3, 3, 3, 3};
     int target =3;

     int low=0;
     int high=arr.length-1;
     

     while(low<=high){
           
        int mid=(low+high)/2;

        if(arr[mid]==target){
            System.out.println(mid);
            return;
        }

        if(arr[low]==arr[mid] && arr[mid]==arr[high]){ // 3==3==3
            low=low+1;
            high=high-1;
            continue;
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