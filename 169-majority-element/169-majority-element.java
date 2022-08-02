class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length,temp=nums[0],f=0;
        int maxcount=-1,count=1,index=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(temp==nums[i]){
                count++;
                temp=nums[i];
            }
            else{
                count=1;
                temp=nums[i];
            }
           if(maxcount<count){
               maxcount=count;
               index=i;
          
            if(maxcount>(n/2)){
                f = 1;
                break;
            }
        }
        
    }
        return (f==1 ? nums[index] : nums[0]);
}
}