public class Pattern2{
	public static void main(String[] a){
int r = 5,c =5;
		for(int i = 0;i < r;i++){
			for(int j = 0;j <c ;j++){
				if(i ==1||i==r||j == 1||j==c) System.out.print("*");
			else System.out.print(" ");
}
		System.out.println("");
}
}
}