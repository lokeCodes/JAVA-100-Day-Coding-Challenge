class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[n-1];
        System.out.println(min+" "+max);
        int count = 1;
        nums[0]=min;
        int index = 1;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                count++;
            }
        }

        int res = count;
        System.out.println(res);

        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1] && index<res){
                nums[index]=nums[i+1];
                index++;
            }
        }

    return res;
    }
}