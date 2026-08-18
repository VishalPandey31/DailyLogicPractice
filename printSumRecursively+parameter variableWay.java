class A{
    int n=5;
    int sum=0;
void fun(){
    if(n>0){
     sum+=n;
     n--;
      fun(); 
    }  
}
    public static void main(String [] args){

    A a =new A();
        a.fun();
        System.out.println(a.sum); 
    }
}
