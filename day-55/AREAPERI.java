// https://www.codechef.com/problems/AREAPERI
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		double l = s.nextInt();
		double b = s.nextInt();
		double area = l*b;
		double peri = 2*(l+b);
		if(area==peri){
		    System.out.println("Eq");
		    System.out.println((int)area);
		}else if(area>peri){
		    System.out.println("Area");
		    System.out.println((int)area);
		}else{
		    System.out.println("Peri");
		    System.out.println((int)peri);
		}
	}
}
