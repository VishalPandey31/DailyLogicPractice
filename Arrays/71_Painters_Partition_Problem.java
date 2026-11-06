class A{
    public static void main(String args[]){

        int arr[]={10,20,30,40};
       int k=2;


        int low=0;
        int high=0;

        for(int i=0;i<arr.length;i++){
        low=Math.max(low,arr[i]);
        high+=arr[i];
        }

        int ans=-1;
        
       
        while(low<=high){
        int sum=0;
       int painter=1;

            int mid=(low+high)/2;

            for(int i=0;i<arr.length;i++){
              if(sum+arr[i]<=mid){
             sum+=arr[i];
              }else{
                painter++;
                sum=arr[i];
              }
            }

            if(painter<=k){
            ans=mid;
            high=mid-1;
            }else{
                low=low+1;
            }
        }
        System.out.println(ans);
    }

}