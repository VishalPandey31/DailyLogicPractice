class A{
    public static void main(String args[]){
    
        int arr[]={7,7,7,7,13,11,12,7};
        int m=2;
        int k=3;

        int low=0;
        int high=0;

        for(int i=0;i<arr.length;i++){
         high=Math.max(high,arr[i]);
        }

       int min=-1;

        while(low<=high){
         
            int mid=(low+high)/2;
            int count=0;
            int bouquets=0;

            for(int i=0;i<arr.length;i++){
                if(arr[i]<=mid){
                   count++;

                   if(count==k){
                    bouquets++;
                    count=0;
                   }
                }else{
                    count=0;
                }
            }

            if(bouquets>=m){
                    min=mid;
                    high=mid-1;
            }else {
               low=mid+1;
            }
            
        }
        System.out.println(min );

    }
}