// https://www.codechef.com/problems/RELATIVE
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
	        int g = s.nextInt();
	        int c = s.nextInt();
	        int res = (c*c)/(2*g);
	        System.out.println(res);
	    }
	}
}
