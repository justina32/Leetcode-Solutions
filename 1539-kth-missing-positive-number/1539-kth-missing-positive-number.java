class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr == null || arr.length == 0) return k;
        // arr[i] :     [2,3,4,7,11]
        // i:           [0,1,2,3,4]
        //arr[i]-i-1:   [1,1,1,3,6] 
        
        if(arr == null || arr.length == 0) return k;
        if(k <= 0) return 0;
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] - mid -1 < k ){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        //if there are two elements left
        //[1,2,3,4]
        //[0,1,2,3]
        //[0,0,0,0]
        if(arr[right] - right - 1 < k){
            return right + k + 1;
        }
        //only one element is left
        return left + k ;
        
    }
}
