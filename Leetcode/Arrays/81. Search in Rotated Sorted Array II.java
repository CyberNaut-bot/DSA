class Solution {
    public boolean search(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            return true;
        }
    return false;
}
}
