package abstrt;
abstract class Sample1
{
	abstract void disp();
	abstract void test();
}
abstract class demo1 extends Sample1
{
	void disp()
	{
		System.out.println("hello");
	}
}
class tester extends demo
{/*void disp()
	{
		System.out.println("hello");
	}*/
	
     void test()
	{
			System.out.println("bye");
	}
 }

public class mainclass1 {
	public static void main(String[] args) {
		tester d1=new tester();
		d1.disp();
		d1.test();
				
	}

}
