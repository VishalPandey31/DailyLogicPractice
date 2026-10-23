class A{
    public static void main (String args[]){

            int arr[]={0,1,2,0,1,2,1,2,0,0,0,1};

            int mid=0;
            int low=0;
            int high=arr.length-1;
            while(mid<=high){
              if(arr[mid]==0){

                    int temp=arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp;
                mid++;
                  low++;
              }else if(arr[mid]==1){
                  mid++;
              }else if(arr[mid]==2){
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                 high--;
              }
                
            }

              for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}