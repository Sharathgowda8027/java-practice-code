package arrayreverse;

public class mainclass5{
	public static void main(String[] args) {
		String[] arr={"hello","3"};
		revstring(arr);
	}
	static void revstring(String[] arr){
		int x=Integer.parseInt(arr[1]);
		String str=arr[0];
		String rev="";
		
		for (int i=str.length()-x;i<str.length();i++) {
			rev=rev+str.charAt(i);
		}
		for(int i=1;i<=x;i++){
			System.out.print(rev);
		}
	}

}
