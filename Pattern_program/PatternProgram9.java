package helloWorld;

public class PatternProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i = 1; i<=a; i++){
			for(int j = 1; j<=i; j++){
				if(((i+j)%2)==0){
					System.out.print("1 ");
				}
				else{
					System.out.print("0 ");
				}
			}
			System.out.println("");
		}
	}

}