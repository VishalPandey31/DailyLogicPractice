import java.util.ArrayList;

class A{
    public static void main(String args[]){
      
        int arr[]={1,3,5,7};
       int arr1[]={2,4,6,8,9,10};

       int i=0;
       int j=0;
         double ans=-1;
          ArrayList <Integer> arr2=new ArrayList<>();

       while(i< arr.length &&j<arr1.length ){

        

            if( arr[i]<arr1[j]){
             arr2.add(arr[i]);
             i++;
            }else{
                arr2.add(arr1[j]);
                j++;
            }

        }
          while(i < arr.length) {
                  arr2.add(arr[i]);
                  i++;
              }
              
            while(j < arr1.length) {
                  arr2.add(arr1[j]);
                  j++;
              }

        
         int n = arr2.size() ;

         if(n%2==1){
           ans=arr2.get(n/2);
         }else{

       ans=(arr2.get(n/2-1) + arr2.get(n/2)) / 2.0;
         }
       
         System.out.println(arr2);
        System.out.println(ans);    
    }
}