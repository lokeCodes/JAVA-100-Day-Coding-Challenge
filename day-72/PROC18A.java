// https://www.codechef.com/problems/PROC18A
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
		    int k = s.nextInt();
		    int n = s.nextInt();
		    int arr[] = new int[k];
		    for(int i=0;i<k;i++){
		        arr[i]=s.nextInt();
		    }
		    
		   int max =-1;
		   for(int i=0;i<=k-n;i++){
		       int sum = 0;
		       for(int j=0;j<n;j++){
		           sum += arr[i+j];
		       }
		       if(sum>max){
		           max = sum;
		       }
		   }
		   System.out.println(max);
		   
		}
	}
}