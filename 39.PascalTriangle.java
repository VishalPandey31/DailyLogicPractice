class A{
    public static void main(String [] args){
        int n=15;
        int r=2;

        int res=1;
        for(int i=0;i<r;i++){
         res=res*(n-i);
         res=res/(i+1);
        }
        System.out.println(res);
    }
}