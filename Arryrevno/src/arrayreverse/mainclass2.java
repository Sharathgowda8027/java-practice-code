package arrayreverse;
//wap to print reverse order no in array
public class mainclass2 {
	public static void main(String[] args) {
		int[] arr={348,264,784,642,378};
		for (int i = 0; i < arr.length; i++) {
			int x=reversenumbers(arr[i]);
			System.out.print(x+" ");
		}
			
		}
 static int reversenumbers(int input1){
	 int reverse=0;
	 while(input1!=0){
		 int rem=input1%10;
		 reverse=(reverse*10)+rem;
		 input1=input1/10;
	 }
	 return reverse;
 }
}
