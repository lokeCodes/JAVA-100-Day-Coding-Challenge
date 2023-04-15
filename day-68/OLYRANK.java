// https://www.codechef.com/problems/OLYRANK
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
		    int g1 = s.nextInt();
		    int s1 = s.nextInt();
		    int b1 = s.nextInt();
		    int g2 = s.nextInt();
		    int s2 = s.nextInt();
		    int b2 = s.nextInt();
		    int r1 = g1+s1+b1;
		    int r2 = g2+s2+b2;
		    int res = r1>r2 ? 1 : 2;
		    System.out.println(res);
		}
	}
}
