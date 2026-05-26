class University{
	static class Department{
		String dep ;
		void display(){
			System.out.println("Department : " + dep);
		}
	}
	public static void main(String[] ar){
		University.Department d = new University.Department();
		d.dep = "AIML";
		d.display();
	}
}