// https://www.codechef.com/problems/PRIMEREVERSE
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
		    int n = s.nextInt();
		    String a = s.next();
		    String b = s.next();
		    int a0 = 0;
		    int b0 = 0;
		    int a1 = 0;
		    int b1 = 0;
		    for(int i=0;i<n;i++){
		       if(a.charAt(i)=='0'){
		           a0++;
		       }else{
		           a1++;
		       }
		       
		       if(b.charAt(i)=='0'){
		           b0++;
		       }else{
		           b1++;
		       }
		    }
		    if(a0==b0 && a1==b1){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
