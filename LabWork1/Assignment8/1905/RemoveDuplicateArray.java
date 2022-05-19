import java.util.Scanner;

public class RemoveDuplicateArray {
	
	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		System .out.println("Enter the size of array that is to be created :");
		
		int size = r.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the element of the array : ");
		for(int i=0; i<size; i++)
		{
			arr[i]=r.nextInt();
		}
		System.out.println("The array created is:");
		for(int i=0; i<size;i++)
		{
			System.out.println(arr[i]);
		}
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<size-1;i++)
			{
				if(arr[i]!=arr[i+1])
				{
					temp[j]=arr[i];
					j++;
				}
			}
		temp[j++]=arr[size-1];
		System.out.println("Array after removing elements :");
		for(int m=0;m<j;m++)
		{
			System.out.println(temp[m]);
		}
	}
}

	
