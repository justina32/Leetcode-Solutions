/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       //1 1 1 0 0 0  
        if(n <= 1) return 1;
        int left = 1;
        int right = n;
        while(left < right){
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}