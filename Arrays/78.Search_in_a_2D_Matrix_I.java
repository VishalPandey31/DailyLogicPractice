class A{
    public  static void main(String args[])
    {

        int arr[][]={
           {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int n=arr.length;
        int m=arr[0].length;
         int  target=23;

        int low=0;
        int high=(n*m)-1;

        boolean found=false;

        while(low<=high){


            int mid=(low+high)/2;


            int row=mid/m;
            int col=mid%m;
            if(arr[row][col]==target){
                found=true;
                break;
            }else if(arr[row][col]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(found);
    }
}