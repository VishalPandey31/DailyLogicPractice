import java.util.*;
class A{
 
    public static void main (String args[]){
        int arr[]={4,5,6,7,0,1,2,3};
      int ans=Integer.MAX_VALUE;
      int low=0;
      int high=arr.length-1;
         int index=-1;
      while(low<=high){
         int mid=(low+high)/2;

         if(arr[mid]<= arr[high]){
            if(arr[mid]<=ans){
            ans= arr[mid];
            index=mid;
            }
             high=mid-1;

         }else{
            low=low+1;
         }
      }
      System.out.println("Minimum Element :"+ans);
            System.out.println("Times Rotated :"+index);

    }

}