package Interface;

interface Dad{
	void snoring();
	
}

interface Mom{
	void snoring();
}

class You implements Dad,Mom{
	public void snoring() {
		System.out.println("Snoring habit");
	}
}
public class MultipleInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		You abc = new You();
		abc.snoring();

	}

}
