class A{
    public static void main(String args[]){
         
        int arr[]={2,2,3,3,1,2,2};
      
        int val=arr.length;
        for(int i =0;i<arr.length;i++){
              int count=0;
            for(int j=0;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                    count++;
                 }
                }
                if(count>val/2){
       System.out.println(count);
       break;
                }
        }
    }
}