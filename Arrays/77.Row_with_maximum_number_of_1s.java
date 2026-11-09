class A{
    public static void main(String args[]){
        
        int arr[][]={
            {0,0,1,1},
            {0,1,1,1},
            {0,0,0,1},
            {1,1,1,1}
        };


        int n=arr.length;
        int m=arr[0].length;
         
        int ans=-1;
        int maxcount=0;

        for(int i=0;i<arr.length;i++){
              
            int low=0;
            int high=m-1;
            int firstone=m;


            while(low<=high){
                
           int mid=(low+high)/2;

                if(arr[i][mid]==1){
                    firstone=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
            }

            int count=m-firstone;

            if(count>maxcount){
               maxcount=count;
               ans=i;
            }
        }

    }
    System.out.println(ans);

}
}