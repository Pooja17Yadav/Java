package Pallindrome;

public class CountPallindrome 
{
	static int checkPallindrome(String s)
	{
		String con = s.toLowerCase();
		int len = con.length();
		
		for(int i=0;i<=len/2;i++)
		{
			if(con.charAt(i)!=con.charAt(len-1-i))
			{
				return -1;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) 
	{
		String s1="java is a programming language and a platform.";
		String[] arr=s1.split(" ");
		int ar_len=arr.length;
		int count = 0;
		for(int i=0;i<ar_len;i++)
		{
			try {
				if(checkPallindrome(arr[i])==1)
				{
					count= count+1;
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(count);
	}

}
