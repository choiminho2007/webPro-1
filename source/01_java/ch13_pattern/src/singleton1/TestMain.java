package singleton1;
public class TestMain {
	public static void main(String[] args) {
		SingletonClass obj1 
			= SingletonClass.getInstane();
		SingletonClass obj2 
			= SingletonClass.getInstane();
		obj1.setI(99);
		System.out.println("obj1�� i : "+obj1.getI());
		System.out.println("obj2�� i : "+obj2.getI());
		obj2.setI(10);
		System.out.println("obj1�� i : "+obj1.getI());
		System.out.println("obj2�� i : "+obj2.getI());
	}
}
