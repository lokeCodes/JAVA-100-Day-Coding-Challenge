class Solution {
    public int countSeniors(String[] details) {
        int n = details.length;
        int count = 0;
        for(int i=0;i<n;i++){
            String temp = details[i];
            String age = temp.substring(11,13);
            int s = Integer.parseInt(age);
            if(s>60){
                count++;
            }
        }
        return count;
    }
}