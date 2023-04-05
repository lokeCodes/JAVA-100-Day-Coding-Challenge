// https://www.codechef.com/problems/FLOW009
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
		    double x = s.nextInt();
		    double y = s.nextInt();
		    double dis;
		    if(x>=1000){
		        dis = (x*y)/10;
		        System.out.println((x*y)-dis);
		    }else{
		        System.out.println(x*y);
		    }
		    
		}
	}
}
