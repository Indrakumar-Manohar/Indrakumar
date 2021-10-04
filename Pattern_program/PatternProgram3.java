package helloWorld;

public class PatternProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i = a; i>0; i--){
			for(int j = ((a-i)+1); j<=a; j++){
				System.out.print(j+" ");
			}
			System.out.println("");
		}

	}

}
