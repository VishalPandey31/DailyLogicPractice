class A{
    public void solve(int [][] a){ //(2)
          

        int m=a.length;  
        int n=a[0].length;

                                       // (3)
        int [] row= new int [m];   //yaha na ek empty row bana sirf ek hi row jaha abhi to sab zero hoga [0,0,0]
       int [] column= new int [m];    // yaha ek empty column banaya sirf 1 hi column jaha abhi to sab zero hoga [0]
                                                                                                            //   [0]
                                                                                                              // [0]   

        for(int i=0;i<m;i++){
              for(int j=0;j<n;j++){
              if(a[i][j]==0){
                row[i]=1;
                column[j]=1;
              }  // isee  a jab humee apne matrix mein 0 milega na to jo row and column hai na usko 1 bana denge  
        }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
          if(row[i]==1 || column[j]==1){
            a[i][j]=0;   //yaha check krenge konsa row column 1 hai and usko 0 banayenge uske line ka sara 1 zero banega in matrix
            }
    }

}

    }
    public static void main(String [] args){
         A obj= new A();

         int a[][]={
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
         };
         obj.solve(a);  //matrix bana kar upar bheja method call krk (1)

            for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}