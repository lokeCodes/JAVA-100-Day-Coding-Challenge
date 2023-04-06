// https://www.codechef.com/problems/ELECTN
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
		    int x = s.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=s.nextInt();
		    }
		    
		    int count = 0;
		    for(int i=0;i<n;i++){
		        if(arr[i]>=x){
		            count++;
		        }
		    }
		    
		    System.out.println(count);
		}
	}
}
