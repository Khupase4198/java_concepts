package IQ;

public class test {
	int a = 10;
	public void mytest() {
		System.out.println("Hello test");
	}
}
class helloo extends test{
	int x = 100;
	public void byebye() {
		System.out.println("Bye Bye");
	}
}
class Lala {
	public static void main(String args[]) {
		helloo h = new helloo();
				System.out.print(h.a);
				System.out.print(h.x);
				h.mytest();
				h.byebye();
	}
}
