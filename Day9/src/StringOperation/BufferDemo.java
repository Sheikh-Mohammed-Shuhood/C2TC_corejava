package StringOperation;

public class BufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String s1=new String("Hello");
		s1.concat("World");
		System.out.println(s1);
		String s2=s1.concat("World");
		System.out.println(s2);

		StringBuffer sb=new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb); 
	}

}
