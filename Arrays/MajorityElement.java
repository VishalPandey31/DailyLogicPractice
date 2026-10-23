class A{
    public static void main(String arrs[]){
         int arr[]={1,1,3,3,1,1,5};

         for(int i=0;i<arr.length;i++){
           int count=0;
             for(int j=0;j<arr.length;j++){
                   if(arr[i]==arr[j]){
                  count++;
                   }
             }
             if(count>arr.length/2){
 System.out.println(count);
 break;
             }
         }
    }
}