// https://www.codechef.com/problems/CFRTEST
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    int day[] = new int[101];
		    for(int i=0;i<n;i++){
		        arr[i] = s.nextInt();
		        day[arr[i]]++;
		    }
            
            int count = 0;
            for(int i=0;i<n;i++){
                if((day[arr[i]])>1){
                    day[arr[i]]--;
                }else{
                    count++;
                }
            }
            System.out.println(count);
		    
		    
		}
	}
}
