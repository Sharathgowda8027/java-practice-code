package abstrt;
abstract class sample
{
	abstract void disp();
	abstract void test();
}
class demo extends sample
{
	void disp()
	{
		System.out.println("hello");
	}
	void test()
	{
			System.out.println("bye");
	}
}

public class mainclass {
	public static void main(String[] args) {
		demo d1=new demo();
		d1.disp();
		d1.test();
				
	}

}
