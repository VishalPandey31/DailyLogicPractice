import java.util.HashMap;

class A{
    public static void main(String args[]){

       int arr[]={2,2,3,3,1,2,2};
          HashMap <Integer, Integer> val=new HashMap<>();

for(int i=0; i< arr.length;i++){
   val.put(arr[i], val.getOrDefault(arr[i],0)+1);

if(val.get(arr[i])>arr.length/2){
 System.out.println(arr[i]);
 break;
}
}
    }
}