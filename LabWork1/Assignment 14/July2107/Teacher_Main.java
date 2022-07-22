import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Teacher_Main {

	public static void main(String[] args) {
		
		Map<Teacher,String> map = new LinkedHashMap<Teacher,String>();
		
		map.put(new Teacher("Swati mam","C program"),"Associate");
		map.put(new Teacher("Suchita mam","AI"),"HOD");
		map.put(new Teacher("Minakshi mam","Python"),"Co ordinator");
		map.put(new Teacher("Shraddha mam","MIS"),"Co-Associate");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the teacher name :");
		String tn = sc.nextLine();
		
		System.out.println("Enter the subject :");
		String sub = sc.nextLine();
		
		if(map.remove(new Teacher(tn,sub))==null)
		{
			System.out.println("No such data Available ..");
		}
		else
		{
			System.out.println("Data deleted successfully ..");
		}
	}

}
