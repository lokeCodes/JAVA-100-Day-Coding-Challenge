// https://www.codechef.com/problems/FACEDIR
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
		    int sec = s.nextInt();
		    while(sec>4){
		        sec = sec-4;
		    }
		    if(sec==0 || sec==4){
		        System.out.println("North");
		    }else if(sec==1){
		        System.out.println("East");
		    }else if(sec==2){
		        System.out.println("South");
		    }else{
		        System.out.println("West");
		    }
		}
	}
}
