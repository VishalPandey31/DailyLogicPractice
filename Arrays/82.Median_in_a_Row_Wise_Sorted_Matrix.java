class A{
    public static void main(String args[]){
        
        int arr[][]={
            {1,5,7,9,11},
            {2,3,4,5,10},
            {9,10,12,14,16}

        };


        int n=arr.length;
        int m=arr[0].length;

        int low=1;
        int high=16;

        while(low<=high){
            int mid=(low+high)/2;
            int count=0;

            for(int i=0;i<n;i++){

                for(int j=0;j<m;j++){

                    if(arr[i][j]<=mid){
                       count ++;
                    }
                }



            }

            if(count<=(n*m)/2){
              low=mid+1;
            }else{
                high=mid-1;
            }
        }


System.out.println(low);
    }
        
}