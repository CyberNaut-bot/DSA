//XOR PROBLEM USING IN BIT MANIPULATION
class Solution {
    public int singleNumber(int[] nums) {
        int res=0,i;
        for(i=0;i<nums.length;i++)
        {
            res=res^nums[i];
        }
        return res;
        
    }
}
