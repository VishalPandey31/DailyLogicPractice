class A{
    public static void main(String args[]){
  

        int n=3;
        int m=27;

        int low=0;
        int high=m;
        int ans=-1;


        while(low<=high){
      int mid=(low+high)/2;

   long power=1;

      for(int  i=1;i<=n;i++){
   power=power*mid;
      }


      if(power==m){
        ans=mid;
        break;
      }else if(power>m){
       high=mid-1;
      }else {
        low=mid+1;
      }
        }



System.out.println(ans);
    }
}