class A{
    public static void main(String args[]){

        int arr[]={3,6,7,11};

        int low=1;   // hume chaiye from 1----->11 (1 2 3 4 5 6 7 8 9 10 11) ispr Binary lagao low+high/2= 6 mid will be 
        int  high=0;  // aab high ko lane e liye arr ka max value assign krna padega 
        int hour=8;
        for(int i=0;i<arr.length;i++){
          high=Math.max(high,arr[i]);
        }

        while(low<=high){

            int mid=(low+high)/2;
            int  times=0;

        for(int i=0;i<arr.length;i++){
           times+=(arr[i]+mid-1)/mid;         //(3/6-1)/5       bcz of mid=6------> target hour is=8 but we got 6 hours
        }
        if(times<=hour){
           high=mid-1;
        }else{
            low=mid+1;

        }
  
        }
        System.out.println(low); // ------------> low kyu liya as output? bcz low  & Mid dono hi  ek hi value ko target kar rahe hai ko ki 4 hai to times mein 8 hours aayega but kiske damm par ayega Low,mid,high 

    }
}