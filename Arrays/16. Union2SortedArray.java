import java.util.*;


class A{
 
    public static void main(String args[]){

  
        int arr1[]={1,2,3,4,1,2,5};
        int arr2[]={1,2,5,6,3,2,7};

          ArrayList <Integer> temp=new ArrayList<>();


        for(int i=0;i<arr1.length;i++){
        if(!temp.contains(arr1[i])) {
                    temp.add(arr1[i]);
            }
        }
                
         for(int i=0;i<arr2.length;i++){
        if(!temp.contains(arr2[i])) {
                    temp.add(arr2[i]);
            }
        }
                     
        Collections.sort(temp);


        
System.out.println(temp);

    }
}