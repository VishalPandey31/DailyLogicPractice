import java.util.*;

class A{
  public static void main(String args[]){

    int arr[]={0,1,2,3,5,0,9,0,6,7,8};
     ArrayList <Integer> temp=new ArrayList<>();
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
         temp.add(arr[i]);
        }
    }
    int j=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        arr[j]=arr[i];
        j++;
      }

    }
    for(int i=j;i<arr.length;i++){
     arr[i]=0;
    }
    System.out.println(Arrays.toString(arr));

  }   

}