import java.util.Arrays;
class A{
    public static void main (String []args){
           int arr[]={1,0,0,0,1};
          
          int n=1;
          boolean val= true;

          
               if(n == 0){
              
            System.out.println(val);

        }else{
           for(int i=1;i<arr.length-1;i++){
        if((i==0 || arr[i-1] ==0 ) && arr[i]==0 && (i==arr.length-1 || arr[i+1]==0 )){
            arr[i]=1;
            n--;
        
    }if(n==0){
      break;
    }
}
if(n>0){
  val=false;
}
    System.out.println(Arrays.toString(arr)+" "+val);
}
    }
}