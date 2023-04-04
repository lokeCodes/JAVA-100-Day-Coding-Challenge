// https://www.codechef.com/problems/CARCHOICE
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
		    double x1 = s.nextInt();
		    double x2 = s.nextInt();
		    double y1 = s.nextInt();
		    double y2 = s.nextInt();
		    double res1 = y1/x1;
		    double res2 = y2/x2;
		    if(res1==res2){
		        System.out.println(0);
		    }else if(res1<res2){
		        System.out.println(-1);
		    }else{
		        System.out.println(1);
		    }
		}
	}
}
