class A{
    public static void main(String args[]){
        
        int arr1[] = {2, 3, 6, 7, 9};  //  {1, 4, 8, 10}
        int arr2[] = {1, 4, 8, 10};      //{2, 3, 6, 7, 9}
       
        int k=5;
    
        int n1=arr1.length;
        int n2=arr2.length;
        
        // 5>4
        if(n1>n2){
           int temp[]=arr1;   // swapping hua
           arr1=arr2;
           arr2=temp;
        }

        n1=arr1.length;   //4
        n2=arr2.length;    //5
  
        int low=Math.max(0,k-n2);  //(0,5-5)---->(0,0)-->0
        int high=Math.min(k,n1); // (5,4)---->4

               //0<=4
        while(low<=high){
             
            int mid1=(low+high)/2;   //2
            int mid2=k-mid1;        //5-2=3


            int l1=(mid1==0)? Integer.MIN_VALUE: arr1[mid1-1];  //2-1------> arr1[1]=4
            int l2=(mid1==0)? Integer.MAX_VALUE: arr2[mid2-1];  //3-1-------> arr2[2]=6

            int r1=(mid2==0)? Integer.MIN_VALUE: arr1[mid1];    // arr1[2]---->8
            int r2=(mid2==0)? Integer.MAX_VALUE: arr2[mid2];    //arr2[3]----->7

            //4<=7  && 6<=8
            if(l1<=r2 && l2<=r1){
            
                System.out.println(Math.max(l1, l2));  //(4,6)--------->6
                break;
            } else if(l1>r2){        //4>7 ----> NO
                  high=mid1-1;
            }else{     // Yeh chalega tab
           low=mid1+1;
            }

        }
    
    }
}