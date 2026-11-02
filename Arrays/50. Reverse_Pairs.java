class A{
    public static void main(String args[]){

        int arr[]={40,25,19,12,9,6,2};


        int count=0;
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
            if(arr[i]>2*arr[j]){
         count++;
            }
          }
        }
        System.out.println(count);
    }
}