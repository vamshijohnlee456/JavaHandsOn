package JavaPackage;

public class Demo {
	public int a=100;
	static int b=100;
	public String name = "vamshi";
	public static void main(String[] args) {
		Demo obj = new Demo();
		
		System.out.println("hello");
		System.out.println(obj.name  );
		System.out.println(b);
		System.out.println("int b is" + " " + b + " " + "and name is" + " " + obj.name);
	}

}
