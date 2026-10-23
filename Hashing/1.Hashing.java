import java.util.*;

class A{
    public static void main(String [] args){

  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];

  for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
  }

  int [] hash=new int[12];
  for(int i=0;i<n;i++){
   hash[arr[i]]++;
  }

  int countElement=sc.nextInt();
  while(countElement-->0){
    int num=sc.nextInt();
    System.out.println("ANSWER:"+hash[num]);

  }

    }
}