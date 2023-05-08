class Solution {
    public int mostFrequent(int[] nums, int key) {
        int n = nums.length;
        int max = 0;
        int index = -1;
        int freq[] = new int[1001];
        for(int i=0;i<n-1;i++){
            if(nums[i]==key){
                ++freq[nums[i+1]];
                if(freq[nums[i+1]]>max){
                    max = freq[nums[i+1]];
                    index = i+1;
                }
            }
        }
    return nums[index];
    }
}