package Cal;
import java.util.Scanner;
public class Count {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String y=sc.nextLine();
		int m=y.length();
		int []arr =new int[m];
		for (int i=0;i<m;i++)
		{
			arr[i]=y.charAt(i);
		}
		for(int i=0;i<m;i++)
		{
			int count=1;
			if(arr[i]!=0)
			
				for(int j=i+1;j<m;j++)
				{
					if((arr[i]==arr[j]))
					{
						count++;
						arr[j]=0;
					}
						
				}
			if(arr[i]!=0)
			{
				System.out.println((char)arr[i]+" "+count);
			}
		}
	}

}
