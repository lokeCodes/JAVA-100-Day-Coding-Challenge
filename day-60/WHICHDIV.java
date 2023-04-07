// https://www.codechef.com/problems/WHICHDIV
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
		    int r = s.nextInt();
		    if(r>=2000){
		        System.out.println(1);
		    }else if(r>=1600 && r<2000){
		        System.out.println(2);
		    }else{
		        System.out.println(3);
		    }
		}
	}
}
