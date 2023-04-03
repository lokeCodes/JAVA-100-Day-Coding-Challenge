// https://www.codechef.com/problems/PROBCAT
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
		    if(x<100 && x>=1){
		        System.out.println("Easy");
		    }else if(x>=100 && x<200){
		        System.out.println("Medium");
		    }else{
		        System.out.println("Hard");
		    }
		}
	}
}
