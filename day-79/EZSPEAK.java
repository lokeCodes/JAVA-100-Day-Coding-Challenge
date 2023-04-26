// https://www.codechef.com/problems/EZSPEAK
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.  in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    String w = s.next();
		    int count = 0;
		    for(int i=0;i<=w.length()-4;i++){
		        String r = w.substring(i,i+4);
		        for(int j=0;j<r.length();j++){
		            char ch = r.charAt(j);
		            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		                continue;
		            }else{
		                count++;
		            }
		        }
		        if(count>3){
		            break;
		        }else{
		            count = 0;
		        }
		    }
		 
		 if(count>3){
		     System.out.println("NO");
		 }else{
		     System.out.println("YES");
		 }
		    
		}
	}
}
