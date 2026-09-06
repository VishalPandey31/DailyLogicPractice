import java.util.*;

class A{
    public static void main (String args[]){
        int arr1[]={1,2,3,1,2,4,5};
        int arr2[]={1,2,6,1,3,4,5};  //1,2,3,4,5

ArrayList <Integer> temp=new ArrayList<>();
ArrayList <Integer> ans=new ArrayList<>();

        for(int i=0;i<arr1.length ;i++){
            if(!temp.contains(arr1[i])){
               temp.add(arr1[i]);
            }
              
      for( int j=0;j< arr2.length;j++){
           if(temp.contains(arr2[j]) && ! ans.contains(arr2[j])) {
          ans.add(arr2[j]);
           }
        }

        //    for(i=0;i<ans.size();i++){
        //     if(!finalans.contains(ans.get(i))){
        //    finalans.add(ans.get(i));
        //     }
    
        
    }
   
    System.out.println(ans);
}
}