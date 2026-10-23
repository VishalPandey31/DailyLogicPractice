import java.util.Arrays;

class A{
    public static void main(String [] args){
          int arr []={3,5,1,2,7,6};
          Arrays.sort(arr);

          for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
               if(arr[i]>arr[i+1]){
                      int temp=arr[i];
                      arr[i]=arr[i+1];
                      arr[i+1]=temp;
               }
            }
          else  if(arr[i]<arr[i+1]){
                       int temp=arr[i];
                      arr[i]=arr[i+1];
                      arr[i+1]=temp;
            
          }
        }
          
          System.out.println(Arrays.toString(arr));
    }
}