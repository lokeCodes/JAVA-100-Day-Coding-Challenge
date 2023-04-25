// https://www.codechef.com/problems/HAPPYSTR
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
		    String str = s.next();
		    int count = 0;
		    for(int i=0;i<str.length()-3;i++){
		        String temp = str.substring(i,i+3);
		        for(int j=0;j<temp.length();j++){
		            char ch = temp.charAt(j);
		            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		                count++;
		            }
		        }
		        if(count>2){
		            break;
		        }else{
		            count=0;
		        }
		    }
		    if(count>2){
		        System.out.println("Happy");
		    }else{
		        System.out.println("Sad");
		    }
		}
	}
}
