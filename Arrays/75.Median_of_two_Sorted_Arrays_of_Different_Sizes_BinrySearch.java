class A{
    public static void main(String args[]){
    
        int arr1[]={1,3,5,7};
        int arr2[]={2,5,6,8,9};

        int  n1=arr1.length;
        int n2=arr2.length;

        if(n1>n2){
            int temp[]=arr1;
            arr1=arr2;
            arr2=temp;

            n1 = arr1.length;
            n2 = arr2.length;
        }

        int low=0;
        int high=n1;

        while(low<=high){
            int mid1=(low+high)/2;
            int mid2=(n1+n2+1)/2-mid1;

            int l1=mid1==0? Integer.MIN_VALUE:arr1[mid1-1];
            int r1=mid1==n1? Integer.MAX_VALUE:arr1[mid1];

            int l2=mid2==0? Integer.MIN_VALUE:arr1[mid2-1];
            int r2=mid2==n2? Integer.MAX_VALUE:arr1[mid2];


            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==1){
            System.out.println(Math.max(l1,l2));
                }
            else{
                System.out.println((Math.max(l1,l2)+Math.min(r1,r2))/2.0);
            }
                break;
            }

            if(l1>r2){
              high=mid1-1;
            }else{
                low=mid1+1;
            }

        }

    }
}