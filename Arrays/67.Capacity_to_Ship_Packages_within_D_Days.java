class A{
    public static void main(String args[]){

        int arr[]={1,2,3,4,5,6,7,8,9,10};

        int low=0;
      int  high=0;
      int  ans=-1;
      int  days=5;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
        }
        for(int  i=0;i<arr.length;i++){
           high+=arr[i];

           }


           while(low<=high){

             int mid=(low+high)/2;

             int d=1;
             int load=0;

             for(int i=0;i<arr.length;i++) {
             if(load+arr[i]<=mid){
              load+=arr[i];

             }else{
                d++;
                load=arr[i];
             }
             }
             if(d<=days){
                ans=mid;
                high=mid-1;
             }else{
                low=low+1;
             }

           }
 System.out.println(ans);
    }
}