import  java.util.*;

class A{
    public static void main(String[] args){
  
        int arr []={-1,0,1,2,-1,-4};


        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){

                  for(int k=j+1;k<arr.length;k++){

                       for(int l=k+1;l<arr.length;l++){

                       if(arr[i]+arr[j]+arr[k]+arr[l]==0){
           
                List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k],arr[l]);

                        Collections.sort(list);

                        if(!ans.contains(list)){
                           ans.add(list);
                        }
                    }
             }
             }
        }
        }

System.out.println(ans);
    }
}