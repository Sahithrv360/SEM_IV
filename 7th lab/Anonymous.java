interface Demo{
	void display();
}
class Anonymous{
	static Demo d = new Demo(){
	public void display(){
		System.out.println("Email sent : Hello ");
		}
	};
	public static void main(String[] ar){
		d.display();
	}
}
