import java.util.ArrayList;

class A{
        public static void main(String args[]){

            int arr[]={0,1,2,0,1,2,1,2,0,0,0,1};
            int zero=0;
           int one=0;
           int two=0;
     ArrayList <Integer> val=new ArrayList<>();
           for(int  i=0;i<arr.length;i++){
           if(arr[i]==0){
             zero++;
           }else if(arr[i]==1){
            one++;
           }else{two++;}
           }

           for(int i=0;i<zero;i++){
         val.add(arr[0]);
           }
            for(int i=0;i<one;i++){
         val.add(arr[1]);
           } for(int i=0;i<two;i++){
         val.add(arr[2]);
           }

           System.out.println(val);
        }
    }