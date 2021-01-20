// { Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends


/*
the function returns the 
position where the target string 
matches the string str

Your are required to complete this method */

class GfG
{
    int strstr(String str, String target)
    {
       int lenTar = target.length();
       int len = str.length();
       int ans = -1;
       
       for (int i = 0 ; i <= len-lenTar ; i++) {
           String s = str.substring(i, i+lenTar);
           if (s.equals(target)) {
               ans = i;
               break;
           }
       }
       return ans;
    }
}
