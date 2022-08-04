package MavenJDBC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("Enter the Data you want to perform:");
		System.out.println("1. Create Table");
		System.out.println("2. Insert Data");
		System.out.println("3. Update Data");
		System.out.println("4. Delete Data");
		System.out.println("5. Fetch  Data");
		int ch=sc.nextInt();
		switch (ch)
		{
			case 1:	CreationTable ct=new CreationTable();
					ct.createtable();
					break;
					
			case 2: InsertionData Id=new InsertionData();
					Id.insertdata();
					break;
					
			case 3: UpdateData ud=new UpdateData();
					ud.updateData();
					break;
					
			case 4: DeleteData del=new DeleteData();
					del.deleteData();
					break;
					
			case 5: FetchData fd=new FetchData();
					fd.fetchdata();
					break;	
		}
		}
		catch(Exception e){}
		finally
		{	
			sc.close();
		}
	}

}
