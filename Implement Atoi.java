// { Driver Code Starts
import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			GfG g = new GfG();
			System.out.println(g.atoi(str));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete this method */
class GfG
{
    int atoi(String str) {
	    int len = str.length();
	    int ans = 0;
	    boolean negative =  false;
	    for (int i = 0 ; i < len ; i++) {
	        char curr = str.charAt(i);
	        if (curr == 45) {
	            negative = ! negative;
	            continue;
	        }
	        if (curr < 48 || curr > 57) {
	            ans = -1;
	            break;
	        }
	        ans = ans * 10 + Character.getNumericValue(curr);
	    }
	    if (negative)
	        return ans*-1;
	   return ans;
    }
}
