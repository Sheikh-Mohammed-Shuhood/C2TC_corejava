package Day2;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		
		switch (x) 
		{
		case 1: 
			System.out.println("The value of x is 1");
			break;
		case 2:
			System.out.println("The value of x is 2");
			break;
		case 3:
			System.out.println("The value of x is 3");
			break;
		default:
		System.out.println("The value of x is other than 1,2,3");
			break;

		}
		

		char y = 'Z';
		switch (y) 
		{
		case 'a' : 
		case 'A' : 
			System.out.println("The value of x is a");
			break;
		case 'b':
		case 'B' :
			System.out.println("The value of x is b");
			break;
		case 'c':
		case 'C' :	
			System.out.println("The value of x is c");
			break;
		default:
	System.out.println("The value of x is other than a,b,c");
			break;
		}


		String name = "team";

		switch (name.toLowerCase()) 
		{
		case "author":
			System.out.println("Vikas");
			break;
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		case "editor":
			System.out.println("Vishnu & Krishna");
			break;
		default:
			System.out.println("Invalid entry");
			break;
	}


	}

}
