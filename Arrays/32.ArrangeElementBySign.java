import java.util.*;
class A{
    public static void main (String args[]){
     int arr[]={3,1,-2,-5,2,-4};
    ArrayList <Integer> positive=new ArrayList<>();
        ArrayList <Integer> nagative=new ArrayList<>();
    ArrayList <Integer> val=new ArrayList<>();

     for(int i=0;i<arr.length;i++){
        if(arr[i]>=0){
             positive.add(arr[i]);
        }else if(arr[i]<=-1 ){
             nagative.add(arr[i]);

        }
     }
     for(int i=0;i<positive.size() && i<nagative.size();i++){
       val.add(positive.get(i));
        val.add(nagative.get(i));

     }
     System.out.println(val);
    }
}