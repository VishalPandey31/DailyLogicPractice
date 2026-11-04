import  java.util.*;
class A{
    public static void main(String args[]){


        int arr[]={0,3,4,7,10,9};
        Arrays.sort(arr);

        int low=1;
        int high=arr[arr.length-1]-arr[0];
       int ans=-1;
         int cow=4;

       while(low<=high){
         int mid=(low+high)/2;
          
         int count=1;
         int last=arr[0];
       for(int i=1;i<arr.length;i++){
          if(arr[i]-last>=mid){
        count++;
        last=arr[i];
          }
       }

       if(count>=cow){
                   ans=mid;
                  low=mid+1;
       }else{
                  high=mid-1;

       }


       }
       System.out.println(ans);
        
    }
}