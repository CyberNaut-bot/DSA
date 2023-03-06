//basically increasing the number of sizes of zero 
class Solution {
     public void moveZeroes(int[] nums) {
        int zerosize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                zerosize++; 
            }
            else if (zerosize > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-zerosize]=t;
            }
        }
    }
}
