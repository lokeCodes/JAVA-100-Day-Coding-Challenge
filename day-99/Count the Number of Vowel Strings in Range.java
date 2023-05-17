class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int n = words.length;
        int count = 0;
        for(int i=left;i<=right;i++){
            String temp = words[i];
            int len = temp.length();
            char f = temp.charAt(0);
            char l = temp.charAt(len-1);
            if(f=='a' || f=='e' || f=='i' || f=='o' || f=='u'){
                if(l=='a' || l=='e' || l=='i' ||l=='o'|| l=='u'){
                    count++;
                }
            }
        }
        return count;
    }
}