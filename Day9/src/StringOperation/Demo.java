package StringOperation;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("   Indian   ");
		System.out.println(s1);
		

		System.out.println(s1.trim());
		System.out.println(s1.strip());
		
		System.out.println(s1.isEmpty());
		
		char s[]= {'I','n','d','i','a'};
		String s2=new String(s);
		System.out.println(s2);
	}

}
