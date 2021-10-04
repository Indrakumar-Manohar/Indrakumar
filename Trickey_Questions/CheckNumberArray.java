import java.util.Scanner;

public class CheckNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Length : ");
		Scanner sc=new Scanner(System.in);
		int arrayLength=sc.nextInt();
		int ar[]=new int[arrayLength];
		
		for(int i=0;i<arrayLength;i++) {
			ar[i]=sc.nextInt();
		}
		
		System.out.print("Array Elements :");
		for(int i=0;i<arrayLength;i++) {
			System.out.print(" "+ar[i]);
		}
		System.out.println();
		
		System.out.print("Enter the number to be Checked : ");
		int findElement=sc.nextInt();
		
		int count=0;
		for(int i=0;i<arrayLength;i++) {
			if(ar[i]==findElement) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
	
	}

}
