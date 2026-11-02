import java.util.*;
class A{
    public static void main(String [] args){
   
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };


        int mat=a.length;

      for(int i=0;i<mat;i++){
        for(int j=i+1;j<mat;j++){
         int temp=a[i][j];
         a[i][j]=a[j][i];
         a[j][i]=temp;
        }
      }

      for(int i=0;i<mat;i++){
        
        int left=0;
        int right =mat-1;

        while(left <right){
             int temp=a[i][left];
             a[i][left]=a[i][right];
            a [i][right]=temp;


            left++;
            right--;
        }
      }
      for(int i=0;i<mat;i++){
            System.out.println(Arrays.toString(a[i]));
      }
    }
}