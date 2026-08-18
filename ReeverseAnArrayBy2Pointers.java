import java.util.*;
class A{

    int arr[]={1,2,3,4};

    void fun(int i,int j){
         
         if(i>=j)
        return;
         
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
          fun(i + 1, j - 1);
    }
    public static void main(String []args){
 A a=new A();
 a.fun(0, a.arr.length - 1);

        System.out.println(Arrays.toString(a.arr));

    }
}