package arrayreverse;
//hello,3   hello,2 hello,4
public class mainclass6 {
	public static void main(String[] args) {
		String str="hello";
		int no=4;//3,2
			String	str1=str.substring(1);//2,3 starting index 
			//if we want till middle(start and ending index no)
	
	for(int i=str1.length()-no;i<str1.length();i++){
		System.out.print(str1);
	}
	}

}

//another method
/*String str="hello";
		int no=4;
		for(int i=1;i<=no;i++){
		sop(Str.substring(str.length()-no));
		} */
