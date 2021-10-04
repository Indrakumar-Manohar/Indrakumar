import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int elements=sc.nextInt();
		int arr[]=new int[elements];
		for(int i=0;i<elements;i++) {
			arr[i]=sc.nextInt();
		}System.out.println();
		
		
		
		System.out.print("Orginal Array Elements :");
		for(int i=0;i<elements;i++) {
			System.out.print(" "+arr[i]);
		}System.out.println();
		
		
		
		System.out.print("Reversed Array Elements :");
		int rev[]= new int[elements];
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			rev[count]=arr[i];
			System.out.print(" "+rev[count]); 
			count++;
		
		}
	}

}
