class A{
    public static void main(String args[]){

        int arr[]={1,2,3,4,5};

        int k=4;

        double low=0;
        double high=0;

        for(int i=0;i<arr.length-1;i++){
           high=Math.max(high,arr[i+1]-arr[i]);
        }

        while(high-low>0.000001){
           double mid=(low+high)/2;
           int count=0;
           for(int i=0;i<arr.length-1;i++){
                   int gap=arr[i+1]-arr[i];
                   count+=(int)Math.ceil(gap/mid)-1;
           }

           if(count<=k){
                 high=mid;
           }else{
            low=mid;
           }
        }
        System.out.println(high);
    }
}