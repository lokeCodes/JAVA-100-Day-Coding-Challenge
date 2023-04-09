// https://www.codechef.com/problems/CHEFCONTEST
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
		    int p = s.nextInt();
		    int q = s.nextInt();
		    int res1 = x+(p*10);
		    int res2 = y+(q*10);
		    if(res1==res2){
		        System.out.println("Draw");
		    }else if(res1>res2){
		        System.out.println("Chefina");
		    }else{
		        System.out.println("Chef");
		    }
		}
	}
}
