class A{
    public static void main (String args[]){
        int arr[]={7,1,5,3,6,4};
        
        int min=arr[0];
        int  profit=0;
        int max=0;

        for(int i=1;i<arr.length;i++){

        profit=arr[i]-min;

        if(arr[i]<min){
            min=arr[i];
            }
       if(profit>max){
       max=profit;
        }
        }
                System.out.println(max);

    }
}