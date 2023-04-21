// https://www.codechef.com/problems/TSTROBOT
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt();
            int x = s.nextInt();
            String x1 = s.next();
            int c[] = new int[n+1];
            c[0]=x;
            for(int i=0;i<n;i++){
                if(x1.charAt(i)=='R'){
                    x++;
                }else{
                    x--;
                }
                c[i+1]=x;
            }
            
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n+1;j++){
                    if(c[i]==c[j]){
                        c[j]=10000001;
                    }
                }
            }
            
            int count=0;
            for(int i=0;i<n+1;i++){
                    if(c[i]==10000001){
                        continue;
                    }else{
                        count++;
                    }
            }
            System.out.println(count);
        }
	}
}
