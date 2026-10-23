class A{

    void fun(int n,int sum){
   if(n==0){
 System.out.println(sum);
 return;
   }
   fun(n-1,n+sum);
    }
    public static void main (String [] args){
   A a=new A();
   a.fun(5,0);
    }
}
