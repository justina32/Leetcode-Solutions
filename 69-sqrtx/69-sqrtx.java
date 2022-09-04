class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        long left = 0;
        long right = x;
        while(left < right - 1){
            long mid = left + (right - left)/2;
            if(mid * mid == x) return (int)mid;
            if(mid * mid < x) {
                left = mid;
            }else{
                right = mid -1;
            }
        }
        //case 1 if we have two elements left 
        if(right * right <= x) return (int) right;
        //case 2 only one elements or case 1's else
        return (int)left;
    }
}