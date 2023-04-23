// https://www.codechef.com/problems/COMPRESSVD
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
		    int arr[] = new int[n];
		    int len = arr.length;
		    for(int i=0;i<len;i++){
		        arr[i]=s.nextInt();
		    }
		    
		    int count = 0;
		    for(int i=0;i<n-1;i++){
		        if(arr[i]==arr[i+1]){
		            count++;
		        }
		    }
            System.out.println(n-count);		    
		}
	}
}
