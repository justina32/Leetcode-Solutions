class Solution {
    public List<Integer> findClosestElements(int[] array, int k, int x) {
        List<Integer> result = new ArrayList<>();
        if(array == null || array.length == 0) return result;
        int left = 0;
        int right = array.length-1;
        while(left < right-1){
            int mid = left + (right - left)/2;
            if(array[mid] == x){
                right = mid;
            }else if(array[mid] < x){
                left = mid;
            }else{
                right = mid;
            }
        }
        //case1 array[right] < x
        //case2 array[left] > x
        //case 3 array[left] <=x <= array[right]
        //we move left when 1.right has exceed boundary 2.left not out and more close to left
        for(int i=0; i<k; i++){
            if(right >= array.length || left >=0 && (Math.abs(array[left] - x) <= Math.abs(array[right] - x)) ){
                result.add(array[left]);
                left--;
            }else{
                result.add(array[right]);
                right++;
            }
        }
       Collections.sort(result);
        return result;
    }
   
}