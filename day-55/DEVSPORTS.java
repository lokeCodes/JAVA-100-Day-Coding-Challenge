// https://www.codechef.com/problems/DEVSPORTS
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
	        int z = s.nextInt();
	        int y = s.nextInt();
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();
	        int bal = z-y;
	        int wp = a+b+c;
	        if(bal>=wp){
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    }
	}
}
