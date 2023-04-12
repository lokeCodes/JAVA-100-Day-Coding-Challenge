// https://www.codechef.com/problems/CARRYGOLD
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
		    int n = (s.nextInt())+1;
		    int x = s.nextInt();
		    int y = s.nextInt();
		    String res = (y*n)>=x ? "YES" : "NO";
		    System.out.println(res);
		}
	}
}
