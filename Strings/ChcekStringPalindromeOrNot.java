class A{

    String n="121";
    String []b=n.split("");


       String str = "";    
    void palin(){
    
       for(int i=b.length-1;i>=0;i--){
         str=str+b[i];
         
       }

    
   
    if(n.equals(String.join("",str))){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }
}
    public static void main(String[]args){

        A a=new A();
        a.palin();
        
    }
}