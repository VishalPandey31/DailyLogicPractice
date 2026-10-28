import java.util.*;
class A{
    public static  void main(String args[]){
      
        int arr[] ={4,3,6,2,1,1};
        ArrayList <Integer> ans=new ArrayList<>();

        int sum=0;
        int an=0;
        
        for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
              ans.add(arr[i]);
            }
         }
        }

        for(int i=0;i<=arr.length;i++){
        sum+=i;
        }
        for(int j=0;j<arr.length;j++){
          an+=arr[j];
        }
        int data=sum-an;
        int finalans=ans.get(0)+data;

        System.out.println("Missing :"+finalans);
         System.out.println("Duplicate :"+ans.get(0));

    }
}