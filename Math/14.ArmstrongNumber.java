class A{
    public static void main (String [] args){
        int num=153;
        int sum=0;
        int ans=num;
        while(num>0){
           int digit =num%10;
           sum=sum+digit*digit*digit;
           num=num/10;
        }
       if(sum==ans){
     System.out.println("Armstrong");
       }else{
             System.out.println("Not an Armstrong");

       }

    }
}