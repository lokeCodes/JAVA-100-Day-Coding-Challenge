// https://www.codechef.com/problems/ALTERADD
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
		    int a = s.nextInt();
		    int b = s.nextInt();
            int dif = b-a;
            if(dif%3==2){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
		}
	}
}
