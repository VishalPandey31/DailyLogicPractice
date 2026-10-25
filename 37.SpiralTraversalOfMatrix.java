import java.util.*;

class A{
    public static void main (String [] args){
        int [] [] mat={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int n=mat.length;
        int m=mat[0].length;


        int left=0;
        int right=m-1;
        int bottom=n-1;
        int top=0;

     List<Integer> num=new ArrayList<>();

  while(left<=right && top<=bottom){
         
    for(int  i=left;i<=right;i++){
        num.add(mat[top][i]);
    }
    top++;

    for(int i=top;i<=bottom;i++){
              num.add(mat[i][right]);
    }
    right--;


  // Right to Left
if (top <= bottom) {
    for (int i = right; i >= left; i--) {
        num.add(mat[bottom][i]);
    }
    bottom--;
}

// Bottom to Top
if (left <= right) {
    for (int i = bottom; i >= top; i--) {
        num.add(mat[i][left]);
    }
    left++;
}
  }
     System.out.println(num);
    }
}