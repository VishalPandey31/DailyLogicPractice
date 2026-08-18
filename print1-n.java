class A{
  int n=1;
    void fun(int val){
      if(n<=val){
        System.out.println(n);
n++;
        fun(val);
      }
    }
    public static void main (String [] args){
    A a=new A();
    a.fun(15);
    }
}