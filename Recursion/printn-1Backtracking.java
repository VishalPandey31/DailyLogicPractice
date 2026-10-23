
class A{

int n=5;
    void fun(int val){
     if(val<n) {
            val++;
        fun(val);
       System.out.println(val);
     }
    }
    

    public static void main(String []args){
   
        A a=new A();
        a.fun(0);
    }
}
