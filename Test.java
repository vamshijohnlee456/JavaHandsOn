package JavaPackage;

public class Test {
     int i;
     int j;
	public Test() {
		i=10;
		j=20;
	}
	public Test(int i, int j) {
		this.i =i;
		this.j= j;
	}
	
	
	public static void main(String[] args) {
         Test t1 = new Test();
         Test t2 = new Test(30, 40);
         System.out.println(t1.i + t1.j);
         System.out.println(t2.i + t2.j);
         System.out.println(t1.sum());
         System.out.println(t2.sum());
	}

	
	public int sum() {
		int sum = i*j;
		return sum;
		
	}
}
