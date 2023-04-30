class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int min = Integer.MAX_VALUE;
        int res;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j] && nums1[i]<min){
                    min = nums1[i];
                }else{
                    if(nums1[i]<nums2[j]){
                        res=nums1[i]*10+nums2[j];
                    }else{
                        res = nums2[j]*10+nums1[i];
                    }

                    if(res<min){
                        min = res;
                    }
                }
            }
        }
    return min;    
    }
}