class Shopping{
	String pr;double p;
	void method(){
		class ShippingDetails{
			void display(){
				System.out.println("Product : " + pr+"\nPrice "+p);
			}
		}
		ShippingDetails s = new ShippingDetails();
		s.display();
	}
	public static void main(String[] ar){
	Shopping s = new Shopping();
	s.pr = "Car";
	s.p = 399.99;
	s.method();
	}
}	
				