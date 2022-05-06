
public class StringWithin {

	public static void main(String[] args)
	{
		String String="Java is a programming language and a platform.";
		String word="a";
		String temp[]=String.split(" ");
		
		int count = 0;
		for(int i = 0; i<temp.length; i++)
		{
			if(word.equals(temp[i]))
				count++;
		}
		System.out.println(" The String is : " + String);
		System.out.println(" The word " + word + " occurs " + count + " time is the above string ");
	}

}
