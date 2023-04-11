// https://www.codechef.com/problems/DIFFCONSEC
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
		    String inp = s.next();
            int count = 0;
            for(int i=0;i<n-1;i++){
                if(inp.charAt(i)==inp.charAt(i+1)){
                    count++;
                }
            }
            System.out.println(count);
		}
	}
}
