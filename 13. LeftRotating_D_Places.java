import java.util.*;
class A{
    public static void main(String args[]){
        int  arr[]={1,2,3,4,5,6,7};
        int d=3;
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<d;i++){
                temp.add(arr[i]);
        }
           for(int j=d;j<arr.length;j++){
             arr[j-d]=arr[j];
           }
           for(int k=0;k<d;k++){
            arr[arr.length-d+k]=temp.get(k);
            
           }
        
        System.out.println(Arrays.toString(arr));
    }
}