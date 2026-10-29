class A{
    public static void main(String args[]){

        int arr[]={2,3,-2,4};
      int ans=arr[0];

        for(int i=0;i<arr.length;i++){

            int product=1;
         for(int j=i;j<arr.length;j++){
             product=product*arr[j];

             if(product>ans){
         ans=product;
             }
                    }
        }
        System.out.println(ans);
    }
}