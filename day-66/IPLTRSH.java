//https://www.codechef.com/problems/IPLTRSH
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
		    int m = s.nextInt();
		    int res = m>=n ? 0 : n-m;
		    System.out.println(res);
		}
	}
}
