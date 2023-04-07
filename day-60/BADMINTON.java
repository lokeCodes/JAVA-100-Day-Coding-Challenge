// https://www.codechef.com/problems/BADMINTON
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
		    int p = s.nextInt();
		    int res = p+1;
		    if(res%2==0){
		        System.out.println(res/2);
		    }else{
		        System.out.println((res/2)+1);
		    }
		}
	}
}
