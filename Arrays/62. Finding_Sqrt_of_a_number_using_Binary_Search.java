class A{
    public static void main(String args[]){

        int n=25;

        int low=0 ;
        int high=25;
        int ans=-1;

        while(low<=high){
         int mid=(low+high)/2;

         if(mid * mid==n){
         ans=mid;
         break;
         }else if(mid*mid>n){
            high=mid-1;
         }
         else if(mid*mid<n){
            low=low+1;
         }
        }

        System.out.println(ans);
    }
}