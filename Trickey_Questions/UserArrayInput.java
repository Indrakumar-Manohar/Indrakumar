import java.util.Scanner;

public class UserArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Length : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.print("Array elements are :");
		for(int i=0;i<n;i++) {
			System.out.print(" "+ar[i]);
		}
	}

}
