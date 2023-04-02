// https://www.codechef.com/problems/VISA
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
		    int x1 = s.nextInt();
		    int x2 = s.nextInt();
		    int y1 = s.nextInt();
		    int y2 = s.nextInt();
		    int z1 = s.nextInt();
		    int z2 = s.nextInt();
		    if(x2>=x1 && y2>=y1 && z2<=z1){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
