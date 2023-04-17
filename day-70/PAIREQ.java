// https://www.codechef.com/problems/PAIREQ
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
		    int freq[] = new int[1001]; // [0 to 1000 => indices range]
		    for(int i=0;i<n;i++){
		        arr[i]=s.nextInt();
		        freq[arr[i]]++;
		    }
		    Arrays.sort(freq);
		    System.out.println(n-freq[1000]);
		}
	}
}
