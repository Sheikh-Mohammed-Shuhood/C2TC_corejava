package Day2;

public class breakandcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1; i<=10; i++)
        {
       	 if(i == 1)
       	 {
       		 continue;   // break;
       	 }
       	 System.out.println(i);
        }

        for(int i=1; i<=10; i++)
        {
       	 if(i == 2)
       	 {
       		 break;   // break;
       	 }
       	 System.out.println(i);
        }


	}

}
