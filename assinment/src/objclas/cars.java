package objclas;

public class cars {
	
		
		int cost;
		String brand;
		String colour;
		cars(int cost,String brand,String colour)
		{
			this.cost=cost;
			this.brand=brand;
			this.colour=colour;
			
		}
		
		public boolean equals(Object obj)
		{
			cars b1=(cars)obj;
			
			
			return this.brand==b1.brand;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			cars b1=new cars(10000,"bajaj","black");
			cars b2= new cars(200000,"yamaha","red");
			System.out.println(b1.equals(b2));
			
			
		}

	}



