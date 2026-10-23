class A{
    public static void main(String [] args){
      int arr[]={2,3,6,1};
       
      int min =Integer.MAX_VALUE;
      int secmin=Integer.MAX_VALUE-1;
      for(int i=0;i<arr.length;i++){
         if(min>arr[i]){
        
            secmin=min;
            min=arr[i];
         }
      }
      System.out.println("SecMin value is :"+secmin);
    }
}
