// https://www.codechef.com/problems/MATCHES
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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int sum = a+b;
		    //[0,1,2,3,4,5,6,7,8,9]=>no of matchsticks required for a single number
		    int arr[] = {6,2,5,5,4,5,6,3,7,6};
		    int totSum = 0;
		    while(sum>0){
		        int lastDigit = sum%10;
		        totSum = totSum+arr[lastDigit];
		        sum = sum/10;
		    }
		    System.out.println(totSum);
		}
	}
}
