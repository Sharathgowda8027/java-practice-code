package cmpleexception;


public class ola {
static void ride() throws olaException
{
	int nopass=14;
	if(nopass<=4){
		System.out.println("happy journey.....");
	}else{
		throw new olaException("invalid no of passengers");
	}
}
public static void main(String[] args) {
	try {
		ride();
	} catch (olaException e) {
	System.out.println(e.getMessage());
	}
}
}
class olaException extends Exception{
	 String msg;
	olaException(String msg){
		this.msg=msg;
	}
	public String getMessage(){
		return msg;
	}
}

