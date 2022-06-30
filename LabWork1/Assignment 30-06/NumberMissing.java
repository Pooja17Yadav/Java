
public class NumberMissing {

	static int NumberMissing(int array[], int n)
	{
		int temp=0;
		int sum=0;
		
		for(int i=0; i<n-1; i++)
		{
			sum += array[i];
		}
		temp = n * (n + 1) / 2;
		
		return(temp-sum);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,8,9,10};
		
		System.out.println(NumberMissing(arr,10));
	}
}
