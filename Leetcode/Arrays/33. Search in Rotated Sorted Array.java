class Solution {
    public int search(int[] nums, int target) {
        
        //run a loop till nums.length

        for(int i = 0; i < nums.length;i++){

            //check if taget is present in the rotated array

            if(nums[i] == target){

                return i;//if target is found in the array return it's index
            }
        }
        return -1;//if element is not found return -1
    }
}
