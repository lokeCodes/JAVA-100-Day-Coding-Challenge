// https://www.codechef.com/problems/MATPAN
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
		    int arr1[] = new int[26];
		    for(int i=0;i<26;i++){
		        arr1[i] = s.nextInt();
		    }
		    
		    String str = s.next();
		    int freq[] = new int[26]; 
		    for(int i=0;i<str.length();i++){
		        int temp = (int)str.charAt(i);
		        int temp1 = Math.abs(97-temp);
		        freq[temp1]++;
		    }
		    
		    int sum = 0;
		    for(int i=0;i<26;i++){
		        if(freq[i]==0){
		            sum += arr1[i];
		        }
		    }
		    System.out.println(sum);
		    
		}
	}
}
