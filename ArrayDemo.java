package Alfiza;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[]args){
		Scanner sc= new Scanner (System.in);
		System.out.print("enter size of arry:");
		int n=sc.nextInt();
		int[]a=new int[n];
		int sum=0;
		System.out.println("enter elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum="+sum);
		Arrays.sort(a);
		System.out.println("Ascending order:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+"");
		}
		
	 sc.close();
	}

}
