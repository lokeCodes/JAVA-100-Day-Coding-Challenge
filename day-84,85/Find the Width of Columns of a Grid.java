class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int arr[] = new int[c];
        

        for(int j=0;j<c;j++){
            int max = 0;
            for(int i=0;i<r;i++){
                int len = 0;
                int temp = grid[i][j];
                if(temp <= 0){
                    temp = temp*-1;
                    len = 1;
                }
                while(temp>0){
                    temp = temp/10;
                    len++;
                }
                if(len>max){
                    max = len;
                }
            }
            arr[j]=max;
        }
    return arr;
    }
}