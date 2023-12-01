package sum;

public class Sample22 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8};
		sumofarray(arr);
	}
	static void sumofarray(int[] abb)
	{
		int sum=0;
		for (int i = abb.length-1; i >=0; i--) {
			sum=sum+abb[i];
			
		}
		System.out.println(sum);
	}

}
