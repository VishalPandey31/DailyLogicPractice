import java.util.ArrayList;

class A{
    public static void main (String [] args){
    int arr[]={1,2,3,2,3,4,4};

    ArrayList<Integer> ans=new ArrayList<>();
    for(int i=0;i<arr.length-1;i++){
        if(!ans.contains(arr[i])){
             ans.add(arr[i]);
        }
        }
    

 
     


    System.out.println(ans);
    }
}