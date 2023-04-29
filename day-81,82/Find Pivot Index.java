class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for(int i=0;i<n;i++){
            pivot = i;
            int rsum = 0;
            for(int j=i+1;j<n;j++){
                rsum += nums[j];
            }
            int lsum = 0;
            for(int k=i-1;k>=0;k--){
                lsum += nums[k];
            }
            if(rsum == lsum){
                break;
            }else if(rsum != lsum && i==n-1){
                pivot = -1;
                break;
            }
        } 
        return pivot;
    }
}