class A{
    public void solve(int [][] a){
          

        int m=a.length;
        int n=a[0].length;


        int [] row= new int [m];
       int [] column= new int [m];


        for(int i=0;i<m;i++){
              for(int j=0;j<n;j++){
              if(a[i][j]==0){
                row[i]=1;
                column[j]=1;
              }
        }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
          if(row[i]==1 || column[j]==1){
            a[i][j]=0;
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
         obj.solve(a);
         
            for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}