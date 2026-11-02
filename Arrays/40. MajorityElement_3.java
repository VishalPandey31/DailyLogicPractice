class A{
    public static void main(String args[]){
           
        int arr[]={1,2,3,1,2,1,2};

        for(int i=0;i<arr.length;i++){
            int count=0;
            boolean alreadycount=false;

         for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    alreadycount=true;
                break; 
                }
               
         }
          if (alreadycount) {
                continue;
            }

            for(int k=0;k<arr.length;k++){
          if(arr[i]==arr[k]){
                 count++;
          }
            }
                       if(count>arr.length/3){
                            System.out.println(arr[i]);

            
                }
        }
    }
}