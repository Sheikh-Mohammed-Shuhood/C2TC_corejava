package Overloading;

public class MethodOverloading {

	public static int addition(int a, int b) {
		return a+b;
	}

	public static float addition(float a, float b) {
		return a+b;
	}
	
	public static double addition(double a, double b) {
		return a+b;
	}

	public static int addition(int a, int b, int c) {
		return a+b;
	}		
	
	public static double addition(float a, float b , float c) {   //overloaded 
		return a+b;
	}
}
