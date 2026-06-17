
public class C35ObjCloning2 implements Cloneable{

	int roll;
	String name;
	
	C35ObjCloning2(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		// Object Cloning in Java
		
		C35ObjCloning2 s1 = new C35ObjCloning2(101, "Sameer");
		C35ObjCloning2 s2 = (C35ObjCloning2) s1.clone();
		
		System.out.println(s1.roll + "  " + s1.name);
		System.out.println(s2.roll + "  " + s2.name);

	}

}
