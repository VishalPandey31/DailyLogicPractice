import java.util.ArrayList;

class a{
    public static void main(String [] args){
        int  arr[]={1,2,3,4};
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
          ans.add(arr[i]);
        }
        System.out.println(ans);
}
}