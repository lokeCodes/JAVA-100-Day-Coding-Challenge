class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                int o = 0,z=0;
                while(i<n && s.charAt(i)=='0'){
                    i++;
                    z++;
                }

                while(i<n && s.charAt(i)=='1'){
                    i++;
                    o++;
                }
                i--;
                System.out.println(z+" "+o);
                int len = Math.min(z,o);

                ans = Math.max(ans,len*2);
            }
        }
    return ans;
    }
}