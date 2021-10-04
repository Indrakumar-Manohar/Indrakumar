import java.util.Scanner;

public class CheckInputType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Total Numbers : ");
		int value=sc.nextInt();
		System.out.println("Enter the values : ");
		int arr[]=new int[value];
		for(int i=0;i<value;i++) {
			arr[i]=sc.nextInt();
		}System.out.println();
		
		System.out.print("Numbers present in Array : ");
		for(int i=0;i<value;i++) {
			System.out.print("\t"+arr[i]);
		}System.out.println();
		
		int positiveNum=0;
		int negativeNum=0;
		int evenNum=0;
		int oddNum=0;
		int zeroNum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positiveNum++;
			}
			if(arr[i]<0) {
				negativeNum++;
			}
			if(arr[i]%2==0) {
				evenNum++;
			}
			if(arr[i]%2!=0) {
				oddNum++;
			}
			if(arr[i]==0) {
				zeroNum++;
			}
		}
		System.out.println("Number of positive Integers : "+positiveNum);
		System.out.println("Number of negative Integers : "+negativeNum);
		System.out.println("Number of Even Integers : "+evenNum);
		System.out.println("Number of Odd Integers : "+oddNum);
		System.out.println("Number of Zero Integers : "+zeroNum);
	}

}
