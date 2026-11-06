class A{

    public static void main(String args []){

        int arr[]={25,46,28,49,24};
            
        int low=0;
        int high=0;

        for(int i=0;i<arr.length;i++){
         low=Math.max(low,arr[i]);

        }
        for(int i=0;i<arr.length;i++){
         high+=arr[i];
        }
     int student=4;
     int ans=-1;


     while(low<=high){
        
        int mid=(low+high)/2;
        int count=1;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
             sum+=arr[i];
            }else{
                count++;
                sum=arr[i]; 
            }
            
            
        };
        if(count<=student){
      ans=mid;
      high=mid-1;
        }else{
            low=mid+1;
        }

     }
System.out.println(ans);
    }
}