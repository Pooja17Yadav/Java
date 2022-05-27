package practicesprograms;

public class Exception1 {

	public static void main(String[] args) 
	{
		try
		{
			int[]arr=new int[5];
			
			arr[0]=10;
			arr[1]=10+54;
			arr[2]=10/5;
			arr[3]=10*2;
			arr[4]=10-4;
			
			System.out.println(arr[3]);
			
			System.out.println("Try Block");
		}catch(Exception e)
		{
			System.out.println("catch Block");
		}
		

	}

}
