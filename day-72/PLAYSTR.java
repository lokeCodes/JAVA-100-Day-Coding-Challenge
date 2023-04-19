// https://www.codechef.com/problems/PLAYSTR
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
		    String a1 = s.next();
		    String b1 = s.next();
		    char a[] = new char[n];
		    char b[] = new char[n];
		    for(int i =0;i<n;i++){
		        a[i]=a1.charAt(i);
		    }
		    for(int i=0;i<n;i++){
		        b[i]=b1.charAt(i);
		    }
		    
		    for(int i=0;i<n;i++){
		        if(a[i]!=b[i]){
		            for(int j=i+1;j<n;j++){
		                if(b[j]==a[i]){
		                    char temp = b[j];
		                    b[j] = b[i];
		                    b[i] = temp;
		                }
		            }
		        }
		    }
		    
		    int count = 0;
		    for(int i=0;i<n;i++){
		        if(a[i]==b[i]){
		            continue;
		        }else{
		            count++;
		        }
		    }
		    
		    if(count>0){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		    
		}
	}
}
