class A{

    int fun(int n){
    
        if(n==0) {
         return 0;
    
    }
     return n + fun(n - 1);
    }
    public static void main(String []args){
A a =new A();

System.out.println(a.fun(5));

    }
}