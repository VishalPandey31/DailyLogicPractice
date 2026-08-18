
// nums = [2, 7, 11, 15]
// target = 9
class A{
    public static void main(String args[]){
       int nums[] = {2, 7, 11, 15};
       int target = 9;
    

        for(int i=0;i<nums.length;i++){
           for(int j=nums.length-1;j>0;j--){
                if(nums[i]+nums[j]==target){
                    System.out.println(nums[i]+" "+nums[j]);
                    return ;
                }
           }
           
           
        }
        
        
    }
}
