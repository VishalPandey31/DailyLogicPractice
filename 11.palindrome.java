class a{
    public static void main (String [] args){
     String a="sks";
    String [] b=a.split("");
    String ans="";
    for(int i=b.length-1;i>=0;i--){
        ans=ans+b[i];
    }
    if(a.equals(String.join(" ",ans))){
 System.out.println("Palindrome");
    }else{
 System.out.println("Not Palindrome");
 
    }
    }
}