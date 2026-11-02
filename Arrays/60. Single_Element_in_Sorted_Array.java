class A{
    public  static void main (String args[]){


        int arr[]={1,1,2,2,3,3,4,5,5,6,6};

        int low=1;
        int high=arr.length-2;
        int result=-1;

        while(low<=high){
         
            int mid=(low+high)/2;

          if(arr[mid] !=arr[mid+1] && arr[mid] !=arr[mid-1]){
            result=arr[mid];
               break;
          }

          if((mid%2==1 && arr[mid-1]==arr[mid] ) || (mid%2==0 && arr[mid]==arr[mid+1] )){
                       low=mid+1; //left Eliminated
          }else{
            high=mid-1;
          }



        }
        System.out.println(result);
    }
}