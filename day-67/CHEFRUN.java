// https://www.codechef.com/problems/CHEFRUN
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
		    int x1 = s.nextInt();
		    int x2 = s.nextInt();
		    int x3 = s.nextInt();
		    int v1 = s.nextInt();
		    int v2 = s.nextInt();
		    int d1 = Math.abs(x1-x3);
		    int d2 = Math.abs(x2-x3);
		    double res1 = (double)d1/v1;
		    double res2 = (double)d2/v2;
		    if(res1==res2){
		        System.out.println("Draw");
		    }else if(res1<res2){
		        System.out.println("Chef");
		    }else if(res2<res1){
		        System.out.println("Kefa");
		    }
		}
	}
}
