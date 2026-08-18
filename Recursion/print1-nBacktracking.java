class A{


    void fun(int val){
     if(val>1){
            val--;
        fun(val);
       System.out.println(val);
     }
    }

    public static void main(String []args){
   
        A a=new A();
        a.fun(5);
    }
}
