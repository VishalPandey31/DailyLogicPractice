import java.util.*;

class A{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);

        String n=sc.next();

        int []hash=new int[256];

        for(int i=0;i<n.length();i++){
            hash[n.charAt(i)]++;
        }

        int q=sc.nextInt();
  

        while(q-->0){
  char ch = sc.next().charAt(0);

   System.out.println(hash[ch]);
        }

    }
}