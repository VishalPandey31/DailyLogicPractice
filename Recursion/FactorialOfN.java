class A{
int mul=1;
    void fact(int n){
        if(n==0) return;
        mul=mul*(n);
        
         fact(n-1); 
    }
    public static void main (String args[]){
        A a=new A();
        a.fact(5);
        System.out.println(a.mul);
    }
}