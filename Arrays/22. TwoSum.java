class A{
    public static void main(String args[]){

       int arr[]={8,2,3,4,5,7};
     int target=6;

     for(int i=0;i<arr.length;i++){
       for(int j=i+1;j<arr.length;j++){
           if(arr[i]+arr[j]==target){
            System.out.println(i+" "+j);
           }
       }
     }

    }
}