// https://www.codechef.com/problems/LAPIN
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{   
    public static int asci(char c){
        int a = (int)c;
        return a-97;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    String str = s.next();
		    int n = str.length()/2;
		    char arr1[] = new char[n];
		    char arr2[] = new char[n];
		    int freq1[] = new int[26];
		    int freq2[] = new int[26];
		    for(int i=0;i<str.length();i++){
		        if(str.length()%2==0){
		            if(i<n){
		                arr1[i]=str.charAt(i);
		                int temp = asci(arr1[i]);
		                freq1[temp]++;
		            }else{
		                arr2[i-n]=str.charAt(i);
		                int temp = asci(arr2[i-n]);
		                freq2[temp]++;
		            }      
		        }else{
		            if(i<n){
		                arr1[i]=str.charAt(i);
		                int temp = asci(arr1[i]);
		                freq1[temp]++;
		            }else if(i==n){
		                continue;
		            }else if(i>n){
		                int temp1 = i-(n+1);
		                arr2[temp1]=str.charAt(i);
		                int temp = asci(arr2[temp1]);
		                freq2[temp]++;
		            }
		        }
		    }
		    
		    int count=0;
		    for(int i=0;i<26;i++){
		        if(freq1[i]==freq2[i]){
		           count++;
		        }
		    }
		    
		    if(count==26){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		     
		}
	}
}
