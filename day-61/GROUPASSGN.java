// https://www.codechef.com/problems/GROUPASSGN
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
		    int r = s.nextInt();
		    System.out.println(((2*g)-r)+1);
		}
	}
}
