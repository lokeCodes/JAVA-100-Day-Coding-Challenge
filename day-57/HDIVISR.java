// https://www.codechef.com/problems/HDIVISR
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=10;i>0;i--){
		    if(n%i==0){
		        System.out.println(i);
		        break;
		    }
		}
	}
}
