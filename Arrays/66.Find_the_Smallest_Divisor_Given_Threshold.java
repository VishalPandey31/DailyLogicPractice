class A{
 public static void main(String args[]){

      int arr[]={1,2,5,9};

      int t=6;
      int low=1;
      int high=0;
     int ans=-1;

      for(int i=0;i<arr.length;i++){
           high=Math.max(high,arr[i]);
      }

      while(low<=high){


        int mid=(low+high)/2;

      int val=0;
        for(int i=0;i<arr.length;i++){
          val += (arr[i] + mid - 1) / mid;             
          
        }
         if(val<=t){
           ans=mid; 
             high = mid - 1;
        }else {
                low = mid + 1;
            }
      }
 System.out.println(ans);

 }   
}