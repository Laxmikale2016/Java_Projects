package Assingment1;

import java.util.Scanner;

public class Book {
	int bookid;
	String bookName;
	double price;
	 Book(int bookid,String bookName,double price){
		 this.bookid=bookid;
		 this.bookName=bookName;
		 this.price=price;
	 }
	 void display() {
		 System.out.println(bookid+"\t"+bookName+"\t"+price);
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book[] b=new Book[5];
		for(int i=0;i<5;i++) {
			System.out.println("enter details of book"+(i+1));
			System.out.println("Book id:");
			int id =sc.nextInt();
			System.out.println("Book name:");
			String name=sc.next();
			System.out.println("price:");
			double price=sc.nextDouble();
			 b[i]=new Book(id,name,price);
		}
		System.out.println("\n id\t name\t price");
		  for(int i=0;i<5;i++) {
			  b[i].display();
		  }
		  sc.close();
	}

}
