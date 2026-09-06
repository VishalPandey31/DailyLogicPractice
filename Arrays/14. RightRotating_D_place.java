import java.util.*;
class A{
    public static void main(String args[]){
        int  arr[]={1,2,3,4,5,6,7};
        int d=3;
           d = d % arr.length;
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=arr.length-d;i<arr.length;i++){
                temp.add(arr[i]);
        }
           for(int j=arr.length-1;j>=d;j--){
            arr[j]=arr[j-d];
           }
           for(int k=0;k<d;k++){
            arr[k]=temp.get(k);
            
           }
        
        System.out.println(Arrays.toString(arr));
    }
}