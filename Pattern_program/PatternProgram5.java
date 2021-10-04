package helloWorld;

public class PatternProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i = 1; i<=a; i++){
			for(int j = ((a-i)+1); j<=a; j++){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
