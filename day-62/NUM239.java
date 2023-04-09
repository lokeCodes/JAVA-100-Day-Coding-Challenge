// https://www.codechef.com/problems/NUM239
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
		    int l = s.nextInt();
		    int r = s.nextInt();
		    int count =0;
		    for(int i=l;i<=r;i++){
		        int temp = i%10;
		        if(temp==2 || temp==3 || temp==9){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
