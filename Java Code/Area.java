
public class Area {
	
	int r = 15;
	
	void calcAreaCircle() {
		float a = 3.14f * r * r;
		System.out.println("Area is "+ a);
	}

	public static void main(String[] args) {
		
		Area obj = new Area();
		obj.calcAreaCircle();
	}

}
