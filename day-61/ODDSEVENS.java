// https://www.codechef.com/problems/ODDSEVENS
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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    String res = (a+b)%2==0 ? "Bob" : "Alice";
		    System.out.println(res);
		}
	}
}
