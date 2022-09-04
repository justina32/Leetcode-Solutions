class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        if(nums == null || nums.length == 0){
            return result;
        }
        
        result[0] = findFirstOccurence(nums,target);
        result[1] = findLastOccurence(nums,target);
        return result;
    }
    private int findFirstOccurence(int[] array, int target){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int mid= left + (right-left)/2;
            if(array[mid] == target){
                right = mid;
            }else if(array[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        if(array[left] == target){
            return left;
        }
        
        return -1;
    }
    private int findLastOccurence(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        if (nums[right] == target) {
            return right;
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;

    }
}