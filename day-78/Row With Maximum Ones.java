class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int arr[] = new int[2];
        int max = 0;
        int maxi =-1;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum += mat[i][j];
            }
            if(sum>max){
                max = sum;
                maxi = i;
                arr[0]=maxi;
                arr[1]=max;
            }
        }
        return arr;
    }
}