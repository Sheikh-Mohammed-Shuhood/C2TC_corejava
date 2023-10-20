package assignment;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Good";
		String str2 = new String("Morning");
		System.out.println(str1);
		System.out.println(str2);


		String s1 = "Hello World How are you?";
		int val = s1.indexOf('o');
		System.out.println(val);
		val = s1.indexOf("are");;
		System.out.println(val);
		val = s1.indexOf("World");
		System.out.println(val);
		val = s1.indexOf("o",8);
		System.out.println(val);
		
		
		String abc = "Hello";
		char ch = abc.charAt(3);
		System.out.println(ch);
		System.out.println(abc.charAt(1));
		char[] arr = abc.toCharArray();
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		

		int value = 10;
		String value1 = String.valueOf(value);
		System.out.println(value1 + 10);
		
		
		if(s1.contains("Hello"))
		{
			System.out.println("Contains");
		}
		else 
		{
			System.out.println("Doesnt Contain");
		}
		

		System.out.println(s1.endsWith("?"));
		System.out.println(s1.endsWith("you?"));
		System.out.println(s1.endsWith("abc"));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.startsWith("Hello"));
		

		String a1 = "Hello World";
		String a2 = "Hello World";
		String a3 = "HELLO INDIA";
		String a4 = "HELLO WORLD";
		System.out.println(a1.equalsIgnoreCase(a2)); 
		System.out.println(a1.equalsIgnoreCase(a3));
		System.out.println(a1.equalsIgnoreCase(a4));
		
		

		String name = "Good";
		String f1 = String.format("%s",name);
		String f2 = String.format("%f",32.33434);
		String f3 = String.format("%16.12f",32.33434);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		

		String emp = "";
		System.out.println(emp.isEmpty());
		System.out.println(str1.isEmpty());
		

		String join=String.join("","Hello","World");
		System.out.println(join);
		

		val = s1.lastIndexOf('o');
		System.out.println(val);
		

		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		

		String str3 = "Good";
		String str4 = new String("Good");
		String str5 = new String("Good");
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str5 == str4);
		System.out.println(str1.equals(str3));
		

		StringBuffer str6=new StringBuffer("Good");
		str6.delete(1,3);
		System.out.println(str6);
		str6.insert(1, "Morning");
		System.out.println(str6);
		String str7 = "Good Morning";
		String replace = str7.replace("Good","Happy");
		System.out.println(replace);
		

		str6.reverse();
		System.out.println(str6);
	}

}
