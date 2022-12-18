package java_course;

import java.util.Scanner;

public class multiplication_Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int number;
		 System.out.println("Enter number to generate multiplication table ");
		 number=sc.nextInt();
		 for(int i=1; i<10; i++) {
			 System.out.println(number + " * " + i + " = " + number*i);
		 }

	}

}
