// https://www.codechef.com/problems/PETSTORE
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
		    int freq[] = new int[101];
		    for(int i=0;i<n;i++){
		        arr[i] = s.nextInt();
		    }
		    
		    for(int i=0;i<n;i++){
		        freq[arr[i]]++;
		    }
		    
		    int count = 0;
		    if(n%2==0){
		        for(int i=0;i<n;i++){
		            if(freq[arr[i]]%2==0){
		                count++;
		            }
		        }
		    }
		    
		    
		    if(n%2!=0){
		        System.out.println("NO");
		    }else if(n%2==0 && count==n){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
