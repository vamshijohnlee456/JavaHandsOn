package JavaPackage;



public class Constructor {
	public int i;

	//public static void main(String[] args) {
	//Constructor cp = new Constructor();
	//System.out.println(cp.i);
	

	public Constructor(int a){
		i=a;
		System.out.println("this is explicit unpara construct");
	}

	public static void main(String[] args) {
		Constructor cp = new Constructor(44);
		  System.out.println(cp.i);

	 
}
}