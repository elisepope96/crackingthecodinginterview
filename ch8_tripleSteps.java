/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(staircase(3));
	}
	
	public static int staircase(int steps){
	    if (steps < 0){
	        return 0;
	    }
	    if (steps == 0){
	        return 1;
	    }
	    return staircase(steps - 1) + staircase(steps-2) + staircase(steps-3);
	}
	
}
