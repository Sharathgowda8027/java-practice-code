package arrayreverse;
//to print only palindrome no
public class mainclass3 {
	public static void main(String[] args) {
		int[] arr={34832,26462,78431,64246,37873};
		for (int i = 0; i < arr.length; i++) {
			reverseNumber(arr[i]);
		}
		
	}
	static void reverseNumber(int input1){
		int copy=input1;
		int reverse=0;
		 while(input1!=0){
			 int rem=input1%10;
			 reverse=(reverse*10)+rem;
			 input1=input1/10;
		 }
		 if(copy==reverse)
		 {
			 System.out.print(reverse+" ");
			 
		 }
	}

}
