class A{
    public static void main(String args[]){

        int arr[]={5,4,3,2,1};
        int low=0;
        int high=arr.length-1;
        int ans=-1;

        while(low<high){
            int mid=(low+high)/2;

            // if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
            //   ans=arr[mid];
            //   break;
            // }

            if(arr[mid]<arr[mid+1]){
         low=mid+1;
            }else{
                high=mid;
            }
        }
        ans=arr[low];
        System.out.println(ans);
    }
}