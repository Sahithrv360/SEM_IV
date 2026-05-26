public class Calculator{
		int a,b,c;

		int add(int a,int b){
			System.out.println("Add1 : "+(a+b));
			return 0;
			}
		double add(double a,double b){
			System.out.println("Add1 : "+(a+b));
			return 0;
			}
		int add(int a,int b,int c){
			System.out.println("Add1 : "+(a+b+c));
			return 0;
			}
	public static void main(String[] s){
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		Calculator c3 = new Calculator();

		c1.add(1,2);
		c2.add(2.3,4.2);
		c3.add(1,2,3);
	}
}
