class A{
 public static void main(String args[]){
    int arr[][]={
           {10, 8, 10, 10},
            {14, 13, 12, 11},
            {15, 9, 11, 21},
            {16, 17, 19, 20}
    };

    int  n=arr.length;
    int m=arr[0].length;

    int low=0;
    int high=m-1;
   
    while(low<=high){
        
        int mid=(low+high)/2;

         int maxcount=0;

        for(int  i=0;i<n;i++){
          if(arr[i][mid] >arr[maxcount][mid]){
                 maxcount=i;
          }


        }

        int left= (mid-1>=0)? arr[maxcount][mid-1]:-1;
        int right=(mid+1<m) ? arr[maxcount][mid+1]:-1;
        
        if(arr[maxcount][mid]>left && arr[maxcount][mid]>right){
            System.out.println(maxcount +","+mid);
            break;
        }else if(arr[maxcount][mid]<left){
            
              high=mid-1; 
        }else{
           low=mid+1;
        }

    }

}
}