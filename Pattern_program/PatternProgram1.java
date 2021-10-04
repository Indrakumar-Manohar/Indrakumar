package helloWorld;

public class PatternProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b , out;
		for (int i=1; i<=a ; i++)
		{
			System.out.print(i+" ");
			b = a;
			out = i;
			for (int j=1; j<i ; j++)
			{
				b--;
				out = out + b;
				System.out.print(out+" ");
			}
			out = 0;
			System.out.println("");
		}

	}

}
