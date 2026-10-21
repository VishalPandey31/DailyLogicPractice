class A{
    public static void main(String args[]){

     int arr[]={102,4,100,1,101,3,2,1,1};

  int length=0;
  int max=0;

     for(int i=0;i<arr.length;i++){
        int n=arr[i];
        length=1;

     for(int j=0;j<arr.length;j++){
        
         if(arr[j]==n+1){ 
              length++;
             n++;
            j=-1;
     }

   
     }
       if(length>max){
      max=length;
     }
    }
    System.out.println(max);
}
}