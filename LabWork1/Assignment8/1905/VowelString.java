import java.util.Scanner;

public class VowelString {

	public static void main(String[] args) {
		
		int vowelcount =0;
		Scanner str= new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String sentence = str.nextLine();
		
		for(int i=0; i<sentence.length(); i++)
		{
			char ch = sentence.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowelcount ++;
			}
		}
		System.out.println("Number of vowel in the given sentence is : "+vowelcount);
	}

}
