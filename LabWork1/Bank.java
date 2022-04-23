package Assignment4Quest3;

class Bank {
		String Name;
	    String Address;
	    int contact;
	    void Bank(String name,int contact,String address)
	    {
	    		this.Name=name;
	    		this.Address=address;
	    		this.contact=contact;
	    		System.out.println("Name of the Bank is "+Name+".");
	    		System.out.println("Address of the Bank is "+Address+".");
	    		System.out.println("Customer care no. of the Bank is "+contact+".");
	    }
}
 class ATM extends Bank
 {
	    String ATM_Name;
	    String Location;
	    void Bank(String name, String location)
	    {
	    	this.ATM_Name=name;
    		this.Location=location;
    		System.out.println("ATM Name :"+ATM_Name+".");
    		System.out.println("Location of the ATM is "+location+".");
	    }
 }
 
