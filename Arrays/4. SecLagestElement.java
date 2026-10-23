class A{
    public static void main(String ags[]){
        int arr[]={2,6,8,3};
    int max=arr[0];
    int secmax=-1;
        for(int i=0;i<arr.length;i++){
     if(max<arr[i]){
           secmax=max;
           max=arr[i];
     }
        }
        System.out.println("The SecMax is :"+secmax);
    }
}