package sum;

public class Sample {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8};
		sumofarray(arr);
	}
	static void sumofarray(int[] abb)
	{
		int sum=0;
		for (int i = 0; i < abb.length; i++) {
			sum=sum+abb[i];
			
		}
		System.out.println(sum);
	}

}
