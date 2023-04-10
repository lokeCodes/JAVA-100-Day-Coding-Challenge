// https://www.codechef.com/problems/CCISLAND
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
	        int x = s.nextInt();
	        int y = s.nextInt();
	        int xr = s.nextInt();
	        int yr = s.nextInt();
	        int d = s.nextInt();
	        int r1 = xr*d;
	        int r2 = yr*d;
	        if(x>=r1 && y>=r2){
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    }
	}
}
