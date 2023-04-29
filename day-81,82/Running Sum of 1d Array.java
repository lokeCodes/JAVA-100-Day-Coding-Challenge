class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            int sum = nums[i];
            for(int j=i-1;j>=0;j--){
                sum += nums[j];
            }
            arr[i]=sum;
        }
        return arr;
    }
}