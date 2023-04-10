// https://www.codechef.com/problems/DRUNKALK
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
		    int k = s.nextInt();
		    int f = k%2==0 ? k/2 : (k/2)+1 ;
		    int res = (3*f)-(k-f);
		    System.out.println(res);
		}
	}
}
