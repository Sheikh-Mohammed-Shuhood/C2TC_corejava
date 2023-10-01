package Overloading;

public class Demo {

	private float x;
	private float y;
	private float z;

	public Demo() {
		super();
	}
	
	public Demo(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Demo(float x) {
		super();
		this.x = x;
	}

	public Demo(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "z=" + z +"]";
	}
}
