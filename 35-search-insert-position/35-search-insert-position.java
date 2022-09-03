class Solution {
    public int searchInsert(int[] nums, int target) {
        //find smallest larger or equal return its index
        if(nums == null || nums.length == 0) return 0;
        if(target > nums[nums.length-1]) return nums.length;
        if(target < nums[0]) return 0;
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}