class A{
    public static void main(String [] args){
        int arr[]={1,2,3,1,1,1,1,4,2,3};
         int K=3;
        int maxlength=0;
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
          sum+=arr[k];
            }
            if(sum==K){
            int length=(j-i+1);
            
            if(length>maxlength){
           maxlength=length;
            }
            }

           }
        }
                           System.out.println(maxlength);
    }
}