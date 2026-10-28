import java.util.*;
class A
{
    public static void main(String args[]){
        int arr1[]={1,3,5,7};
        int arr2[]={0,2,6,8,9};

                                                                                                         
        for(int i=arr1.length-1, j=0; i>=0 && j<arr2.length;i--,j++){

            if(arr1[i]>arr2[j]){
            int temp=arr1[i];
            arr1[i]=arr2[j];
            arr2[j]=temp;

         }else{
            break;
         }

        }
        Arrays.sort(arr1);
         Arrays.sort(arr2);

         System.out.println(Arrays.toString(arr1));
           System.out.println(Arrays.toString(arr2));


    }
}