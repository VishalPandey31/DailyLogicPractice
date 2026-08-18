import java.util.*;
class A{

    int arr[]={3,2,1};
  ArrayList<Integer> n = new ArrayList<>();
 void fun(){
    
    for(int i=arr.length-1;i>=0;i--){
         n.add(arr[i]);
       
    }
     
 }
 public static void main(String [] args){
    A a=new A();
    a.fun();
System.out.println(a.n);
 }   
}