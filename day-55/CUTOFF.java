// https://www.codechef.com/problems/CUTOFF
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
		    int tn = s.nextInt();
		    int pn = s.nextInt();
		    int arr[] = new int[tn];
		    for(int i=0;i<tn;i++){
		        arr[i]=s.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    int res = arr[tn-pn] - 1;
		    System.out.println(res);
		}
	}
}
