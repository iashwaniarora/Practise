package java.stringtest;

public class Test {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		if(!t1.equals(t2))
			System.out.println("t1 is not equal to t2" );
		if(t1 instanceof Object)
			System.out.println("t1 is object of Object");
	}
}
