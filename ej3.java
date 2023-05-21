public class ej3 {

	public static void main(String[] args) {
		int base=5;
		trianguloRecursivo(base);
	}
	public static void trianguloRecursivo(int base) {
		
		for(int i=0;i<base;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");		
		}
	}
}


