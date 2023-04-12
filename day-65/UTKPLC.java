// https://www.codechef.com/problems/UTKPLC
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
		    char arr1[] = new char[3];
		    char arr2[] = new char[2];
		    
		    for(int i=0;i<3;i++){
		        arr1[i] = s.next().charAt(0);
		    }
		    
		    for(int i=0;i<2;i++){
		        arr2[i] = s.next().charAt(0);
		    }
		    
		    int count = 0;
		    char ans = '\0';
		    for(int i=0;i<3;i++){
		        for(int j=0;j<2;j++){
		            if(arr2[j]==arr1[i]){
		                ans = arr2[j];
		                count++;
		            }
		        }
		        if(count==1){
		            System.out.println(ans);
		            break;
		        }
		    }
		}
	}
}
