package helloWorld;

public class PatternProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i = a; i>0; i--){
			for(int j = a; j>=((a-i)+1); j--){
				System.out.print(j+" ");
			}
			System.out.println("");
		}

	}

}
