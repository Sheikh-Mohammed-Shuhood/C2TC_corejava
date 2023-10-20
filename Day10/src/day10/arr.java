package day10;

public class arr {

	public static void printArray(int ar[][]) {
		for(int i=0;i<ar.length;i++) 
		{
			for(int j=0;j<ar[i].length;j++) 
			{	
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
