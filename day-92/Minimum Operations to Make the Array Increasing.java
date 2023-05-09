class Solution {
    public int minOperations(int[] nums) {
        int op = 0;
        int ini = nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(ini>=nums[i+1]){
                ini++;
                op += ini-nums[i+1];
            }else{
                ini = nums[i+1];
            }
        }
        return op;
    }
}