// https://www.codechef.com/problems/EQUALELE
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
		    for(int i=0;i<n;i++){
		        arr[i] = s.nextInt();
		    }
		    
		    n = n-1;
		    Arrays.sort(arr);
		    int maxF = 0,curF;
		    int count = 0;
		    for(int i=0;i<n;i++){
		        
		        curF = 0;
		        while(i<n && arr[i]==arr[i+1]){
		            curF++;
		            i++;
		        }
		        if(curF>maxF){
		            maxF = curF;
		        }
		    }
		  //  System.out.println(n+" "+maxF);
		    System.out.println(n-maxF);

		}
	}
}
