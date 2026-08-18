class A{
    int count =0;
      public void fun() {
        
        if(count==5) return;
        System.out.println("vishal");
        count++;
        fun();
         
    }


    public static void main(String [] args){

     A a=new A();
     a.fun();
    }

}