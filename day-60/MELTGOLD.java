// https://www.codechef.com/problems/MELTGOLD
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
            int x = s.nextInt();
            int y = s.nextInt();
            int sum = y;
            for(int i=1;i<x;i++){
                sum = sum + i;
                if(sum>=x){
                    System.out.println(i);
                    break;
                }
            }
        }
	}
}
