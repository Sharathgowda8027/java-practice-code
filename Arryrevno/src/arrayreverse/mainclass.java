package arrayreverse;

public class mainclass {
static int[] reversenumm(int[] abb){
	for(int i=0;i<abb.length;i++){
		int reverse=0;
		while(abb[i]!=0){
			int rem=abb[i]%10;
			reverse=(reverse*10)+rem;
			abb[i]=abb[i]/10;
			
		}
	
	}
	return reverse;
}
	public static void main(String[] args) {
		int[] arr={348,264,784,642,378};
	System.out.println(	reversenumm(arr));
		
	}

}
