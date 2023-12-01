package arrayreverse;

public class mainclass7 {
	 void print(String str,int no){
		for(int i=1;i<=no;i++){
			System.out.print(str.substring(str.length()-no));
			}
		System.out.println();
	}
	
	public static void main(String[] args) {
		mainclass7 m1=new mainclass7();
		m1.print("hello",2);
		m1.print("hello",1);
		m1.print("hello",3);
		m1.print("hello",4);

	}

}
