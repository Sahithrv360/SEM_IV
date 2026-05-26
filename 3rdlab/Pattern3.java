public class Pattern3{
	public static void main(String[] a){
int s = 5;
		for(int i = 0;i < s;i++){
			for(int j = 0;j <s ;j++){
				if(j == 1||j==s-i+1) System.out.print("*");
			else System.out.print(" ");
}
		System.out.println("");
}
}
}