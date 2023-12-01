package sum;

class simplu{
	static void sumofarray(int[] abb)
	{
		int sum=0;
		for (int i = 0; i<=abb.length-1; i++) {
			if(abb[i]%2==0){
			
			sum=sum+fact(abb[i]);
			}
		}
		System.out.println(sum);
	}
	
	static int fact(int no){
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class Sample4 {
 public static void main(String[] args) {
	int[] arr={1,3,2,4,5,6,7};
	simplu.sumofarray(arr);
	
	
	}
}

