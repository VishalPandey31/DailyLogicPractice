import java.util.*;

class A{
    public static void main (String args[]){

        int arr[][]={{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
             ArrayList <int []> ans=new  ArrayList<>();

        int start=arr[0][0];
        int end =arr[0][1];

        for(int i=1;i<arr.length;i++){
          if(arr[i][0]<=end){
            end=Math.max(end,arr[i][1]);
          }
          else{
            ans.add( new int[]{start,end});

            start =arr[i][0];
            end=arr[i][1]; 
          }


    }
            ans.add( new int[]{start,end});

            for(int [] a:ans){
          System.out.println(Arrays.toString(a));
            }

    }
}