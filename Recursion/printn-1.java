class A{
  
    void fun(int val){
      if(val>=1){
        System.out.println(val);
val--;
        fun(val);
      }
    }
    public static void main (String [] args){
    A a=new A();
    a.fun(4);
    }
}
