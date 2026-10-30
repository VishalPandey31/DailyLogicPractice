class A{
    public static void main(String args[]){

        int arr []={3,4,6,7,9,12,16,18};
        int target =12;

        int low=0;
        int high=arr.length-1;
        while(low<=high){
                    int mid=(low+high)/2;
              if(arr[mid]==target){
                System.out.println("Target value :"+mid);
                return;
            
              }else if(target>arr[mid]){
                 low=mid+1;
              }else{
                high=mid-1;
           }

        }
                    System.out.println(-1);

    }
}